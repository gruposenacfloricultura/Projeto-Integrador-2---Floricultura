package br.com.pi2.model.jopos;

import java.util.Date;
import java.util.List;

public class Venda {

    private int codVenda;
    private Date data;
    private Cliente cliente;
    private List<ItemVenda> ItemVenda;
    private double valor;

    public void calcularTotal() {
        for (ItemVenda itemVenda : ItemVenda) {
            valor = itemVenda.getPreco() + valor;
        }
    }

    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItemVenda() {
        return ItemVenda;
    }

    public void setItemVenda(List<ItemVenda> ItemVenda) {
        this.ItemVenda = ItemVenda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
