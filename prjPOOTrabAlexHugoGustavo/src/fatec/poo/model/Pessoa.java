package fatec.poo.model;

public class Pessoa {

    private String Nome;
    private String DataNasc;
    private String Endereco;
    private int Numero;
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
    
    public Pessoa( String cpf, String nome){
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

    public int getNumero() {
        return Numero;
    }

    public String getNome() {
        return Nome;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public String getEndereco() {
        return Endereco;
    }

    public String getBairro() {
        return Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public String getCEP() {
        return CEP;
    }

    public String getTelefone() {
        return Telefone;
    }

    public String getCelular() {
        return Celular;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public String getRG() {
        return RG;
    }

    public String getCPF() {
        return CPF;
    }

    public String getEmail() {
        return Email;
    }
}