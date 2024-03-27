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
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ColaboradorService {

    private final ColaboradorRepository colaboradorRepository;
    private final UsuarioRepository usuarioRepository;
    private final ColaboradorMapper colaboradorMapper;

    public List<UsuarioDTO> listar() {
        List<Colaborador> colaboradores = colaboradorRepository.findAll();

        return colaboradores.stream()
                .map(ColaboradorMapper.INSTANCE::usuarioToDTO)
                .collect(Collectors.toList());
    }

    @SneakyThrows
    public UsuarioDTO buscarUsuario(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("O usuário não existe."));
        return colaboradorMapper.INSTANCE.usuarioToDTO(usuario);
    }

    public UsuarioDTO salvarUsuario(UsuarioDTO dto) {
        Colaborador colaborador = ColaboradorMapper.INSTANCE.DTOtoColaborador(dto);
        usuarioRepository.save(colaborador);
        return ColaboradorMapper.INSTANCE.usuarioToDTO(colaborador);
    }

    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }
}
