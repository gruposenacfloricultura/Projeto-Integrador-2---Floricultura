/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi2.mock;

import br.com.pi2.model.jopos.ItemVenda;
import br.com.pi2.model.jopos.Venda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheus.jmaia
 */
public class MockVendas {
    private static int totalVendas = 0;
    
    private static List<Venda> allVendas = new ArrayList<Venda>();
    
    public static void adicionarVenda (Venda venda) throws Exception{
        venda.setCodVenda(totalVendas++);
        allVendas.add(venda);
    }
    public static Venda adicionarListaItem (Venda venda, List<ItemVenda> itemVenda) throws Exception{
        venda.setItemVenda(itemVenda);
        return venda;
        
    }
    public static List<ItemVenda> addiconarItems (ItemVenda itemVenda) throws Exception{
        List<ItemVenda> listaItens = new ArrayList<ItemVenda>();
        listaItens.add(itemVenda);
        return listaItens;
    }
    
    public static List<Venda> buscar (int codigo) throws Exception {
        List<Venda> listaResultado = new ArrayList<Venda>();
        if (!allVendas.isEmpty()){
              for(Venda venda : allVendas){
              if(venda.getCodVenda() == codigo){
                  listaResultado.add(venda);
              }
            }
        }
        return listaResultado;
    }
    
    public static List<Venda> listar () throws Exception {
        return allVendas;
    }
    
}
