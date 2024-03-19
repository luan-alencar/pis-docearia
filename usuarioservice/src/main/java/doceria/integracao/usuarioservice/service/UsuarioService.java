package doceria.integracao.usuarioservice.service;

import doceria.integracao.usuarioservice.domain.Cliente;
import doceria.integracao.usuarioservice.domain.Colaborador;
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

    public Usuario buscarPorID(Long id) {
        return usuarioRepository.findById(id).orElse(null);
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
        return usuarioRepository.save(usuarioSalvo);
    }

    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }
}
