package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class vendedores {

    private int id;
    private String nome;
    private int numero_vendas;

    String sql = "SELECT * FROM produtos WHERE id = ?";
    
    try{
        Connection con = DB.conexao(); 
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet registro = stmt.executeQuery();
        
        while(registro.next()){
            this.setId(registro.getInt("id"));
            this.setNome(registro.getString("nome"));
            this.setNumero_vendas(registro.getDouble("numero de vendas"));     
        }

    }catch(SQLException e){      	
        System.out.println("Erro no Consulta Produto: " + e.toString()); 
    }
}
}

    public vendedores(int id, String nome, int numero_vendas) {
        this.id = id;
        this.nome = nome;
        this.numero_vendas = numero_vendas;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumero_vendas() {
        return numero_vendas;
    }
    public void setNumero_vendas(double d) {
        this.numero_vendas = d;
    }
    
}
