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
public class Matricula {
    private String Data;
    private int QtdeFaltas;
    private double Nota;
    private Aluno aluno;

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public int getQtdeFaltas() {
        return QtdeFaltas;
    }

    public void setQtdeFaltas(int QtdeFaltas) {
        this.QtdeFaltas = QtdeFaltas;
    }

    public double getNota() {
        return Nota;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }


}
