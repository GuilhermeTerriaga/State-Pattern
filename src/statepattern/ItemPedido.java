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
public class ItemPedido {
    private String descricao;
    private double preco;
    private int quantidade;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ItemPedido(String descricao, double preco, int quantidade) {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItemPedido{" + "descricao=" + descricao + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }

   
    
}
