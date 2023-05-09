package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Clientes{

    private int id;
    private String nome_cliente;
    private int quantidade;

    public Clientes(int id, String nome_cliente, int quantidade) {
        this.id = id;
        this.nome_cliente = nome_cliente;
        this.quantidade = quantidade;
    }

    public Clientes(int id){
        if(id > 0){
    
        String sql = "SELECT * FROM clientes WHERE id = ?";
    
            try{
                Connection con = DB.conexao(); 
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, id);
                ResultSet registro = stmt.executeQuery();
                
                while(registro.next()){
                    this.setId(registro.getInt("id"));
                    this.setNome_cliente(registro.getString("nome_cliente"));
                    this.setQuantidade(registro.getInt("quantidade"));      
                }

            }catch(SQLException e){      	
                System.out.println("Erro no Consulta do cliente: " + e.toString()); 
            }
        }
        }

        public void listar() {
            System.out.println("ID do produto: " + this.id);
            System.out.println("Nome do cliente: " + this.nome_cliente);
            System.out.println("Quantidade: " + this.quantidade);
            System.out.println("Clientes:");
            for (Clientes cliente : this.nome_cliente) {
                System.out.println("- " + cliente.getNome_cliente());
            }
    }
        
    private int getQuantidade() {
        return quantidade;
    }

    private int setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    private String getNome_cliente() {
        return nome_cliente;
    }

    private String setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    private int getId() {
        return id;
    }

    private int setId(int id) {
        this.id = id;
    }











































}
