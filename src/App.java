import java.util.ArrayList;
import classes.Categoria;
import classes.Cliente;
import classes.Produto;
import classes.Vendedor;
import classes.Venda;

public class App {
    public static void main(String[] args){
        
/////////////////////Cliente/////////////////////        
//add 
        Cliente c = new Cliente(1);
        c.setId(6);
        c.setNome("João Arthur");
        c.setQuantidade(9);
        c.adicionar();

//listar
        ArrayList<Cliente> cliente = Cliente.listar();
        
        for(Cliente c: cliente){
            
        int id = c.getId();
        String nome = c.getNome();
        int quantidade = c.getQuantidade();

        System.out.println(id);
        System.out.println(nome);
        System.out.println(quantidade);
        
         

         
         
        }
    }
}
