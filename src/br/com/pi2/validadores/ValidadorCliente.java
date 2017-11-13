package br.com.pi2.validadores;

import br.com.pi2.exceptions.exceptions.;
import br.com.pi2.model.jopos.Cliente;


public class ValidadorCliente {
    public static  void validar(Cliente cliente) throws ClienteException {
        
        if (cliente == null) {
            throw new ClienteException("Não foi informado um cliente");
        }
        if (cliente.getNome() == null || "".equals(cliente.getNome())) {
            throw new ClienteException("É necessário informar "
                    + "o nome do cliente");
        }
        if (cliente.getSobrenome() == null
                || "".equals(cliente.getSobrenome())) {
            throw new ClienteException("É necessário informar o "
                    + "sobrenome do cliente");
        }
        if (cliente.getCpf()== null
                || "".equals(cliente.getCpf())) {
            throw new ClienteException("É necessário informar o "
                    + "cpf do cliente");
        }
        if (cliente.getDataNascimento() == null) {
            throw new ClienteException("É necessário informar uma "
                    + "data de nascimento válida");
        }
        if (cliente.getSexo() == null || "".equals(cliente.getSexo())
                || (!cliente.getSexo().equals("Masculino"))
                && !cliente.getSexo().equals("Feminino")) {
            throw new ClienteException("É necessário informar o "
                    + "gênero do cliente");
        }
        if (cliente.getTelefone()== null
                || "".equals(cliente.getTelefone())) {
            throw new ClienteException("É necessário informar o "
                    + "telefone do cliente");
        }
        if (cliente.getEmail()== null
                || "".equals(cliente.getEmail())) {
            throw new ClienteException("É necessário informar o "
                    + "email do cliente");
        }
        if (cliente.getEndereco()== null
                || "".equals(cliente.getEndereco())) {
            throw new ClienteException("É necessário informar o "
                    + "endereço do cliente");
        }
        if (cliente.getEnderecoNum()== null
                || "".equals(cliente.getEnderecoNum())) {
            throw new ClienteException("É necessário informar o "
                    + "número do endereço do cliente");
        }
        if (cliente.getEnderecoUF()== null
                || "".equals(cliente.getEnderecoUF())) {
            throw new ClienteException("É necessário informar a "
                    + "cidade do cliente");
        }
        
    }
}
