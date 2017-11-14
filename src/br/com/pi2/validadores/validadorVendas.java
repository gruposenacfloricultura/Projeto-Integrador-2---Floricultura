/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi2.validadores;

import br.com.pi2.exceptions.exceptions.VendaException;
import br.com.pi2.model.jopos.Venda;

/**
 *
 * @author matheus.jmaia
 */
public class validadorVendas {
    public static  void validar(Venda venda) throws VendaException {
        //Realização de validações de negócio
        if (venda == null) {
            throw new VendaException ("Não foi informado um cliente");
        }
        if (venda.getCliente()== null || "".equals(venda.getCliente())) {
            throw new VendaException ("É necessário informar "
                    + "cliente para a venda");
        }
        if (venda.getItemVenda()== null
                || "".equals(venda.getItemVenda())) {
            throw new VendaException("É necessário haver um intem"
                    + "para realizar a venda");
        }
        
        
    }
}

