package fatec.poo.model;

import java.util.ArrayList;

public class Curso {
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
        Turmas.add(t);
        t.setCurso(this);
    }
    
    public void setTurma(Turma t){
        Turmas.add(t);
    }
}
