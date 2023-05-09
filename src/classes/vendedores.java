package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class vendedores {

    private int id;
    private String nome;
    private int numero_vendas;

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
    public void setNumero_vendas(int numero_vendas) {
        this.numero_vendas = numero_vendas;
    }
    
}
