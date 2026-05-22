package trabalhoIndividual.biblioteca.dtorequest;

import java.time.LocalDate;

public record EmprestimoDTORequest(LocalDate dataEmprestimo, LocalDate dataDevolucao) {
}
