/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.models;

/**
 *
 * @author Gustavo
 */
public class APrazo {
    private double Valor;
    private String DtVencimento;
    private double TaxaJuros;
    private int QtdeMensalidade;

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public String getDtVencimento() {
        return DtVencimento;
    }

    public void setDtVencimento(String DtVencimento) {
        this.DtVencimento = DtVencimento;
    }

    public double getTaxaJuros() {
        return TaxaJuros;
    }

    public void setTaxaJuros(double TaxaJuros) {
        this.TaxaJuros = TaxaJuros;
    }

    public int getQtdeMensalidade() {
        return QtdeMensalidade;
    }

    public void setQtdeMensalidade(int QtdeMensalidade) {
        this.QtdeMensalidade = QtdeMensalidade;
    }
    
    
}
