package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Turma;

public class DaoTurma {
    
    private Connection conn;
    
    public DaoTurma(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_Turma(siglaTurma, dtInicio,"
                    + " dtTermino, periodo, qtdeVagas, observacoes, siglaCurso) "
                    + "VALUES(?,?,?,?,?,?,?)");
           
            ps.setString(1, turma.getSiglaTurma());
            ps.setString(2, turma.getDataInicio());
            ps.setString(3, turma.getDataTermino());
            ps.setString(4, turma.getPeriodo());
            ps.setString(5, Integer.toString( turma.getQtdVagas()) );
            ps.setString(6, turma.getObservacoes());
            ps.setString(7, turma.getCurso().getSigla() );
                       
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
        
    public void alterar(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tb_Turma set dtInicio = ?, " + 
                  " dtTermino = ?, " +  "periodo = ?, " + "qtdeVagas = ?, " +
             "observacoes = ?, " + "siglaCurso = ?" + "where siglaTurma = ?");

            ps.setString(1, turma.getDataInicio());
            ps.setString(2, turma.getDataTermino());
            ps.setString(3, turma.getPeriodo());
            ps.setString(4, Integer.toString( turma.getQtdVagas()) );
            ps.setString(5, turma.getObservacoes());
            ps.setString(6, turma.getCurso().getSigla() );    
            
        ps.execute();

        } 
        catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public  Turma consultar (String sigla) {
        Turma t = null;
       
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tb_Turma where " +
                                                 "siglaTurma = ?");
            
            ps.setString(1, sigla);
            
            
            
            ResultSet rs = ps.executeQuery();
           
            if (rs.next() == true) {
                t = new Turma (sigla, rs.getString("observacoes"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return (t);
    }
    
    public void excluir(Turma turma) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbdepartamento where siglaTurma = ?");
            
            ps.setString(1, turma.getSiglaTurma());
                      
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
  
}
