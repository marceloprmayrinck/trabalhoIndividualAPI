package trabalhoIndividual.biblioteca.domain;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "livro")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Esse campo deve ser preenchido")
    @Size(max = 100)
    @Column(name = "titulo", nullable = false, length = 100)
    private String titulo;

    @NotBlank(message = "Esse campo deve ser preenchido")
    @Size(max = 50)
    @Column(name = "editora", nullable = false, length = 50)
    private String editora;

    @NotBlank(message = "Esse campo deve ser preenchido")
    @Size(max = 60)
    @Column(name = "autor", nullable = false, length = 60)
    private String autor;

    @Past
    @Column(name = "lancamento", nullable = false)
    private LocalDate lancamento;


    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;


    @ManyToMany(mappedBy = "livros")
    @JsonIgnoreProperties("livros")
    private Set<Categoria> categorias;


    public Livro(Long id, String titulo, String editora, String autor, LocalDate lancamento, Usuario usuario, Set<Categoria> categorias) {
        this.id = id;
        this.titulo = titulo;
        this.editora = editora;
        this.autor = autor;
        this.lancamento = lancamento;
        this.usuario = usuario;
        this.categorias = categorias;
    }

    public Livro() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Set<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Set<Categoria> categorias) {
        this.categorias = categorias;
    }
}
