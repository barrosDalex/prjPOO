package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Aluno;
import fatec.poo.control.DaoAluno;
/**
 * @author Gustavo
 */
public class DaoAluno {
    
    private Connection conn;
    
    public DaoAluno(Connection conn){
        this.conn = conn;
    }
    
    public void Inserir(Aluno aluno){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_Aluno(CPFAluno, Escolaridade) VALUES(?,?)");          
            ps.setString(1, aluno.getCPF());
            ps.setString(2, aluno.getEscolaridade());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void Alterar(Aluno aluno){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tb_Aluno SET Escolaridade = ?"
                    + "WHERE cpfAluno = ?");
            ps.setString(1, aluno.getEscolaridade());
            ps.setString(2, aluno.getCPF().replaceAll("[.,-]",""));
            
        }catch (SQLException ex){
            System.out.println(ex.toString());
        }
}
    
    public Aluno Consultar(String cpf){
    
    Aluno a = null;
    PreparedStatement ps = null;
    
    try {
        ps = conn.prepareStatement("SELECT cpfAluno, Nome, Escolaridade FROM tb_Aluno, tb_Pessoa where cpf = ?"
                + " and cpfAluno = cpf ");
        ps.setString(1, cpf);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next() == true){
            a = new Aluno(cpf, rs.getString(2));
            a.setEscolaridade(rs.getString(3));
        }
        
        
    } catch (SQLException ex){
        System.out.println(ex.toString());
    }
    return a;
}
    
    public void Excluir(String cpf){
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("DELETE FROM tb_Aluno where CPFAluno = ?");
            
            ps.setString(1, cpf.replaceAll("[.,-]", ""));
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
