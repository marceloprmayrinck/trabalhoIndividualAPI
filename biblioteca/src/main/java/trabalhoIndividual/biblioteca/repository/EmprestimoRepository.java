package trabalhoIndividual.biblioteca.repository;

import trabalhoIndividual.biblioteca.domain.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
}
