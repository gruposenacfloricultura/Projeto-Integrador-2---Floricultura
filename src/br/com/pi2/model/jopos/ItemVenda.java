package br.com.pi2.model.jopos;

public class ItemVenda {

    private Produto itemProduto;
    private double qtde;
    private double preco;

    public void calcularPreco() {
        preco = (itemProduto.getValor() * qtde);
    }

    public Produto getItemProduto() {
        return itemProduto;
    }

    public void setItemProduto(Produto itemProduto) {
        this.itemProduto = itemProduto;
    }

    public double getQtde() {
        return qtde;
    }

    public void setQtde(double qtde) {
        this.qtde = qtde;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
