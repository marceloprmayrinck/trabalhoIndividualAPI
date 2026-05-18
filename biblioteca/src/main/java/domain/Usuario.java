package domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "Usuario")
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

}





