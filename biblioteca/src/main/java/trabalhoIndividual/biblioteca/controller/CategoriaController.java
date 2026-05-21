package trabalhoIndividual.biblioteca.controller;


import trabalhoIndividual.biblioteca.domain.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trabalhoIndividual.biblioteca.repository.CategoriaRepository;

import java.util.List;

@RestController
@RequestMapping("/Categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> lista() {
        return categoriaRepository.findAll();
    }
}
