package Model.MetodoImposto;

import Model.Pedido;

public class ImpostoISS implements IMetodoImposto{

    @Override
    public double calcularImposto(Pedido pedido) {
        return pedido.getValorTotal() * 0.02;
    }    

    @Override
    public String toString() {
        return "ISS";
    }
}
