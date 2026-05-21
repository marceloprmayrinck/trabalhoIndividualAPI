package trabalhoIndividual.biblioteca.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.Past;

import java.time.LocalDate;

@Entity
@Table(name = "emprestimo")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Past
    @Column(name = "data_Emprestimo", nullable = false)
    private LocalDate dataEmprestimo;

    @Column(name = "data_Devolucao", nullable = false)
    private LocalDate dataDevolucao;

}
