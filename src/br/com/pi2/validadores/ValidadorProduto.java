package br.com.pi2.validadores;

import br.com.pi2.exceptions.ProdutoException;
import br.com.pi2.model.produto.Produto;


public class ValidadorProduto {
    public static  void validar(Produto produto) throws ProdutoException {
        
        if (produto == null) {
            throw new ProdutoException("Não foi informado um produto");
        }
        if (produto.getDescricao()== null || "".equals(produto.getDescricao())) {
            throw new ProdutoException("É necessário informar "
                    + "o nome do produto");
        }
        if (produto.getTipo()== null || "".equals(produto.getTipo())
                || (!produto.getTipo().equals("Flor"))
                && !produto.getTipo().equals("Chocolate")) {
            throw new ProdutoException("É necessário informar o "
                    + "tipo do produto");
        }
        if (produto.getCor()== null || "".equals(produto.getCor())) {
            throw new ProdutoException("É necessário informar "
                    + "a cor do produto");
        }
        if (produto.getEstoque()== null || "".equals(produto.getEstoque())) {
            throw new ProdutoException("É necessário informar "
                    + "a quantidade do estoque do produto");
        }
        if (produto.getValor()== null || "".equals(produto.getValor())) {
            throw new ProdutoException("É necessário informar "
                    + "o valor do produto");
        }
    }
}
