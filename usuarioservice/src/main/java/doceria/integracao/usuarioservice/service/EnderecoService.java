package doceria.integracao.usuarioservice.service;

import doceria.integracao.usuarioservice.domain.Endereco;
import doceria.integracao.usuarioservice.repository.EnderecoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EnderecoService {

    private final EnderecoRepository enderecoRepository;

    public List<Endereco> listarColaboradores() {
        return enderecoRepository.findAll();
    }

    public Endereco buscarPorID(Long id) {
        return enderecoRepository.findById(id).orElse(null);
    }

    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public Endereco atualizar(Long id, Endereco endereco) {
        endereco.setId(id);
        return enderecoRepository.save(endereco);
    }

    public void deletar(Long id) {
        enderecoRepository.deleteById(id);
    }
}
