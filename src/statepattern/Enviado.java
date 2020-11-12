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
public class Enviado implements StatusPedido{
private String enviado = "Pedido já enviado";
    @Override
    public void cancelar(Pedido pedido) {
        System.out.println(enviado);
    }

    @Override
    public void processar(Pedido pedido) {
       System.out.println(enviado);
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println(enviado);
    }
    
}
