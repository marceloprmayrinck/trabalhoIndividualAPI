package trabalhoIndividual.biblioteca.controller;


import trabalhoIndividual.biblioteca.domain.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trabalhoIndividual.biblioteca.repository.LivroRepository;

import java.util.List;

@RestController
@RequestMapping("/Livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    public List<Livro> lista(){
        return livroRepository.findAll();
    }
}
