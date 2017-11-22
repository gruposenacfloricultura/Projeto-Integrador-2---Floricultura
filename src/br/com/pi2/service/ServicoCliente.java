package br.com.pi2.service;

import br.com.pi2.exceptions.ClienteException;
import br.com.pi2.exceptions.DataSourceException;
import br.com.pi2.mock.Clientes;
import br.com.pi2.model.jopos.Cliente;
import br.com.pi2.validadores.ValidadorCliente;
import java.util.List;

/**
 *
 * @author matheus.jmaia
 */
public class ServicoCliente {

    public static void cadastrarCliente(Cliente cliente) throws ClienteException, DataSourceException {
        ValidadorCliente.validar(cliente);
        try {
            Clientes.adicionar(cliente);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }

    }

    public static void editar(Cliente cliente) throws ClienteException, DataSourceException {
        ValidadorCliente.validar(cliente);
        try {
            Clientes.editar(cliente);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static Cliente obter(int id) throws ClienteException, DataSourceException {
        try {
            return Clientes.obtem(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static void excluirCliente(int id) throws ClienteException, DataSourceException {
        try {
            Clientes.excluir(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static List<Cliente> buscarCliente(String nome) throws ClienteException, DataSourceException {
        try {
            if (nome == null || nome == "") {
                return Clientes.listar();
            } else {
                return Clientes.buscar(nome);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }

    }

}
