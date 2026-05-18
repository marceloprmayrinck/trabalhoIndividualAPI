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
    @NotNull
    private String cpf;

    @NotBlank(message = "Esse campo deve ser preenchido")
    @Size(max = 60)
    private String nome;

    @NotBlank(message = "Esse campo deve ser preenchido")
    @Email(message = "Esse campo deve ser um email valido")
    @Size(max = 100)
    private String email;

}





