package br.edu.ifpi.api_biblioteca.service;

import org.springframework.stereotype.Service;
import br.edu.ifpi.api_biblioteca.models.Livro;
import br.edu.ifpi.api_biblioteca.repository.LivroRepository;

import java.util.List;

@Service
public class LivroService {
    private final LivroRepository repository;
    public LivroService(LivroRepository repository) {
        this.repository = repository;
    }

    public Livro cadastrar(Livro livro)
    {
        return repository.save(livro);
    }

    public List<Livro> listar() {
        return repository.findAll();
    }

    public Livro buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
}