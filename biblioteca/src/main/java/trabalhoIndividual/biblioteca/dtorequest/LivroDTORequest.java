package trabalhoIndividual.biblioteca.dtorequest;

import java.time.LocalDate;

public record LivroDTORequest (String titulo, String editora, String autor, LocalDate lancamento){
}
