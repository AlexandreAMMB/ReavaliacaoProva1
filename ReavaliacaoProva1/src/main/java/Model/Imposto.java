package Model;

public class Imposto {
    private String tipo;
    private double valor;
    
    public Imposto(String tipo, double valor){
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
