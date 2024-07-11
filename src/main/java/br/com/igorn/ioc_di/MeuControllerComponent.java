package br.com.igorn.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/component")
public class MeuControllerComponent {

    @Autowired
    MeuComponente meuComponente;

    @GetMapping("/")
    public String chamandoMeuComponente(){

        // var meuComponente = new MeuComponente();
        var resultado = meuComponente.chamandoMeuComponente();
        return resultado;
    }
}