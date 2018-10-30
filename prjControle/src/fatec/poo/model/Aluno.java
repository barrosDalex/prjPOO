package fatec.poo.model;

public class Aluno extends Pessoa{

    private String Escolaridade;
    private Matricula matricula;
    
    Aluno( String cpf, String nome){
        super(cpf, nome);
    }

    public void setEscolaridade(String Escolaridade) {
        this.Escolaridade = Escolaridade;
    }
    
    public void addMatricula(Matricula m){
        this.matricula = m;
        m.setAluno(this);
    }
                   
    public void setMatricula(Matricula m){
        this.matricula = m;
    }
}
