package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.AVista;

public class DaoAVista {
    private Connection conn;
    
    public DaoAVista(Connection conn){
        this.conn = conn;
    }
    
    public void inserir(AVista avista){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tb_AVista VALUES(?,?,?,?,?)");
            
            ps.setString(1, avista.getMatricula().getAluno().getCPF());
            ps.setString(2, Double.toString(avista.getValor()));
            ps.setString(3, Integer.toString(avista.getAgencia()));
            ps.setString(4, Integer.toString(avista.getNCheque()));
            ps.setString(5, avista.getPreData());
         
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(AVista avista){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tb_AVista SET valor = ?," +
                                                            "agencia = ?," +
                                                            "nCheque = ?," +
                                                            "preDt = ?" +
                                                            "WHERE cpfMatricula = ?");
            
            ps.setString(1, Double.toString(avista.getValor()));
            ps.setString(2, Integer.toString(avista.getAgencia()));
            ps.setString(3, Integer.toString(avista.getNCheque()));
            ps.setString(4, avista.getPreData());
            ps.setString(5, avista.getMatricula().getAluno().getCPF());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public AVista consultar(String cpf){
        PreparedStatement ps = null;
        AVista av = null;
        
        try{
            ps = conn.prepareStatement("SELECT * FROM tb_Avista WHERE cpfMatricula = ?");
            ps.setString(1, cpf);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next() == true){
                av = new AVista();
                av.setValor(Double.parseDouble(rs.getString(2)));
                av.setAgencia(Integer.parseInt(rs.getString(3)));
                av.setNCheque(Integer.parseInt(rs.getString(4)));
                av.setPreData(rs.getString(5));
            }
            
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
        
        return av;
    }
    
    public void excluir(AVista avista){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_AVista WHERE codAvista = ?");
            ps.setString(1, avista.getMatricula().getAluno().getCPF());
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
