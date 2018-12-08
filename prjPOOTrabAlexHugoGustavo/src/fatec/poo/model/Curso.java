package fatec.poo.model;

import java.util.ArrayList;

public class Curso {

    /**
     * @return the Sigla
     */
    public String getSigla() {
        return Sigla;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @return the CargaHoraria
     */
    public int getCargaHoraria() {
        return CargaHoraria;
    }

    /**
     * @return the Valor
     */
    public double getValor() {
        return Valor;
    }

    /**
     * @return the DataVigencia
     */
    public String getDataVigencia() {
        return DataVigencia;
    }

    /**
     * @return the ValorHoraInstrutor
     */
    public double getValorHoraInstrutor() {
        return ValorHoraInstrutor;
    }

    /**
     * @return the Programa
     */
    public String getPrograma() {
        return Programa;
    }

    /**
     * @return the Turmas
     */
    public ArrayList<Turma> getTurmas() {
        return Turmas;
    }
    private String Sigla;
    private String Nome;
    private int CargaHoraria;
    private double Valor;
    private String DataVigencia;
    private double ValorHoraInstrutor;
    private String Programa;
    private ArrayList<Turma> Turmas;

    public Curso(String Sigla, String Nome) {
        this.Sigla = Sigla;
        this.Nome = Nome;
        Turmas = new ArrayList<Turma>();
        
    }

    public void setCargaHoraria(int CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public void setDataVigencia(String DataVigencia) {
        this.DataVigencia = DataVigencia;
    }

    public void setValorHoraInstrutor(double ValorHoraInstrutor) {
        this.ValorHoraInstrutor = ValorHoraInstrutor;
    }

    public void setPrograma(String Programa) {
        this.Programa = Programa;
    }
    
    public void addTurma(Turma t){
        getTurmas().add(t);
        t.setCurso(this);
    }
    
    public void setTurma(Turma t){
        getTurmas().add(t);
    }
}
