package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class vendas {

    private String nome_vendedor;
    private String nome_comprador;
    private int id_compra;
    private double valor_compra;
    private int quantidade;

    public vendas(String nome_vendedor, String nome_comprador, int id_compra, double valor_compra, int quantidade) {
        this.nome_vendedor = nome_vendedor;
        this.nome_comprador = nome_comprador;
        this.id_compra = id_compra;
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
        return id_compra;
    }
    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
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
