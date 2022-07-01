package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    private String nomeCliente;
    private LocalDate data;
    private double valorTotal;
    private double valorCompra;
    private ArrayList<ItemPedido> itens;
    private ArrayList<Desconto> descontosConcedidos;
    private ArrayList<Imposto> impostosAplicados;
    
    public Pedido(String nomeCliente, LocalDate data){
        this.nomeCliente = nomeCliente;
        this.data = data;
        itens = new ArrayList<>();
        descontosConcedidos = new ArrayList<>();
        impostosAplicados = new ArrayList<>();
    }
    
    public void calcularValorTotal(){
        double valor = 0.0;
        for(ItemPedido item : itens){
            valor += item.getValorTotal();
        }
        valorTotal = valor;
    }
    
    public void calcularValorCompra(){
        double valor = 0.0;
        for(Desconto desconto : descontosConcedidos){
            valor -= desconto.getValor();
        }
        for(Imposto imposto : impostosAplicados){
            valor += imposto.getValor();
        }
        valorCompra = valor + valorTotal;
    }
    
    public void addItemPedido(ItemPedido item){
        itens.add(item);
        this.calcularValorTotal();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public LocalDate getData() {
        return data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public ArrayList<Desconto> getDescontosConcedidos() {
        return descontosConcedidos;
    }

    public ArrayList<Imposto> getImpostosAplicados() {
        return impostosAplicados;
    }
}
