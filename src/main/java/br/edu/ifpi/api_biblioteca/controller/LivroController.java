package br.edu.ifpi.api_biblioteca.controller;

import br.edu.ifpi.api_biblioteca.models.Livro;
import br.edu.ifpi.api_biblioteca.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    private LivroService service;
    public LivroController(LivroService service) {
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<Livro> cadastrar(@RequestBody Livro livro){

    }
    @GetMapping
    public List<Livro> listar(){

    }
    public Livro buscarPorId(@PathVariable Long id){

    }
}