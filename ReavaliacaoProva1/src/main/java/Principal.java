import Model.ItemPedido;
import Model.Pedido;
import Model.Produto;
import Model.Service.PedidoDescontoService;
import Model.Service.PedidoImpostoService;
import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        Produto lapis = new Produto("Lápis", 2.0, 100, "Papelaria");
        Produto lampada = new Produto("Lâmpada", 20.0, 100, "Casa");
        
        ItemPedido item1 = new ItemPedido(3, 3.0, lapis);
        ItemPedido item2 = new ItemPedido(3, 15, lampada);
        
        Pedido pedido = new Pedido("João", LocalDate.now());
        
        System.out.println(pedido.getValorTotal());
        pedido.addItemPedido(item1);
        System.out.println(pedido.getValorTotal());
        pedido.addItemPedido(item2);
        System.out.println(pedido.getValorTotal());
        
        PedidoDescontoService descontoService = new PedidoDescontoService();
        PedidoImpostoService impostoService = new PedidoImpostoService();
        
        descontoService.processarDesconto(pedido);
        impostoService.processarImposto(pedido);
        
        pedido.calcularValorCompra();
        System.out.println(pedido.getValorCompra());
    }
    
}
