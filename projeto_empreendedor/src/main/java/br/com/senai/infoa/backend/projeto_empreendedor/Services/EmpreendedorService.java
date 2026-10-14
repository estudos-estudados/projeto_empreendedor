package br.com.senai.infoa.backend.projeto_empreendedor.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.infoa.backend.projeto_empreendedor.Repositories.EmpreendedorRepository;


@Service 
public class EmpreendedorService {
    
    @Autowired 
    private EmpreendedorRepository empreendedorRepository;

    public Long contar() {
        return empreendedorRepository.count();
    };
}
