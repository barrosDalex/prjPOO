package fatec.poo.models;

public class Aluno extends Pessoa{

    private String Escolaridade;
    
    Aluno( String cpf, String nome){
        super(cpf, nome);
    }

    public void setEscolaridade(String Escolaridade) {
        this.Escolaridade = Escolaridade;
    }
             
       
}
