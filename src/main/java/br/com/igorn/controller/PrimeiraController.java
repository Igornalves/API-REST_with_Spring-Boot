package br.com.igorn.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}
