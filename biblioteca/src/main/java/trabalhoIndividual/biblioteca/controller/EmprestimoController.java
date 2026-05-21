package trabalhoIndividual.biblioteca.controller;


import trabalhoIndividual.biblioteca.domain.Emprestimo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import trabalhoIndividual.biblioteca.repository.EmprestimoRepository;

import java.util.List;

@RestController
@RequestMapping("/Emprestimos")
public class EmprestimoController {

    @Autowired
    private EmprestimoRepository emprestimoRepository;

    @GetMapping
    public List<Emprestimo> lista() {
        return emprestimoRepository.findAll();
    }
}
