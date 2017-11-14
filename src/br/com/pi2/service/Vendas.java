/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi2.service;
import br.com.pi2.mock.MockVendas;
import br.com.pi2.validadores.validadorVendas;
import br.com.pi2.exceptions.exceptions.VendaException;
import br.com.pi2.model.jopos.ItemVenda;
import br.com.pi2.model.jopos.Venda;
import java.util.List;

/**
 *
 * @author matheus.jmaia
 */
public class Vendas {
    public static void adicionarVenda(Venda venda) throws VendaException {
        
        validadorVendas.validar(venda);
        try {
           MockVendas.adicionarVenda(venda);
            
        } catch (Exception e) {
         
            e.printStackTrace();
            
        }
    }

    public static List<Venda> BuscarVenda(String cod) throws VendaException {      
        try {    
        if (cod == null || "".equals(cod)) {
                return MockVendas.listar();
            } else {
                int codi = Integer.parseInt(cod);
                return MockVendas.buscar(codi);
            }} catch (Exception e) {
         
            e.printStackTrace();
            
        }
    }
        
    }


   