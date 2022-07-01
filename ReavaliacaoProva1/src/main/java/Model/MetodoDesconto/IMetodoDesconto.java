package Model.MetodoDesconto;

import Model.Pedido;

public interface IMetodoDesconto {
    public double calcularDesconto(Pedido pedido);
}
