package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Matricula;

public class DaoMatricula {
    private Connection conn;
    
    public DaoMatricula(Connection conn){
        this.conn = conn;
    }
    
    public void inserir(Matricula matricula){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_Matricula VALUES(?,?,?,?,?)");
            
            ps.setString(1, matricula.getAluno().getCPF());
            ps.setString(2, matricula.getData());
            ps.setString(3, Double.toString(matricula.getNota()));
            ps.setString(4, Integer.toString(matricula.getQtdeFaltas()));
            ps.setString(5, matricula.getTurma().getSiglaTurma());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Matricula matricula){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tb_Matricula SET dtMatricula = ?," +
                                                                "nota = ?," +
                                                                "qtdeFaltas  = ?," +
                                                                "siglaTurma = ? WHERE cpf = ?");
            
            ps.setString(1, matricula.getData());
            ps.setString(2, Double.toString(matricula.getNota()));
            ps.setString(3, Integer.toString(matricula.getQtdeFaltas()));
            ps.setString(3, matricula.getTurma().getSiglaTurma());
            ps.setString(4, matricula.getAluno().getCPF());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public Matricula consultar(String cpf){
        Matricula m = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tb_Matricula WHERE cpf = ?");
            ps.setString(1, cpf);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next() == true){
                m = new Matricula();
                m.setData(rs.getString(2));
                m.setNota(Double.parseDouble(rs.getString(3)));
                m.setQtdeFaltas(Integer.parseInt(rs.getString(4)));
            }
            
        } catch (SQLException ex){
            System.out.println(ex.toString());
        }
        
        return m;
    }
    
    public void excluir(Matricula matricula){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_Matricula WHERE cpf = ?");
            ps.setString(1, matricula.getAluno().getCPF());
            
            ps.execute();
        } catch (SQLException ex){
            System.out.println(ex.toString());
        }
    }
}
