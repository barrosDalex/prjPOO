package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.Aluno;
import fatec.poo.model.Pessoa;
/**
 * @author Gustavo
 */
public class DaoAluno {
    
    private Connection conn;
    
    public DaoAluno(Connection conn){
        this.conn = conn;
    }
    
    public void Inserir(Pessoa pessoa, Aluno aluno){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_Pessoa(Nome, DataNasc, Endereco, Numero, Bairro,"
                + " Cidade, Estado, CEP, Telefone, Celular, Sexo, Estado, EstadoCivil, RG, CPF, Email) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
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
            ps.setString(12, pessoa.getEstado());
            ps.setString(13, pessoa.getEstadoCivil());
            ps.setString(14, pessoa.getRG());
            ps.setString(15, pessoa.getCPF());
            ps.setString(16, pessoa.getEmail());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());   
        }
        try {
            ps = conn.prepareStatement("INSERT INTO tb_Aluno(CPFAluno, Escolaridade) VALUES(?,?)");          
            ps.setString(1, aluno.getCPF());
            ps.setString(2, aluno.getEscolaridade());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());   
        }
    }
    
    public Pessoa consultarPessoa(String cpf){
        Pessoa p = null;
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("SELECT * FROM tb_Pessoa where cpf = ?");
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next() == true){
                p = new Pessoa (cpf, rs.getString(1));
                p.setDataNasc(rs.getString(2));
                p.setEndereco(rs.getString(3));
                p.setNumero(rs.getInt(4));
                p.setBairro(rs.getString(5));
                p.setCidade(rs.getString(6));
                p.setEstado(rs.getString(7));
                p.setCEP(rs.getString(8));
                p.setTelefone(rs.getString(9));
                p.setCelular(rs.getString(10));
                p.setSexo(rs.getString(11));
                p.setEstadoCivil(rs.getString(12));
                p.setRG(rs.getString(13));
                p.setEmail(rs.getString(15));
            }
        } catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        
        return p;
    }
    
    public void Excluir(String cpf){
        PreparedStatement ps = null;
        
        try {
            ps = conn.prepareStatement("DELETE FROM tb_Aluno where CPFAluno = ?");
            
            ps.setString(1, cpf);
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());   
        }
        try {
            ps = conn.prepareStatement("DELEE FROM tb_Pessoa where cpf = ?");
            
            ps.setString(1, cpf);
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
    }
}
