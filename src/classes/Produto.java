package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Produto{

    private int id;
    private int categoria_id;
    private String nome;
    private double preco;
    private int quantidade;

    /**
     * @param id
     */
    public Produto(int id){
        if(id > 0){
    
        String sql = "SELECT * FROM produtos WHERE id = ?";
    
            try{
                Connection con = DB.conexao(); 
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, id);
                ResultSet registro = stmt.executeQuery();
                
                while(registro.next()){
                    this.setId(registro.getInt("id"));
                    this.setNome(registro.getString("nome"));
                    this.setPreco(registro.getDouble("preco"));
                    this.setQuantidade(registro.getInt("quantidade"));      
                }

            }catch(SQLException e){      	
                System.out.println("Erro no Consulta Produto: " + e.toString()); 
            }
        }
        }

        public void listar() {
            System.out.println("ID: " + this.id);
            System.out.println("Categoria: " + this.categoria_id);
            System.out.println("Nome: " + this.nome);
            System.out.println("Preço: " + this.preco);
            System.out.println("Produtos:");
            for (Produto produto : this.Produto) {
                System.out.println("- " + produto.getNome());
            }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoriaId() {
        return categoria_id;
    }

    public void setCategoriaId(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}