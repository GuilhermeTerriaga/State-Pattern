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
public interface StatusPedido {

    public void cancelar(Pedido pedido);

    public void processar(Pedido pedido);

    public void enviar(Pedido pedido);

}
