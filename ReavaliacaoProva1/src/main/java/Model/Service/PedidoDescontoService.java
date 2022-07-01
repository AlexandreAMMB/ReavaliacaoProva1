package Model.Service;

import Model.Desconto;
import Model.MetodoDesconto.PapelariaDesconto;
import Model.MetodoDesconto.NatalDesconto;
import Model.MetodoDesconto.LapisDesconto;
import Model.MetodoDesconto.IMetodoDesconto;
import Model.Pedido;
import java.util.ArrayList;

public class PedidoDescontoService {
    private ArrayList<IMetodoDesconto> metodosDesconto;
    
    public PedidoDescontoService(){
        metodosDesconto = new ArrayList<>();
        metodosDesconto.add(new LapisDesconto());
        metodosDesconto.add(new PapelariaDesconto());
        metodosDesconto.add(new NatalDesconto());
    }
    
    public void processarDesconto(Pedido pedido){
        for(IMetodoDesconto metodoDesconto : metodosDesconto){
            double valor = 0.0;
            if(valor != 0.0)
                valor = metodoDesconto.calcularDesconto(pedido);
                pedido.getDescontosConcedidos().add(
                        new Desconto(metodoDesconto.toString(), valor));
        }
    }
}
