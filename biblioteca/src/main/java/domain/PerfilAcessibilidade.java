package domain;


import jakarta.persistence.*;

@Entity
@Table(name = "perfilAcessibilidade")
public class PerfilAcessibilidade {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_usuario", nullable = false, unique = true)
    private Usuario usuario;
}
