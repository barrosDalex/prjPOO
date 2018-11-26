package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Pessoa;
import fatec.poo.model.Instrutor;

public class DaoInstrutor {
    private Connection conn;
    
    public DaoInstrutor(Connection conn){
        this.conn = conn;
    }
    
    public void inserir(Pessoa pessoa, Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_Pessoa VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getDataNasc());
            ps.setString(3, pessoa.getEndereco());
            ps.setString(4, Integer.toString(pessoa.getNumero()));
            ps.setString(5, pessoa.getBairro());
            ps.setString(6, pessoa.getCidade());
            ps.setString(7, pessoa.getEstado());
            ps.setString(8, pessoa.getCEP());
            ps.setString(9, pessoa.getTelefone());
            ps.setString(10, pessoa.getCelular());
            ps.setString(11, pessoa.getSexo());
            ps.setString(12, pessoa.getEstadoCivil());
            ps.setString(13, pessoa.getRG());
            ps.setString(14, pessoa.getCPF());
            ps.setString(15, pessoa.getEmail());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());
        }
             
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
    
    public void alterar(Pessoa pessoa, Instrutor instrutor) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbdepartamento set Nome_Dep = ?" +
                                                 "where Sigla_Dep = ?");
            
            ps.setString(1, departamento.getNome());
            ps.setString(2, departamento.getSigla());
           
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
}
