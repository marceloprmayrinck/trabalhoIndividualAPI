package trabalhoIndividual.biblioteca.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;


@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Esse campo deve ser preenchido")
    @Size(min = 11, max = 11)
    @Column(name = "cpf", nullable = false, length = 11)
    @NotNull
    private String cpf;

    @NotBlank(message = "Esse campo deve ser preenchido")
    @Size(max = 60)
    @Column(name = "nome", nullable = false, length = 60)
    private String nome;

    @NotBlank(message = "Esse campo deve ser preenchido")
    @Email(message = "Esse campo deve ser um email valido")
    @Size(max = 100)
    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @OneToMany(mappedBy = "usuario")
    private List<Livro> livros;

    public Usuario(Long id, String cpf, String nome, String email, List<Livro> livros) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.livros = livros;
    }

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
}





