package fatec.poo.model;

public class Pessoa {

    private int Numero;
    private String Nome;
    private String DataNasc;
    private String Endereco;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private String CEP;
    private String Telefone;
    private String Celular;
    private String Sexo;
    private String EstadoCivil;
    private String RG;
    private String CPF;
    private String Email;
    
    Pessoa( String cpf, String nome){
        this.Nome = nome;
        this.CPF = cpf;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setDataNasc(String DataNasc) {
        this.DataNasc = DataNasc;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }   
    
}