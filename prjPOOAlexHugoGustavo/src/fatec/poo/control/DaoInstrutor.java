package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.control.DaoInstrutor;
import fatec.poo.model.Instrutor;

public class DaoInstrutor {
    private Connection conn;
    
    public DaoInstrutor(Connection conn){
        this.conn = conn;
    }
    
    public void inserir(Instrutor instrutor) {
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("INSERT INTO tb_Instrutor VALUES(?,?,?)");
            ps.setString(1, instrutor.getCPF());
            ps.setString(2, instrutor.getFormacao());
            ps.setString(3, instrutor.getAreaAtuacao());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());
        }
    }
    
    public void alterar(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tb_Instrutor SET formacao = ?," +
                                                "SET areaAtuacao = ?" +
                                                 "where cpf = ?");
            
            ps.setString(1, instrutor.getFormacao());
            ps.setString(2, instrutor.getAreaAtuacao());
            ps.setString(3, instrutor.getCPF());
           
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public Instrutor consultar(String cpf) {
        Instrutor i = null;
        PreparedStatement ps = null;
        
        try {
        ps = conn.prepareStatement("SELECT nome, formacao, areaAtuacao FROM tb_Pessoa, tb_Instrutor WHERE tb_Pessoa.cpf = tb_Instrutor.cpf AND tb_Pessoa.cpf = ?");
        ps.setString(1, cpf);
        ResultSet rs = ps.executeQuery();
            System.out.println("cpf: "+cpf);
        if (rs.next() == true){
            i = new Instrutor(cpf, rs.getString(1));
            i.setFormacao(rs.getString(2));
            i.setAreaAtuacao(rs.getString(3));
        }
        
        } catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        
        return i;
    }
    
    public void excluir(Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_Instrutor WHERE cpf = ?");
            
            ps.setString(1, instrutor.getCPF());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
