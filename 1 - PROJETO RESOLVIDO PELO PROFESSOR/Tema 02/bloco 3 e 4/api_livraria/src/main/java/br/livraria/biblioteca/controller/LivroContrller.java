package br.livraria.biblioteca.controller;

import br.livraria.biblioteca.livro.Livro;
import br.livraria.biblioteca.livro.LivroDTO;
import br.livraria.biblioteca.livro.LivroResponseDTO;
import br.livraria.biblioteca.livro.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/livro")

public class LivroController {
    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    public LivroResponseDTO listarLivros() {
        List<Livro> livros = livroRepository.findAll();
        return new LivroResponseDTO(livros);

    }


}
