package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;

import fatec.poo.model.APrazo;

public class DaoAPrazo {
    private Connection conn;
    
    public DaoAPrazo(Connection conn){
        this.conn = conn;
    }
    
    public void inserir(APrazo aprazo){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("INSERT INTO tb_APrazo VALUES(?,?,?,?,?)");
            
            ps.setString(1, aprazo.getMatricula().getAluno().getCPF());
            ps.setString(2, Double.toString(aprazo.getValor()));
            ps.setString(3, aprazo.getDtVencimento());
            ps.setString(4, Double.toString(aprazo.getTaxaJuros()));
            ps.setString(5, Integer.toString(aprazo.getQtdeMensalidade()));
            
            ps.execute();
        } catch (SQLException ex) {
          System.out.println(ex.toString());
        }
    }
    
    public void alterar(APrazo aprazo){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tb_APrazo SET valor = ?," +
                                                            "dtVencimento = ?," +
                                                            "taxaJuros = ?," +
                                                            "qtdeMensalidade = ?" +
                                                            "WHERE cpfMatricula = ?");
            
            ps.setString(1, Double.toString(aprazo.getValor()));
            ps.setString(2, aprazo.getDtVencimento());
            ps.setString(3, Double.toString(aprazo.getTaxaJuros()));
            ps.setString(4, Integer.toString(aprazo.getQtdeMensalidade()));
            ps.setString(5, aprazo.getMatricula().getAluno().getCPF());
            
            ps.execute();
        } catch (SQLException ex) {
          System.out.println(ex.toString());
        }
    }
    
    public APrazo consultar(String cpf){
        APrazo ap = null;
        PreparedStatement ps = null;
        
        try{
            ps = conn.prepareStatement("SELECT * FROM tb_APrazo WHERE cpfMatricula = ?");
            ps.setString(1, cpf);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next() == true){
                ap = new APrazo();
                ap.setValor(Double.parseDouble(rs.getString(2)));
                ap.setDtVencimento(rs.getString(3));
                ap.setTaxaJuros(Double.parseDouble(rs.getString(4)));
                ap.setQtdeMensalidade(Integer.parseInt(rs.getString(5)));
            }
            
        } catch (SQLException ex) {
          System.out.println(ex.toString());
        }
        
        return ap;
    }
    
    public void excluir(APrazo aprazo){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tb_APrazo WHERE cpfMatricula = ?");
            ps.setString(1, aprazo.getMatricula().getAluno().getCPF());
            
            ps.execute();
        } catch (SQLException ex) {
          System.out.println(ex.toString());
        }
    }
}
