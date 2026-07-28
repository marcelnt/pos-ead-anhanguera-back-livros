package br.livraria.biblioteca.livro;

import java.util.List;
public class LivroResponseDTO {
    private List<Livro> livros;

    public LivroResponseDTO(List<Livro> livros){
        this.livros = livros;
    }

    public  List<Livro> getLivros(){
        return livros;
    }
}
