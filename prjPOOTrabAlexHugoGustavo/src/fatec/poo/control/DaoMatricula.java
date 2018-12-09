package fatec.poo.control;

import fatec.poo.model.Aluno;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Matricula;
import fatec.poo.model.Turma;

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
            ps.setDouble(3, matricula.getNota());
            ps.setString(4, matricula.getTurma().getSiglaTurma());
            ps.setInt(5, matricula.getQtdeFaltas());

            
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
        Aluno a = null;
        Turma t = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tb_Matricula WHERE cpf = ?");
            ps.setString(1, cpf);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next() == true){
                a = new DaoAluno(conn).Consultar( rs.getString("cpf"));
                m = new Matricula();
                t = new DaoTurma(conn).consultar(cpf);
                m.setAluno(a);
                m.setData(rs.getString(2));
                m.setNota(Double.parseDouble(rs.getString(3)));
                m.setTurma(t);
                m.setQtdeFaltas(Integer.parseInt(rs.getString(5)));
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
