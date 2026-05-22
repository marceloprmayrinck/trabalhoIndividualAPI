package trabalhoIndividual.biblioteca.controller;


import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trabalhoIndividual.biblioteca.domain.PerfilAcessibilidade;
import org.springframework.beans.factory.annotation.Autowired;
import trabalhoIndividual.biblioteca.domain.Usuario;
import trabalhoIndividual.biblioteca.dtorequest.PerfilAcessibilidadeDTORequest;
import trabalhoIndividual.biblioteca.dtorequest.UsuarioDTORequest;
import trabalhoIndividual.biblioteca.repository.PerfilAcessibilidadeRepository;
import trabalhoIndividual.biblioteca.service.PerfilAcessibilidadeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/perfilacessibilidade")
public class PerfilAcessibilidadeController {

    @Autowired
    private PerfilAcessibilidadeRepository perfilAcessibilidadeRepository;
    @Autowired
    private PerfilAcessibilidadeService perfilAcessibilidadeService;


    @GetMapping
    public List<PerfilAcessibilidade> lista(){
        return perfilAcessibilidadeRepository.findAll();
    }


    @GetMapping("{id}")
    public Optional<PerfilAcessibilidade> buscarPorID(@PathVariable @Positive Long id) {
        return perfilAcessibilidadeService.buscarPorID(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PerfilAcessibilidade inserir(@Valid @RequestBody PerfilAcessibilidade perfilAcessibilidade) {
        return perfilAcessibilidadeRepository.save(perfilAcessibilidade);
    }


    @PutMapping("/{id}")
    public ResponseEntity<PerfilAcessibilidade> atualizar(@PathVariable Long id, @RequestBody @Valid PerfilAcessibilidadeDTORequest dto) {
        PerfilAcessibilidade atualizado = perfilAcessibilidadeService.atualizar(id, dto);
        return ResponseEntity.ok(atualizado);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        perfilAcessibilidadeService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
