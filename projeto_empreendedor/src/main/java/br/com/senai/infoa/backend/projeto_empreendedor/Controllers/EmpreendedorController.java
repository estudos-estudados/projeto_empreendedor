package br.com.senai.infoa.backend.projeto_empreendedor.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.infoa.backend.projeto_empreendedor.Models.Empreendedor;
import br.com.senai.infoa.backend.projeto_empreendedor.Services.EmpreendedorService;

@RestController  
@RequestMapping("/empreendedor")
public class EmpreendedorController {
    
    @Autowired 
    private EmpreendedorService empreendedorService;

    @GetMapping("/contar")
    public Long contar() {
        return empreendedorService.contar();
    };

    @GetMapping("/list")
    public List<Empreendedor> list(){
        return empreendedorService.list();
    };

    @GetMapping("/buscar/{id}")
    public Empreendedor buscarporid(@PathVariable Integer id) {
        return empreendedorService.buscarporid(id);
    }
}
