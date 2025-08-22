package dev.java10x.CadastroAtletas.Atletas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping

public class AtletaController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return " Essa é minha primeira mensagem";
    }



}
