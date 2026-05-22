package trabalhoIndividual.biblioteca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trabalhoIndividual.biblioteca.domain.Livro;
import trabalhoIndividual.biblioteca.domain.Usuario;
import trabalhoIndividual.biblioteca.dtorequest.LivroDTORequest;
import trabalhoIndividual.biblioteca.dtorequest.UsuarioDTORequest;
import trabalhoIndividual.biblioteca.repository.LivroRepository;

import java.util.Optional;

@Service
public class LivroService {


    @Autowired
    private LivroRepository livroRepository;


    public Optional<Livro> buscarPorID(Long id) {
        return livroRepository.findById(id);
    }


    public Livro atualizar(Long id, LivroDTORequest dto) {
        Livro livro = livroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado"));

        livro.setTitulo(dto.titulo());
        livro.setEditora(dto.editora());
        livro.setAutor(dto.autor());
        livro.setLancamento(dto.lancamento());
        return livroRepository.save(livro);
    }


    public void deletar(Long id) {
        Livro livro = livroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado"));
        livroRepository.delete(livro);
    }
}
