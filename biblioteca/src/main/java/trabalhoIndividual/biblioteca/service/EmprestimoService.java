package trabalhoIndividual.biblioteca.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import trabalhoIndividual.biblioteca.domain.Emprestimo;
import trabalhoIndividual.biblioteca.domain.Usuario;
import trabalhoIndividual.biblioteca.dtorequest.EmprestimoDTORequest;
import trabalhoIndividual.biblioteca.dtorequest.UsuarioDTORequest;
import trabalhoIndividual.biblioteca.repository.EmprestimoRepository;

import java.util.Optional;

@Service
public class EmprestimoService {


    @Autowired
    private EmprestimoRepository emprestimoRepository;


    public Optional<Emprestimo> buscarPorID(Long id) {
        return emprestimoRepository.findById(id);
    }


    public Emprestimo atualizar(Long id, EmprestimoDTORequest dto) {
        Emprestimo emprestimo = emprestimoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Nenhum emprestimo nessa data"));

        emprestimo.setDataEmprestimo(dto.dataEmprestimo());
        emprestimo.setDataDevolucao(dto.dataDevolucao());

        return emprestimoRepository.save(emprestimo);
    }


    public void deletar(Long id) {
        Emprestimo emprestimo = emprestimoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Nenhum emprestimo para receber nessa data"));
        emprestimoRepository.delete(emprestimo);
    }
}
