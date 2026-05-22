package trabalhoIndividual.biblioteca.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "perfilAcessibilidade")
public class PerfilAcessibilidade {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O campo deve ser preenchido")
    @Size(max = 10)
    @Column(name = "numCarteira", nullable = false, length = 10)
    private String numCarteira;

    @OneToOne
    @JoinColumn(name = "id_usuario", nullable = false, unique = true)
    private Usuario usuario;


    public PerfilAcessibilidade(Long id, String numCarteira, Usuario usuario) {
        this.id = id;
        this.numCarteira = numCarteira;
        this.usuario = usuario;
    }

    public PerfilAcessibilidade() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumCarteira() {
        return numCarteira;
    }

    public void setNumCarteira(String numCarteira) {
        this.numCarteira = numCarteira;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
