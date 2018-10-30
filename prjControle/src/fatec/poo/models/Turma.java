/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.models;

import java.util.ArrayList;

/**
 *
 * @author Hugo
 */
public class Turma {
    private String SiglaTurma;
    private String Descricao;
    private String DataInicio;
    private String DataTermino;
    private String Periodo;
    private int QtdVagas;
    private String Observacoes;
    private Curso Curso;
    private Instrutor instrutor;
    private ArrayList<Matricula> Matriculas;

    public Turma(String SiglaTurma, String Descricao) {
        this.SiglaTurma = SiglaTurma;
        this.Descricao = Descricao;
        Matriculas = new ArrayList<Matricula>();
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public void setDataInicio(String DataInicio) {
        this.DataInicio = DataInicio;
    }

    public void setDataTermino(String DataTermino) {
        this.DataTermino = DataTermino;
    }

    public void setPeriodo(String Periodo) {
        this.Periodo = Periodo;
    }

    public void setQtdVagas(int QtdVagas) {
        this.QtdVagas = QtdVagas;
    }

    public void setObservacoes(String Observacoes) {
        this.Observacoes = Observacoes;
    }
      
    public void emitirListaFrequencia(){
        //Não implementar nesse trabalho
    }

    public void setCurso(Curso C) {
        this.Curso = C;
    }
    
    public void setInstrutor(Instrutor I){
        this.instrutor = I;
    }
    
    public void addMatricula(Matricula m){
        Matriculas.add(m);
        m.setTurma(this);
    }
}
