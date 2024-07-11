package br.com.igorn.ioc_di;

// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component
@Service
public class MeuComponente {

    public String chamandoMeuComponente(){
        return "Chamando meu component";
    }
}
