package fatec.poo.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import fatec.poo.model.Curso;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DaoCurso {

    private Connection conn;
    
    ArrayList<String> cursos = new ArrayList();    

    public DaoCurso(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_Curso( siglaCurso, nome, cargaHoraria, valor, dtVigencia, valorHoraInstrutor, programa) VALUES(?,?,?,?,?,?,?)");

            ps.setString(1, curso.getSigla());
            ps.setString(2, curso.getNome());
            ps.setString(3, Integer.toString( curso.getCargaHoraria()));
            ps.setString(4, Double.toString(curso.getValor()));
            ps.setString(5, curso.getDataVigencia());
            ps.setString(6, Double.toString( curso.getValorHoraInstrutor()));
            ps.setString(7, curso.getPrograma());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tb_Curso set nome = ?, " + "cargaHoraria = ?, "
                    + "valor = ?, " + "dtVigencia = ?, " + "valorHoraInstrutor = ?, " + "programa = ?"
                    + "where  siglaCurso = ?");

            ps.setString(1, curso.getNome());
            ps.setString(2, Integer.toString(curso.getCargaHoraria()));
            ps.setString(3, Double.toString(curso.getValor()));
            ps.setString(4, curso.getDataVigencia());
            ps.setString(5, Double.toString( curso.getValorHoraInstrutor()));
            ps.setString(6, curso.getPrograma());
            ps.setString(7, curso.getSigla());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public Curso consultar(String sigla) {
        Curso c = null;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tb_Curso where "
                    + "siglaCurso = ?");

            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();

            if (rs.next() == true) {
                c = new Curso(sigla, rs.getString("nome"));
                c.setCargaHoraria( rs.getInt("cargaHoraria"));
                c.setValor(rs.getDouble("valor"));
                c.setDataVigencia(rs.getString("dtVigencia"));
                c.setValorHoraInstrutor(rs.getDouble("valorHoraInstrutor"));
                c.setPrograma(rs.getString("programa"));
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (c);
    }

    public void excluir(Curso curso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_Curso where siglaCurso = ?");

            ps.setString(1, curso.getSigla());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public ArrayList<String> ListarSiglas(){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("SELECT * from tb_Curso");
            
            ResultSet rs = ps.executeQuery();
            
                while (rs.next()){
                 cursos.add(rs.getString("siglaCurso"));
                }            
        }
        catch (SQLException ex){
            System.out.println(ex.toString());
        }
                
        return cursos;        
    }

}
