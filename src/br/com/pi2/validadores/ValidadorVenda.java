package br.com.pi2.validadores;

import br.com.pi2.exceptions.VendasException;
import br.com.pi2.model.jopos.Venda;

/**
 *
 * @author matheus.jmaia
 */
public class ValidadorVenda {

    public static void validar(Venda venda) throws VendasException {
        if (venda == null) {
            throw new VendasException("Não foi informado a venda!");
        }
        if (venda.getCliente() == null){
            throw new VendasException("Não foi um cliente na venda!");
        }
        if (venda.getItemVenda() == null){
            throw new VendasException("É necessário ter pelo menos um intem na venda");
        }
        if (venda.getValor() == 0){
            throw new VendasException("Erro: o valor da venda não pode ser zero!");
        }
    }
}
