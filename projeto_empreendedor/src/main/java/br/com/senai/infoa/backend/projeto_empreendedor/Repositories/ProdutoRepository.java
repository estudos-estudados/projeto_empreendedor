package br.com.senai.infoa.backend.projeto_empreendedor.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.infoa.backend.projeto_empreendedor.Models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
    
}
