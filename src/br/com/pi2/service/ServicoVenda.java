package br.com.pi2.service;

import br.com.pi2.exceptions.DataSourceException;
import br.com.pi2.exceptions.VendasException;
import br.com.pi2.mock.Vendas;
import br.com.pi2.model.jopos.Venda;
import br.com.pi2.validadores.ValidadorVenda;
import java.util.List;



/**
 *
 * @author matheus.jmaia
 */
public class ServicoVenda {

    public static void adicionarVenda(Venda venda) throws VendasException, DataSourceException {
        ValidadorVenda.validar(venda);
        try {
            Vendas.adicionarVenda(venda);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
    public static List<Vendas> relatorioVendas (String data) throws VendasException, DataSourceException {
        try{
            if(data == "mensal"){
                
            }
        }
    }
}
