package br.com.pi2.service;

import br.com.pi2.exceptions.DataSourceException;
import br.com.pi2.exceptions.ProdutoException;
import br.com.pi2.mock.Produtos;
import br.com.pi2.model.jopos.Produto;
import br.com.pi2.validadores.ValidadorProduto;
import java.util.List;

/**
 *
 * @author matheus.jmaia
 */
public class ServicoProduto {

    public static void cadastrarProduto(Produto produto) throws ProdutoException, DataSourceException {
        ValidadorProduto.validar(produto);
        try {
            Produtos.adicionar(produto);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static void editarProduto(Produto produto) throws ProdutoException, DataSourceException {
        ValidadorProduto.validar(produto);
        try {
            Produtos.editar(produto);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static List<Produto> buscarProduto(String nome) throws ProdutoException, DataSourceException {
        try {
            if (nome == null || nome == "") {
                return Produtos.listar();
            } else {
                return Produtos.buscar(nome);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static Produto obterProduto (int cod) throws ProdutoException, DataSourceException{
        try{
            return Produtos.obtem(cod);
        } catch (Exception e){
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
    public static void excluirProduto(int cod) throws ProdutoException, DataSourceException {
        try {
            Produtos.excluir(cod);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}
