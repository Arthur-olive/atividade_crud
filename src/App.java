import java.util.ArrayList;
import classes.Categoria;
import classes.Cliente;
import classes.Produto;
import classes.Vendedor;
import classes.Venda;

public class App {
    /**
     * @param args
     */
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

        for(Cliente c1: cliente){
        int id = c1.getId();
        String nome = c1.getNome();
        int quantidade = c1.getQuantidade();

        System.out.println(id);
        System.out.print(nome);
        System.out.print(quantidade);

//update
        Cliente c2 = new Cliente(1);
        c2.setId(6);
        c2.setNome("João Arthur");
        c2.setQuantidade(9);
        c2.atualizar();

//delete
        Cliente c3 = new Cliente(1);
        c3.excluir();





/////////////////////Vendedor/////////////////////
//add 
        Vendedor v = new Vendedor(2);
        v.setId(7);
        v.setNome("Helena Costa");
        v.setQuantidade(10);
        v.adicionar();

//listar
ArrayList<Vendedor> vendedor = Vendedor.listar();

        for(Vendedor v1: vendedor){
        int id1 = v1.getId();
        String nome1 = v1.getNome();
        int quantidade1 = v1.getQuantidade();

        System.out.println(id);
        System.out.print(nome);
        System.out.print(quantidade);

//update
        Vendedor v2 = new Vendedor(2);
        v2.setId(7);
        v2.setNome("Helena Costa");
        v2.setQuantidade(10);
        v2.atualizar();

//delete
        Vendedor v3 = new Vendedor(2);
        v3.excluir();



        

/////////////////////Produto/////////////////////
//add 
        Produto p = new Produto(1);
        p.setId(1);
        p.setCategoriaId(10);
        p.setNome("João Arthur");
        p.setPreco(1000);
        p.setQuantidade(9);
        p.adicionar();

//listar
        ArrayList<Produto> produto = Produto.listar();

        for(Produto p1: produto){
        int id3 = p1.getId();
        int categoria_id = p1.getQuantidade();
        String nome3 = p1.getNome();
        double preco = p1.getPreco();
        int quantidade3 = p1.getQuantidade();

        System.out.println(id);
        System.out.print(categoria_id);
        System.out.print(nome);
        System.out.print(preco);
        System.out.print(quantidade);

//update
        Produto p2 = new Produto(1);
        p2.setId(01);
        p2.setCategoriaId(20);
        p2.setNome("Bárbara Penido");
        p2.setPreco(55);
        p2.setQuantidade(8);
        p2.atualizar();

//delete
        Produto p3 = new Produto(1);
        p3.excluir();





/////////////////////Categoria/////////////////////
//add 
        Categoria c4 = new Categoria(1);
        c4.setId(7);
        c4.setNome("Yasmin Albuquerque");
        c4.adicionar();

//listar
        ArrayList<Categoria> categoria = Categoria.listar();

        for(Categoria c5: categoria){
        int id4 = c5.getId();
        String nome4 = c5.getNome();

        System.out.println(id);
        System.out.print(nome);

//update
        Categoria c6 = new Categoria(1);
        c6.setId(01);
        c6.setNome("Helena Costa");
        c6.atualizar();

//delete
        Categoria c7 = new Categoria(1);
        c7.excluir();





/////////////////////Venda/////////////////////
 //add 
        Venda v4 = new Venda(1);
        v4.setId(7);
        v4.setNome("Georgia Brandão");
        v4.setPreco(9);
        v4.adicionar();

//listar
        ArrayList<Venda> venda = Venda.listar();

        for(Venda v5: venda){
        int id5 = v5.getId();
        String nome5 = v5.getNome();
        double preco5 = v5.getPreco();

        System.out.println(id);
        System.out.print(nome);
        System.out.print(preco);

//update
        Venda v6 = new Venda(1);
        v6.setId(01);
        v6.setNome("Georgia Brandão");
        v6.setPreco(12);
        v6.atualizar();

//delete
        Venda v7 = new Venda(1);
        v7.excluir();
        
        





                        }
                    }    
                }
            }
        }
    }
}
