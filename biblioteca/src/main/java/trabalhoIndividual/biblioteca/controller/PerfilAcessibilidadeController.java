package trabalhoIndividual.biblioteca.controller;


import trabalhoIndividual.biblioteca.domain.PerfilAcessibilidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trabalhoIndividual.biblioteca.repository.PerfilAcessibilidadeRepository;

import java.util.List;

@RestController
@RequestMapping("/perfilAcessibilidade")
public class PerfilAcessibilidadeController {

    @Autowired
    private PerfilAcessibilidadeRepository perfilAcessibilidadeRepository;


    @GetMapping
    public List<PerfilAcessibilidade> lista(){
        return perfilAcessibilidadeRepository.findAll();
    }

}
