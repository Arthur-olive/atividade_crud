import classes.Categoria;
import classes.Clientes;
import classes.Produto;
import classes.vendedores;
import classes.vendas;

public class App {
    public static void main(String[] args){
        
        // CADASTRAR CATEGORIA
         //Categoria categorias = new Categoria(1);
         //categorias.setNome("Categoria Samsung");
         //categorias.adicionar();

         //BUSCAR CATEGORIA
         //Categoria categorias = new Categoria (2);
         //System.out.println(categorias.getNome());

         //BUSCAR PRODUTO
         Clientes cliente = new Clientes(2);
         System.out.println(Clientes.getNome_cliente());
    }
}
