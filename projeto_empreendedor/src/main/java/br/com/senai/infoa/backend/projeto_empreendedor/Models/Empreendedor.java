package br.com.senai.infoa.backend.projeto_empreendedor.Models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table (name = "empreendedor")
public class Empreendedor {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;
    
    @Column (name = "nome")
    private String nome;

    @Column (name = "cpf")
    private String cpf;

    @Column (name = "data_nascimento")
    private LocalDate data_nascimento;

    @ManyToOne 
    @JoinColumn (name = "endereco_id")
    private Endereco endereco;

    @ManyToMany 
    @JoinTable (
        name = "empreendedor_produto",
        joinColumns  = @JoinColumn (name = "empreendedor_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn (name = "produto_id", referencedColumnName = "id")
    )
    private List<Produto> produto;

    public Empreendedor() {
    }

    public Empreendedor(Integer id, String nome, String cpf, LocalDate data_nascimento, Endereco endereco,List<Produto> produto) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.endereco = endereco;
        this.produto = produto;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public List<Produto> getProduto(){
        return produto;
    }
    public void setProduto(List<Produto> produto){
        this.produto = produto;
    }
    
}
