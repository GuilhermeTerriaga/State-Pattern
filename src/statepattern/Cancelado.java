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
public class Cancelado implements StatusPedido{

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido já cancelado");
    }

    @Override
    public void processar(Pedido pedido) {
        System.out.println("Re-processando Pedido");
        pedido.setStatusPedido(new Processando());
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido já cancelado");
    }
    
}