package trabalhoIndividual.biblioteca.controller;


import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trabalhoIndividual.biblioteca.domain.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import trabalhoIndividual.biblioteca.domain.Usuario;
import trabalhoIndividual.biblioteca.dtorequest.CategoriaDTORequest;
import trabalhoIndividual.biblioteca.dtorequest.UsuarioDTORequest;
import trabalhoIndividual.biblioteca.repository.CategoriaRepository;
import trabalhoIndividual.biblioteca.service.CategoriaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> lista() {
        return categoriaRepository.findAll();
    }


    @GetMapping("{id}")
    public Optional<Categoria> buscarPorID(@PathVariable @Positive Long id) {
        return categoriaService.buscarPorID(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria inserir(@Valid @RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Categoria> atualizar(@PathVariable Long id, @RequestBody @Valid CategoriaDTORequest dto) {
        Categoria atualizado = categoriaService.atualizar(id, dto);
        return ResponseEntity.ok(atualizado);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        categoriaService.deletar(id);
        return ResponseEntity.noContent().build();
    }


}
