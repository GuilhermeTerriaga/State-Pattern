/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;



/**
 *
 * @author guilherme
 */
public class Pedido {
    private Calendar data;
    private double total;
    private List<ItemPedido> itemPedidos = new ArrayList<ItemPedido>();
    private StatusPedido statusPedido;

    public Pedido() {
        statusPedido = new Processando();
        System.out.println("processando pedido");
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public List<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

      public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public void addItem(ItemPedido novoItem){
        for(int i = 0; i < novoItem.getQuantidade(); i ++){
         itemPedidos.add(i, novoItem);
         total = total + novoItem.getPreco();
        System.out.println("Adicionado novo item:"+novoItem.getDescricao()+"\nAtualmente "+getItemPedidos().size() + " items");
       }
       
    } 
    public void removerItem(ItemPedido item){
        itemPedidos.remove(item);
        total = total - item.getPreco();
        System.out.println("Removido item:"+item.getDescricao()+"\nAtualmente "+getItemPedidos().size() + " items");
    } 
    public void calcularTotal(){
        System.out.println("Total:"+getTotal());
    }
    
    public void cancelar(){
        this.statusPedido.cancelar(this);
    }
     public void enviar(){
        this.statusPedido.enviar(this);
    }
     public void reprocessar(){
        this.statusPedido.processar(this);
    }

    
    
}
