package doceria.integracao.usuarioservice.service;

import doceria.integracao.usuarioservice.domain.Usuario;
import doceria.integracao.usuarioservice.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario nao encontrado"));
    }

    public Usuario salvar(Usuario usuario) {
        usuario.setAdmin(false);
//        if (usuario instanceof Colaborador) {
//            // TODO
//        } else if (usuario instanceof Cliente) {
//            // TODO
//        }
        return usuarioRepository.save(usuario);
    }

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
