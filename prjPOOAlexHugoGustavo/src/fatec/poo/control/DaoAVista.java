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
            ps.setString(1, x);
            ps.setString(2, Double.toString(avista.getValor()));
            ps.setString(3, Integer.toString(avista.getAgencia()));
            ps.setString(4, Integer.toString(avista.getNCheque()));
            ps.setString(5, avista.getPreData());
         
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void excluir(AVista avista){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_AVista WHERE codAvista = ?");
            ps.setString(1, "???");
            
            ps.execute();
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
