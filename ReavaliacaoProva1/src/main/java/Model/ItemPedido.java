package Model;

public class ItemPedido {
    private Produto produto;
    private int qtePedido;
    private double valorUnitario;
    private double valorTotal;
    
    public ItemPedido(int qtePedido, double valorUnitario, Produto produto){
        this.qtePedido = qtePedido;
        this.valorUnitario = valorUnitario;
        this.calcularValorTotal();
        this.produto = produto;
    }
    
    public void calcularValorTotal(){
        this.valorTotal = qtePedido * valorUnitario;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQtePedido() {
        return qtePedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
