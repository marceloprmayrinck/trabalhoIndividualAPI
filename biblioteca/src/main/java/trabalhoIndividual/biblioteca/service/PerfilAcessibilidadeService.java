package trabalhoIndividual.biblioteca.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trabalhoIndividual.biblioteca.domain.PerfilAcessibilidade;
import trabalhoIndividual.biblioteca.dtorequest.PerfilAcessibilidadeDTORequest;
import trabalhoIndividual.biblioteca.repository.PerfilAcessibilidadeRepository;

import java.util.Optional;

@Service
public class PerfilAcessibilidadeService {

    @Autowired
    private PerfilAcessibilidadeRepository perfilAcessibilidadeRepository;


    public Optional<PerfilAcessibilidade> buscarPorID(Long id) {
        return perfilAcessibilidadeRepository.findById(id);
    }


    public PerfilAcessibilidade atualizar(Long id, PerfilAcessibilidadeDTORequest dto) {
        PerfilAcessibilidade perfilAcessibilidade = perfilAcessibilidadeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));

        perfilAcessibilidade.setNumCarteira(dto.numCarteira());

        return perfilAcessibilidadeRepository.save(perfilAcessibilidade);
    }


    public void deletar(Long id) {
        PerfilAcessibilidade perfilAcessibilidade = perfilAcessibilidadeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
        perfilAcessibilidadeRepository.delete(perfilAcessibilidade);
    }
}
