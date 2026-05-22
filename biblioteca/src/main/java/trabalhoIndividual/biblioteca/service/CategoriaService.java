package trabalhoIndividual.biblioteca.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trabalhoIndividual.biblioteca.domain.Categoria;
import trabalhoIndividual.biblioteca.dtorequest.CategoriaDTORequest;
import trabalhoIndividual.biblioteca.repository.CategoriaRepository;

import java.util.Optional;

@Service
public class CategoriaService {


    @Autowired
    private CategoriaRepository categoriaRepository;


    public Optional<Categoria> buscarPorID(Long id) {
        return categoriaRepository.findById(id);
    }


    public Categoria atualizar(Long id, CategoriaDTORequest dto) {
        Categoria categoria = categoriaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Genero não encontrado"));

        categoria.setGenero(dto.genero());
        return categoriaRepository.save(categoria);
    }


    public void deletar(Long id) {
        Categoria categoria = categoriaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Genero não encontrado"));
        categoriaRepository.delete(categoria);
    }

}
