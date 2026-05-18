package domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Esse campo deve ser preenchido")
    @Size(max = 100)
    private String titulo;

    @NotBlank(message = "Esse campo deve ser preenchido")
    @Size(max = 50)
    private String editora;

    @Past
    private LocalDate lancamento;



}
