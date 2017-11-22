package br.com.pi2.validadores;

import br.com.pi2.exceptions.ClienteException;
import br.com.pi2.model.jopos.Cliente;

/**
 *
 * @author matheus.jmaia
 */
public class ValidadorCliente {

    public static void validar(Cliente cliente) throws ClienteException {
        if (cliente == null) {
            throw new ClienteException("O cliente não foi informado!");
        }
        if (cliente.getNome() == null) {
            throw new ClienteException("É necessário informar o nome do cliente");
        }
        if (cliente.getSobrenome() == null) {
            throw new ClienteException("É necessário informar o sobrenome do cliente");
        }
        if (cliente.getCpf() == null) {
            throw new ClienteException("É necessário informar o CPF do cliente");
        }
        if (cliente.getSexo() == null) {
            throw new ClienteException("É necessário informar o sexo do cliente");
        }
        if (cliente.getDataNascimento() == null) {
            throw new ClienteException("É necessário informar a data de nascimento do cliente");
        }
        if (cliente.getEstdoCivil() == null) {
            throw new ClienteException("É necessário informar o estado cívil do cliente");
        }
        if (cliente.getTelefone() == null) {
            throw new ClienteException("É necessário informar o telefone do cliente");
        }
    }
}
