package br.livraria.biblioteca.controller;

import br.livraria.biblioteca.livro.Livro;
import br.livraria.biblioteca.livro.LivroDTO;
import br.livraria.biblioteca.livro.LivroResponseDTO;
import br.livraria.biblioteca.livro.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/livro")

public class LivroController {
    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public LivroResponseDTO listarLivros() {
        List<Livro> livros = livroRepository.findAll();
        return new LivroResponseDTO(livros);

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void inserirLivro (@RequestBody LivroDTO dados){
        livroRepository.save(new Livro(null, dados.nome(), dados.descricao(), dados.isbn(), dados.foto()));
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void atualizarLivro(@PathVariable Long id, @RequestBody LivroDTO dados){
        var livro = livroRepository.getReferenceById(id);

        livro.atualizarLivro(dados);
        livroRepository.save(livro);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteLivro(@PathVariable Long id){
        livroRepository.deleteById(id);
    }


}
