package fatec.poo.model;

public class Matricula {
    private String Data;
    private int QtdeFaltas;
    private double Nota;
    private Aluno aluno;
    private Turma turma;
    
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

    public void addAluno(Aluno a){
        this.aluno = a;
        a.setMatricula(this);
    }
    
    public void setAluno(Aluno a){
        this.aluno = a;
    }
    
    public void setTurma(Turma t){
        this.turma = t;
    }
    
    public void addTurma(Turma t){
        this.turma = t;
        t.setMatricula(this);
    }
    
    public void EmitirCarne(){
        //Não implementar neste trabalho
    }

    public Aluno getAluno() {
        return aluno;
    }
}
