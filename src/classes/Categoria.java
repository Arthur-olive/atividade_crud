package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Categoria {
    
    private static int idc;
    private static String nomec;

    public Categoria(int id){
        if(id > 0){
            String sql = "SELECT * FROM categorias WHERE id = ?";
            try{
                Connection con = DB.conexao(); 
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, id);
                ResultSet registro = stmt.executeQuery();
                
                while(registro.next()){
                    this.setId(registro.getInt("id"));
                    this.setNome(registro.getString("nome"));    
                }
            }catch(SQLException e){      	
                System.out.println("Erro no Consulta Categoria: " + e.toString()); 
            }
        }
    }


    public int getId() {
        return idc;
    }
    public void setId(int id) {
        Categoria.idc = id;
    }
    public String getNome() {
        return nomec;
    }
    public void setNome(String nome) {
        Categoria.nomec = nome;
    }

    public void adicionar(){
        String sql = "INSERT INTO categorias (nome) VALUES (?)";
   
        try{
            Connection con = DB.conexao();
            PreparedStatement stmt = con.prepareStatement(sql);
   
            stmt.setString(1, this.getNome());
            stmt.execute();
        }catch(SQLException e){      	
            System.out.print("Erro no adicionar Categoria: " + e.toString()); 
        }
   }
   
    public static ArrayList<Categoria> listar() {
        System.out.println("Nome: " + nomec);
        System.out.println("ID: " + idc);
        return null;

    }

    public void atualizar (){

        String sql = "UPDATE clientes SET id = ?, nome = ?";

    try{
        Connection con = DB.conexao();
        PreparedStatement stmt = con.prepareStatement(sql);

        stmt.setInt(1, this.getId());
        stmt.setString(2, this.getNome());
        stmt.executeUpdate();

    }catch(SQLException e){

    System.out.println("Erro no Atualizar Categoria: " + e.toString());

        }   
    }

    public void excluir(){
       String sql = "DELETE FROM categorias WHERE id = ?";

    try{
        Connection con = DB.conexao();
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, this.getId());
        stmt.executeUpdate();

    }catch(SQLException e){

     System.out.println("Erro no Excluir Categoria: " + e.toString());

       }
    }
}
    
