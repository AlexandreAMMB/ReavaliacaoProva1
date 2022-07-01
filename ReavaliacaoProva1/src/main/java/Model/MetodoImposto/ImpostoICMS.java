package Model.MetodoImposto;

import Model.Pedido;

public class ImpostoICMS implements IMetodoImposto{

    @Override
    public double calcularImposto(Pedido pedido) {
        return pedido.getValorTotal() * 0.07;
    }

    @Override
    public String toString() {
        return "ICMS";
    }
}
