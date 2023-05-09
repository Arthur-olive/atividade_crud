package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class vendas {

    private String nome_vendedor;
    private String nome_comprador;
    private int id;
    private double valor_compra;
    private int quantidade;

    /**
     * @param id
     */
    public vendas(int id){
        if(id > 0){
    
        String sql = "SELECT * FROM produtos WHERE id = ?";
    
            try{
                Connection con = DB.conexao(); 
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setInt(1, id);
                ResultSet registro = stmt.executeQuery();
                
                while(registro.next()){
                    this.setNome_vendedor(sql);(registro.getString("nome do vendedor"));
                    this.setNome_comprador(sql);(registro.getString("nome do comprador"));
                    this.setId(id);(registro.getInt("id de compra"));
                    this.setValor_compra(id);(registro.getDouble("valor da compra"));   
                    this.setQuantidade(registro.getInt("quantidade"));     
                }

            }catch(SQLException e){      	
                System.out.println("Erro no Consulta da venda: " + e.toString()); 
            }
        }
        }


    public vendas(String nome_vendedor, String nome_comprador, int id, double valor_compra, int quantidade) {
        this.nome_vendedor = nome_vendedor;
        this.nome_comprador = nome_comprador;
        this.id = id;
        this.valor_compra = valor_compra;
        this.quantidade = quantidade;

    }
    public String getNome_vendedor() {
        return nome_vendedor;
    }
    public void setNome_vendedor(String nome_vendedor) {
        this.nome_vendedor = nome_vendedor;
    }
    public String getNome_comprador() {
        return nome_comprador;
    }
    public void setNome_comprador(String nome_comprador) {
        this.nome_comprador = nome_comprador;
    }
    public int getId_compra() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getValor_compra() {
        return valor_compra;
    }
    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
