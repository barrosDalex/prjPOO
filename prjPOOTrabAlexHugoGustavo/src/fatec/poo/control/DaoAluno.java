package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Aluno;

public class DaoAluno {
    private Connection conn;
    
    public DaoAluno(Connection conn){
        this.conn = conn;
    }
    
    public void Inserir(Aluno aluno){
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("INSERT INTO tb_Aluno(CPF, Escolaridade) VALUES(?,?)");          
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
            ps = conn.prepareStatement("UPDATE tb_Aluno SET escolaridade = ? WHERE cpf = ?");
            ps.setString(1, aluno.getEscolaridade());
            ps.setString(2, aluno.getCPF());
            ps.execute();
        }catch (SQLException ex){
            System.out.println(ex.toString());
        }
}
    
    public Aluno Consultar(String cpf){
        Aluno a = null;
        PreparedStatement ps = null;
    
        try {
            ps = conn.prepareStatement("SELECT tb_Pessoa.Nome, tb_Aluno.Escolaridade FROM tb_Aluno, tb_Pessoa where tb_Pessoa.cpf = ?"
                + " and tb_Aluno.cpf = tb_Pessoa.cpf ");
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
        
            if (rs.next() == true){
                a = new Aluno(cpf, rs.getString(1));
                a.setEscolaridade(rs.getString(2));
            }
        
        
    } catch (SQLException ex){
        System.out.println(ex.toString());
    }
    return a;
}
    
    public void Excluir(Aluno aluno){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_Aluno WHERE CPF = ?");
            
            ps.setString(1, aluno.getCPF());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
}