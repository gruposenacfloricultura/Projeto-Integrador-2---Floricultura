/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pi2.mock;

import br.com.pi2.model.jopos.ItemVenda;
import br.com.pi2.model.jopos.Venda;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author matheus.jmaia
 */
public class Vendas {
    private static int totalVendas = 1;
    
    private static List<Venda> allVendas = new ArrayList<Venda>();
    
    public static void adicionarVenda (Venda venda) throws Exception{
        venda.setCodVenda(totalVendas++);
        //
        Date data = new Date(System.currentTimeMillis());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.format(data);
        //
        venda.setData(data);
        allVendas.add(venda);
    }
    
    public static List<ItemVenda> addiconarItems (ItemVenda itemVenda, List<ItemVenda> listaItens) throws Exception{
        listaItens.add(itemVenda);
        return listaItens;
    }
     
    public static Venda adicionarListaItem (Venda venda, List<ItemVenda> itemsVenda) throws Exception{
        venda.setItemVenda(itemsVenda);
        return venda;
        
    }
   //FALTA ARRUMAR 
   public static List<Venda> relatatorioData (String data) throws Exception {
       /* SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(data);
        List<Venda> listaResultado = new ArrayList<Venda>();
        
        Calendar DataC = Calendar.getInstance();
        int dia = dataFormatada.getDate();
        int mes = dataFormatada.getMonth();
        int ano = dataFormatada.getYear();
       
        DataC.set(ano, mes, dia);
        DataC.add(DataC.DAY_OF_YEAR,30);
        
        */
        if (!allVendas.isEmpty()){
              for(Venda venda : allVendas){
              if(venda.getData() == dataFormatada){
                  listaResultado.add(venda);
              }
            }
        }
        return listaResultado;
    }
   //FALTA ARRUMAR 
    public static List<Venda> relatatorioMensal (String data) throws Exception {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(data);
        
        List<Venda> listaResultado = new ArrayList<Venda>();
        if (!allVendas.isEmpty()){
              for(Venda venda : allVendas){
              if(venda.getData().equals(dataFormatada)){
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
