package br.com.igorn.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


// anotation do spring 
@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/primeiroMetodo")
    public String PrimeiroMetodo(){
        return "Hello Word !!!";
    }

    @GetMapping("/segundoMetodo/{id}")
    public String SegundoMetodo(@PathVariable String id){
        return "meu paramentro e: " + id;
    }

    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam String id){
        return "O paramentro com metodoComQueryParam e: " + id;
    }

    @GetMapping("/metodoComQueryParams2")
    public String metodoComQueryParams(@RequestParam Map<String, String> allParams){
        return "O paramentro com metodoComQueryParam e: " + allParams.entrySet();
    }

    @PostMapping("/metodoComBodyParams")
    public String metodoComBodyParams(@RequestBody Usuario usuario){
        return "metodoComBodyParams: " + usuario.username();
    }
    record Usuario(String username) {
    }

    @PostMapping("/metodoComHeaders")
    public String metodoComBodyParams(@RequestHeader("name") String name){
        return "metodoComHearders: " + name;
    }

    @PostMapping("/metodoComListHeaders")
    public String metodoComBodyParams(@RequestHeader Map<String,String> hearders){
        return "metodoComHearders: " + hearders.entrySet();
    }

    @GetMapping("/metodoResponseEntity")
    public ResponseEntity<Object> metodoResponseEntity(){
        return ResponseEntity.status(HttpStatus.CREATED).body("mensagen de erro");
    }

    @GetMapping("/metodoResponseEntity2/{id}")
    public ResponseEntity<Object> metodoResponseEntity(@PathVariable Long id){
        var usuario = new Usuario("Igor Nascimento");

        if(id > 5){
            return ResponseEntity.status(HttpStatus.OK).body(usuario);
        } 

        return ResponseEntity.badRequest().body("Numero menor que 5");

    }

}
