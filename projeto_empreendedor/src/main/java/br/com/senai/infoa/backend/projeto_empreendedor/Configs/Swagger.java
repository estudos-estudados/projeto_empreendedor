package br.com.senai.infoa.backend.projeto_empreendedor.Configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Empreenda Fácil",
        version = "1.0",
        description = "API para o sistema Empreenda Fácil"
    )
)
public class Swagger {

}