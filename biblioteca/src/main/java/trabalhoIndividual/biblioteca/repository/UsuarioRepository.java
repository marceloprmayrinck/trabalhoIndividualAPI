package trabalhoIndividual.biblioteca.repository;

import trabalhoIndividual.biblioteca.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
