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
public class Processando implements StatusPedido {

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Cancelando Pedido");
        pedido.setStatusPedido(new Cancelado());
    }

    @Override
    public void processar(Pedido pedido) {
        System.out.println("Pedido já em processamento");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Enviando Pedido");
        pedido.setStatusPedido(new Enviado());
    }

}
