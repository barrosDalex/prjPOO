package fatec.poo.models;

public class Instrutor extends Pessoa{
    
    private String Formacao;
    private String AreaAtuacao;
    
    public Instrutor(String cpf, String nome) {
        super(cpf, nome);
    }

    public void setFormacao(String Formacao) {
        this.Formacao = Formacao;
    }

    public void setAreaAtuacao(String AreaAtuacao) {
        this.AreaAtuacao = AreaAtuacao;
    }
    
}
