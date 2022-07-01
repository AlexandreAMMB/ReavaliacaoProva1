package Model;

public class Produto {
    private String nome;
    private double precoUnitario;
    private int qteEstoque;
    private String categoria;
    
    public Produto(String nome, double precoUnitario, int qteEstoque, String categoria){
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.qteEstoque = qteEstoque;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQteEstoque() {
        return qteEstoque;
    }

    public String getCategoria() {
        return categoria;
    }
}
