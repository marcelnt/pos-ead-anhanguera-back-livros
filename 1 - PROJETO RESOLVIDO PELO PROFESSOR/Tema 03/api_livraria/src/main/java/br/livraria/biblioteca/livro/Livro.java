package br.livraria.biblioteca.livro;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "tbl_livro")
@Entity(name = "Livro")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private String isbn;
    private String foto;

    public  void atualizarLivro (LivroDTO livro){
        this.nome = livro.nome();
        this.descricao = livro.descricao();
        this.isbn = livro.isbn();
        this.foto = livro.foto();
    }


}
