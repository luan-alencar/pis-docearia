package doceria.integracao.usuarioservice.service;

import doceria.integracao.usuarioservice.domain.Usuario;
import doceria.integracao.usuarioservice.repository.UsuarioRepository;
import doceria.integracao.usuarioservice.service.dto.UsuarioDTO;
import doceria.integracao.usuarioservice.service.mapper.UsuarioMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;

    public List<UsuarioDTO> listarUsuarios() {
        List<Usuario> usuariosSalvos = usuarioRepository.findAll();
        return usuariosSalvos.stream().map(usuarioMapper::toDTO).collect(Collectors.toList());
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario nao encontrado"));
    }

    public Usuario salvar(Usuario usuario) {
//        if (usuario instanceof Colaborador) {
//            // TODO
//        } else if (usuario instanceof Cliente) {
//            // TODO
//        }
        return usuarioRepository.save(usuario);
    }

    @SneakyThrows
    public UsuarioDTO atualizar(Usuario usuario) {
        Usuario usuarioSalvo = usuarioRepository.findById(usuario.getId()).orElseThrow();
        this.salvar(usuarioSalvo);
        return usuarioMapper.toDTO(usuarioSalvo);
    }

    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }
}
