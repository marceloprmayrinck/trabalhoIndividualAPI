package trabalhoIndividual.biblioteca.service;


import trabalhoIndividual.biblioteca.domain.Usuario;
import trabalhoIndividual.biblioteca.dtorequest.UsuarioDTORequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trabalhoIndividual.biblioteca.repository.UsuarioRepository;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Optional<Usuario> buscarPorID(Long id) {
        return usuarioRepository.findById(id);
    }


    public Usuario atualizar(Long id, UsuarioDTORequest dto) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));

        usuario.setCpf(dto.cpf());
        usuario.setNome(dto.nome());
        usuario.setEmail(dto.email());
        return usuarioRepository.save(usuario);
    }


    public void deletar(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
        usuarioRepository.delete(usuario);
    }
}
