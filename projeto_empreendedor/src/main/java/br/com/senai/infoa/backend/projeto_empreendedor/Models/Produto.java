package br.com.senai.infoa.backend.projeto_empreendedor.Models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name = "produto")
public class Produto {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;

    @Column (name = "nome")
    private String nome;

    @Column (name = "data_fabricacao")
    private LocalDate data_fabicacao;

    @Column (name = "preco")
    private Double preco;
    
    public Produto() {
    }

    public Produto(Integer id, String nome, LocalDate data_fabicacao, Double preco) {
        this.id = id;
        this.nome = nome;
        this.data_fabicacao = data_fabicacao;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData_fabicacao() {
        return data_fabicacao;
    }

    public void setData_fabicacao(LocalDate data_fabicacao) {
        this.data_fabicacao = data_fabicacao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
