package doceria.integracao.usuarioservice.service;

import doceria.integracao.usuarioservice.domain.Cliente;
import doceria.integracao.usuarioservice.domain.Colaborador;
import doceria.integracao.usuarioservice.domain.Usuario;
import doceria.integracao.usuarioservice.repository.ColaboradorRepository;
import doceria.integracao.usuarioservice.repository.UsuarioRepository;
import doceria.integracao.usuarioservice.service.dto.UsuarioDTO;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ColaboradorService {

    private final ColaboradorRepository colaboradorRepository;
    private final UsuarioRepository usuarioRepository;

    public List<UsuarioDTO> listar() {
        List<Colaborador> colaboradores = colaboradorRepository.findAll();

        return null;
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario nao encontrado"));
    }

//    public UsuarioDTO salvarColaborador(Colaborador colaborador) {
//
//        return usuarioRepository.save(colaborador);
//    }
//
//    public UsuarioDTO salvarCliente(Cliente cliente) {
//
//        return usuarioRepository.save(cliente);
//    }

    @SneakyThrows
    public Usuario atualizar(Usuario usuario) {
        Usuario usuarioSalvo = usuarioRepository.findById(usuario.getId()).orElseThrow();
        usuarioSalvo.setId(usuario.getId());
        usuarioSalvo.setNome(usuario.getNome());
        usuarioSalvo.setCpf(usuario.getCpf());
        usuarioSalvo.setEmail(usuario.getEmail());
        usuarioSalvo.setId(usuario.getId());
        usuarioSalvo.setTelefone(usuario.getTelefone());
        usuarioSalvo.setDataNascimento(usuario.getDataNascimento());
        return usuarioRepository.save(usuarioSalvo);
    }

    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }
}
