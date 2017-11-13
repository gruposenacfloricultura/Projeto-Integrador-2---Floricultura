
package br.com.pi2.mock;



import br.com.pi2.model.jopos.Cliente;
import java.util.ArrayList;
import java.util.List;


public class Clientes {
    private static int totalClientes = 0;
    
    private static List<Cliente> catalogoCliente = new ArrayList<Cliente>();
    
    public static void adicionar (Cliente cliente) throws Exception {
        cliente.setId(totalClientes++);
        catalogoCliente.add(cliente);

    }
    
    public static List<Cliente> buscar (String nome) throws Exception {
        List<Cliente> listaResultado = new ArrayList<Cliente>();
        if (nome != null || !catalogoCliente.isEmpty() ){
              for(Cliente cliente : catalogoCliente){
              if(cliente.getNome().toUpperCase().contains(nome.toUpperCase()) || cliente.getSobrenome().toUpperCase().contains(nome.toUpperCase())){
                  listaResultado.add(cliente);
              }
            }
        }
        return listaResultado;
    }
    
    public static void excluir (int id) throws Exception {
            for(Cliente cliente : catalogoCliente){
               if (cliente.getId()== id){
                   catalogoCliente.remove(cliente);
                   break;
               }
                
            }
            
        }
        
 public static Cliente obtem (int id) throws Exception{
        if (!catalogoCliente.isEmpty() ){
            for(Cliente cliente: catalogoCliente){
                if(cliente.getId()== id){
                    return cliente;
                }
            }
        }
        return null;
    }        
    
    
    public static void editar (Cliente cliente) throws Exception {
       if (!catalogoCliente.isEmpty() ){
        for(Cliente clienteedit : catalogoCliente){
            if(cliente.getId()== clienteedit.getId()){
                clienteedit.setCpf(cliente.getCpf());
                clienteedit.setDataNascimento(cliente.getDataNascimento());
                clienteedit.setEmail(cliente.getEmail());
                clienteedit.setEndereco(cliente.getEndereco());
                clienteedit.setEnderecoNum(cliente.getEnderecoNum());
                clienteedit.setEnderecoUF(cliente.getEnderecoUF());
                clienteedit.setEstdoCivil(cliente.getEstdoCivil());
                clienteedit.setNome(cliente.getNome());
                clienteedit.setSobrenome(cliente.getSobrenome());
                clienteedit.setTelefone(cliente.getTelefone());
                break;
            }
        }
    }
    }
    
    
    public static List<Cliente> listar () throws Exception {
        return catalogoCliente;
    }
    
}


