package Model.MetodoDesconto;

import Model.ItemPedido;
import Model.Pedido;

public class PapelariaDesconto implements IMetodoDesconto{
    @Override
    public double calcularDesconto(Pedido pedido) {
        for(ItemPedido item : pedido.getItens()){
            if(item.getProduto().getCategoria().equals("Papelaria"))
                return pedido.getValorTotal() * 0.01;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "Desconto por tipo de produto (Papelaria)";
    }
}
