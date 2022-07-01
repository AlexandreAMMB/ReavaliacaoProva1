package Model.Service;

import Model.Imposto;
import Model.MetodoImposto.ImpostoISS;
import Model.MetodoImposto.ImpostoICMS;
import Model.MetodoImposto.IMetodoImposto;
import Model.Pedido;
import java.util.ArrayList;

public class PedidoImpostoService {
    private ArrayList<IMetodoImposto> metodosImposto;
    
    public PedidoImpostoService(){
        metodosImposto = new ArrayList<>();
        metodosImposto.add(new ImpostoISS());
        metodosImposto.add(new ImpostoICMS());
    }
    
    public void processarImposto(Pedido pedido){
        for(IMetodoImposto metodoImposto : metodosImposto){
            double valor = 0.0;
            valor = metodoImposto.calcularImposto(pedido);
            if(valor != 0.0)
                valor = metodoImposto.calcularImposto(pedido);
                pedido.getImpostosAplicados().add(
                        new Imposto(metodoImposto.toString(), valor));
        }
    }
}
