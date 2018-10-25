package fatec.poo.models;

import java.util.ArrayList;

public class Instrutor extends Pessoa{

    private String Formacao;
    private String AreaAtuacao;
    private ArrayList<Turma> turmas;
    
    
    
    public Instrutor(String cpf, String nome) {
        super(cpf, nome);
        turmas = new ArrayList<Turma>();
    }

    public void setFormacao(String Formacao) {
        this.Formacao = Formacao;
    }

    public void setAreaAtuacao(String AreaAtuacao) {
        this.AreaAtuacao = AreaAtuacao;
    }
    
}
