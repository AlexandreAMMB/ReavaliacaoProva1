package Model.MetodoDesconto;

import Model.ItemPedido;
import Model.Pedido;

public class LapisDesconto implements IMetodoDesconto{

    @Override
    public double calcularDesconto(Pedido pedido) {
        for(ItemPedido item : pedido.getItens()){
            if(item.getProduto().getNome().equals("Lápis"))
                return pedido.getValorTotal() * 0.005;     
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "Desconto incentivo educação (Lápis)";
    }
}
