package trabalhoIndividual.biblioteca.controller;


import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trabalhoIndividual.biblioteca.domain.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import trabalhoIndividual.biblioteca.domain.Usuario;
import trabalhoIndividual.biblioteca.dtorequest.LivroDTORequest;
import trabalhoIndividual.biblioteca.dtorequest.UsuarioDTORequest;
import trabalhoIndividual.biblioteca.repository.LivroRepository;
import trabalhoIndividual.biblioteca.service.LivroService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;
    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> lista(){
        return livroRepository.findAll();
    }


    @GetMapping("{id}")
    public Optional<Livro> buscarPorID(@PathVariable @Positive Long id) {
        return livroService.buscarPorID(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Livro inserir(@Valid @RequestBody Livro livro) {
        return livroRepository.save(livro);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizar(@PathVariable Long id, @RequestBody @Valid LivroDTORequest dto) {
        Livro atualizado = livroService.atualizar(id, dto);
        return ResponseEntity.ok(atualizado);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        livroService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
