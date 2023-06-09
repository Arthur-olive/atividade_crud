package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Produto{

    private static int idp;
    private static int categoria_id;
    private static String nomep;
    private static double preco;
    private static int quantidadep;

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

    public int getId() {
        return idp;
    }

    public void setId(int id) {
        Produto.idp = id;
    }

    public int getCategoriaId() {
        return categoria_id;
    }

    public void setCategoriaId(int categoria_id) {
        Produto.categoria_id = categoria_id;
    }

    public String getNome() {
        return nomep;
    }

    public void setNome(String nome) {
        Produto.nomep = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        Produto.preco = preco;
    }

    public int getQuantidade() {
        return quantidadep;
    }

    public void setQuantidade(int quantidade) {
        Produto.quantidadep = quantidade;
    }
    
    public void adicionar(){
        String sql = "INSERT INTO produtos (nome) VALUES (?)";
    
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
    
            stmt.setString(1, this.getNome());
            stmt.execute();
        }catch(SQLException e){      	
            System.out.print("Erro no adicionar Produto: " + e.toString()); 
        }
    }
        /**
         * @return
         */
    public static ArrayList<Produto> listar() {
            System.out.println("ID: " + idp);
            System.out.println("Categoria: " + categoria_id);
            System.out.println("Nome: " + nomep);
            System.out.println("Preço: " + preco);
            System.out.println("Quantidade: " + quantidadep);
            return null;

        }

    public void atualizar (){

            String sql = "UPDATE produtos SET categoria_id = ?, nome = ?, preco = ?, quantidade = ? WHERE id = ? ";

    try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, this.getId());
            stmt.setInt(2, this.getCategoriaId());
            stmt.setString(3, this.getNome());
            stmt.setDouble(4, this.getPreco());
            stmt.setInt(5, this.getQuantidade());
            stmt.executeUpdate();

    }catch(SQLException e){

        System.out.println("Erro no Atualizar Produto: " + e.toString());

     }   
 }

    public void excluir(){
        String sql = "DELETE FROM produtos WHERE id = ?";

    try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, this.getId());
            stmt.executeUpdate();

    }catch(SQLException e){

        System.out.println("Erro no Excluir do Produto: " + e.toString());

        }
     }
 }