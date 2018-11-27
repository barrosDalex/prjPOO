/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Hugo
 */
public class Turma {

    /**
     * @return the SiglaTurma
     */
    public String getSiglaTurma() {
        return SiglaTurma;
    }

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @return the DataInicio
     */
    public String getDataInicio() {
        return DataInicio;
    }

    /**
     * @return the DataTermino
     */
    public String getDataTermino() {
        return DataTermino;
    }

    /**
     * @return the Periodo
     */
    public String getPeriodo() {
        return Periodo;
    }

    /**
     * @return the QtdVagas
     */
    public int getQtdVagas() {
        return QtdVagas;
    }

    /**
     * @return the Observacoes
     */
    public String getObservacoes() {
        return Observacoes;
    }

    /**
     * @return the Curso
     */
    public Curso getCurso() {
        return Curso;
    }

    /**
     * @return the instrutor
     */
    public Instrutor getInstrutor() {
        return instrutor;
    }

    /**
     * @return the Matriculas
     */
    public ArrayList<Matricula> getMatriculas() {
        return Matriculas;
    }
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
    
    public void setMatricula(Matricula m){
        getMatriculas().add(m);
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
        getMatriculas().add(m);
        m.setTurma(this);
    }
    
    public void addInstrutor(Instrutor I){
        this.instrutor = I;
        I.setTurma(this);
    }
    
    public void addCurso(Curso c){
        this.Curso = c;
        c.setTurma(this);
    }
    
}
