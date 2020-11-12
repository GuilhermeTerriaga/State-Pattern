/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

/**
 *
 * @author guilherme
 */
public class StatePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ItemPedido item1 = new ItemPedido("Descricao To com fome", 42.00, 1);
    ItemPedido item2 = new ItemPedido("uma descricao ai", 45.00, 2);
    Pedido pedido = new Pedido();
    pedido.addItem(item2);  
    pedido.addItem(item1); 
    pedido.calcularTotal();
    System.out.println(pedido.getItemPedidos().toString());
    pedido.removerItem(item1);
    pedido.calcularTotal();
    System.out.println("pedido:"+pedido.getStatusPedido().toString());
    pedido.cancelar();
    System.out.println("pedido:"+pedido.getStatusPedido().toString());
    pedido.enviar();
    pedido.reprocessar();
    System.out.println("pedido:"+pedido.getStatusPedido().toString());
    pedido.enviar();
    System.out.println("pedido:"+pedido.getStatusPedido().toString());
    
        
    
    
    }
    
}
