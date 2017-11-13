
package br.com.pi2.mock;



import br.com.pi2.model.jopos.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matheus.jmaia
 */
public class Produtos {
    private static int totalProdutos = 0;
    
    private static List<Produto> catalogoProdutos = new ArrayList<Produto>();
    
    public static void adicionar (Produto produto) throws Exception {
        produto.setCodigoProduto(totalProdutos++);
        catalogoProdutos.add(produto);
    }
    
    public static List<Produto> buscar (String desc) throws Exception {
        List<Produto> listaResultado = new ArrayList<Produto>();
        if ( desc != null || catalogoProdutos.isEmpty() ){
              for(Produto produto : catalogoProdutos){
              if(produto.getDescricao().toUpperCase().contains(desc.toUpperCase())){
                  listaResultado.add(produto);
              }
            }
        }
        return listaResultado;
    }
    
    public static void excluir (int cod) throws Exception {
            for(Produto produto : catalogoProdutos){
               if (produto.getCodigoProduto() == cod){
                   catalogoProdutos.remove(produto);
                   break;
               }
                
            }
            
        }
        
 
    
    public static void editar (int cod) throws Exception {
        for(Produto produto : catalogoProdutos){
            if(produto.getCodigoProduto() == cod){
                
            }
        }
    }
            
    public static List<Produto> listar () throws Exception {
        return catalogoProdutos;
    }
    
}
