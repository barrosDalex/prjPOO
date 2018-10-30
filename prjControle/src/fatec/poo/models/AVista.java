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
public class AVista {
    private double Valor;
    private int Agencia;
    private int NCheque;       
    private String PreData;
    private Matricula matricula;

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public int getAgencia() {
        return Agencia;
    }

    public void setAgencia(int Agencia) {
        this.Agencia = Agencia;
    }

    public int getNCheque() {
        return NCheque;
    }

    public void setNCheque(int NCheque) {
        this.NCheque = NCheque;
    }

    public String getPreData() {
        return PreData;
    }

    public void setPreData(String PreData) {
        this.PreData = PreData;
    }
    
    public void addMatricula(Matricula m){
        this.matricula = m;
    }
}
