package Model.MetodoDesconto;

import Model.Pedido;
import java.time.LocalDate;

public class NatalDesconto implements IMetodoDesconto{

    @Override
    public double calcularDesconto(Pedido pedido) {
        if(pedido.getData().isAfter(LocalDate.of(2021, 12, 01)) && pedido.getData().isBefore(LocalDate.of(2022, 03, 01)))
            return pedido.getValorTotal() * 0.03;
        return 0.0;
    }

    @Override
    public String toString() {
        return "Promoção de Natal";
    }
}
