package trabalhoIndividual.biblioteca.repository;

import trabalhoIndividual.biblioteca.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
