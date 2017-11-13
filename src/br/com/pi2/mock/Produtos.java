
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
        if ( desc != null || !catalogoProdutos.isEmpty() ){
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
        
 public static Produto obtem (int cod) throws Exception{
        if (!catalogoProdutos.isEmpty() ){
            for(Produto produto: catalogoProdutos){
                if(produto.getCodigoProduto() == cod){
                    return produto;
                }
            }
        }
        return null;
    }        
    
    
    public static void editar (Produto produto) throws Exception {
       if (!catalogoProdutos.isEmpty() ){
        for(Produto produtoedit : catalogoProdutos){
            if(produto.getCodigoProduto() == produtoedit.getCodigoProduto()){
                produtoedit.setCor(produto.getCor());
                produtoedit.setDescricao(produto.getDescricao());
                produtoedit.setEstoque(produto.getEstoque());
                produtoedit.setTipo(produto.getTipo());
                produtoedit.setValor(produto.getValor());
                break;
            }
        }
    }
    }
    
    
    public static List<Produto> listar () throws Exception {
        return catalogoProdutos;
    }
    
}
