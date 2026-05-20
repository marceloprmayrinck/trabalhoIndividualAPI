package controller;


import domain.Usuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.UsuarioRepository;
import service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/Usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> lista(){
        return usuarioRepository.findAll();
    }


    @GetMapping("{/id}")
    public ResponseEntity<Usuario> buscarPorID(@PathVariable @Positive Long id) {
        return UsuarioService.buscarPorID(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario inserir(@Valid @RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @PutMapping("{/id}")


    @DeleteMapping("{/id}")

}
