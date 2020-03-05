/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.foursys.locadora.model;

import java.util.List;

/**
 *
 * @author amendes
 */
public class Locacao {
    
    private Cliente cliente;
    private Vendedor vendedor;
    private List<Filme> listaFilmes;
    private Filme filme;
    private Double valorTotal;
    private Double valorPago;
    private Double Troco;
    private String formaPagamento;
    
    public Locacao(){
        
    }

    public Locacao(Cliente cliente, Vendedor vendedor, List<Filme> listaFilmes, Filme filme, Double valorTotal, Double valorPago, Double Troco, String formaPagamento) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.listaFilmes = listaFilmes;
        this.filme = filme;
        this.valorTotal = valorTotal;
        this.valorPago = valorPago;
        this.Troco = Troco;
        this.formaPagamento = formaPagamento;
    }

    

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Filme> getListaFilmes() {
        return listaFilmes;
    }

    public void setListaFilmes(List<Filme> listaFilmes) {
        this.listaFilmes = listaFilmes;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public Double getTroco() {
        return Troco;
    }

    public void setTroco(Double Troco) {
        this.Troco = Troco;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
    
    
    
}
