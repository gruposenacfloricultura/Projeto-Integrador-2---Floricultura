package br.com.pi2.service;

import java.util.List;

public class Produtos {

    public static void cadastrarProduto(Produto produto)
            throws ProdutoException {

        ValidadorProduto.validar(produto);

        try {

            MockProduto.inserir(produto);
        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    public static void atualizarProduto(Produto produto)
            throws ProdutoException {

        ValidadorProduto.validar(produto);

        try {

            MockProduto.atualizar(produto);
            return;
        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    public static List<Produto> procurarProduto(String nome)
            throws ProdutoException {
        try {

            if (nome == null || "".equals(nome)) {
                return MockProduto.listar();
            } else {
                return MockProduto.procurar(nome);
            }
        } catch (Exception e) {

        }
        return null;
    }

    public static Produto obterProduto(Integer id)
            throws ProdutoException {
        try {

            return MockProduto.obter(id);
        } catch (Exception e) {

        }
        return null;
    }

    public static void excluirProduto(Integer id)
            throws ProdutoException {
        try {

            MockProduto.excluir(id);
        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
