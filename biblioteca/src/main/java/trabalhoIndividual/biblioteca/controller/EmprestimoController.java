package trabalhoIndividual.biblioteca.controller;


import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trabalhoIndividual.biblioteca.domain.Emprestimo;
import org.springframework.beans.factory.annotation.Autowired;
import trabalhoIndividual.biblioteca.domain.Usuario;
import trabalhoIndividual.biblioteca.dtorequest.EmprestimoDTORequest;
import trabalhoIndividual.biblioteca.dtorequest.UsuarioDTORequest;
import trabalhoIndividual.biblioteca.repository.EmprestimoRepository;
import trabalhoIndividual.biblioteca.service.EmprestimoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {

    @Autowired
    private EmprestimoRepository emprestimoRepository;
    @Autowired
    private EmprestimoService emprestimoService;

    @GetMapping
    public List<Emprestimo> lista() {
        return emprestimoRepository.findAll();
    }


    @GetMapping("{id}")
    public Optional<Emprestimo> buscarPorID(@PathVariable @Positive Long id) {
        return emprestimoService.buscarPorID(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Emprestimo inserir(@Valid @RequestBody Emprestimo emprestimo) {
        return emprestimoRepository.save(emprestimo);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Emprestimo> atualizar(@PathVariable Long id, @RequestBody @Valid EmprestimoDTORequest dto) {
        Emprestimo atualizado = emprestimoService.atualizar(id, dto);
        return ResponseEntity.ok(atualizado);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        emprestimoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

}
