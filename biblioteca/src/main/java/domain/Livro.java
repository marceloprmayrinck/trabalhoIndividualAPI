package domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

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
    @Column(name = "lançamento", nullable = false)
    private LocalDate lancamento;



}
