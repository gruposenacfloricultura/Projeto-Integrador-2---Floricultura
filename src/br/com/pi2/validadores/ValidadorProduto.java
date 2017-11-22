package br.com.pi2.validadores;

import br.com.pi2.exceptions.ProdutoException;
import br.com.pi2.model.jopos.Produto;

/**
 *
 * @author matheus.jmaia
 */
public class ValidadorProduto {

    public static void validar(Produto produto) throws ProdutoException {
        if (produto == null) {
            throw new ProdutoException("O produto não foi informado!");
        }
        if (produto.getDescricao() == null) {
            throw new ProdutoException("É necessário informar um nome para o produto");
        }
        if (produto.getEstoque() == 0) {
            throw new ProdutoException("É necessário informar a quantidade em estoque do produto");
        }
        if (produto.getTipo() == null) {
            throw new ProdutoException("É necessário informar o tipo que pertence o produto");
        }
        if (produto.getValor() == 0) {
            throw new ProdutoException("É necessário informar o preço do produto");
        }
        if (produto.getCodigoProduto() == 0) {
            throw new ProdutoException("O código do produto não foi inserido automaticamente!");
        }
    }

}
