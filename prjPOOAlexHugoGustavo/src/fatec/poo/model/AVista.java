package fatec.poo.model;

public class AVista {
    private double Valor;
    private int Agencia;
    private int NCheque;       
    private String PreData;
    private Matricula matricula;

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public int getAgencia() {
        return Agencia;
    }

    public void setAgencia(int Agencia) {
        this.Agencia = Agencia;
    }

    public int getNCheque() {
        return NCheque;
    }

    public void setNCheque(int NCheque) {
        this.NCheque = NCheque;
    }

    public String getPreData() {
        return PreData;
    }

    public void setPreData(String PreData) {
        this.PreData = PreData;
    }
    
    public void setMatricula(Matricula m){
        this.matricula = m;
    }
    
    public Matricula getMatricula(){
        return matricula;
    }
}
