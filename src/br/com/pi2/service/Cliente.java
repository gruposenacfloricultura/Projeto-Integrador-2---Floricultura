
import br.com.pi2.mock.Clientes;
import br.com.pi2.validadores.ValidadorCliente;
import java.util.List;




public class Cliente {


    public static void cadastrarCliente(Cliente cliente)
            throws ClienteException, DataSourceException {

     
        ValidadorCliente.validar(cliente);

        try {
           
            Clientes.adicionar(cliente);
        } catch (Exception e) {
         
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

  
    public static void atualizarCliente(Cliente cliente)
            throws ClienteException, DataSourceException {
        

        ValidadorCliente.validar(cliente);

        try {
           
            MockCliente.atualizar(cliente);
            return;
        } catch (Exception e) {
       
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    
    public static List<Cliente> procurarCliente(String nome)
            throws ClienteException, DataSourceException {
        try {
            
            if (nome == null || "".equals(nome)) {
                return MockCliente.listar();
            } else {
                return MockCliente.procurar(nome);
            }
        } catch (Exception e) {
          
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

  
    public static Cliente obterCliente(Integer id)
            throws ClienteException, DataSourceException {
        try {
         
            return MockCliente.obter(id);
        } catch (Exception e) {
        
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

 
    public static void excluirCliente(Integer id)
            throws ClienteException, DataSourceException {
        try {
          
            MockCliente.excluir(id);
        } catch (Exception e) {
           
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}
