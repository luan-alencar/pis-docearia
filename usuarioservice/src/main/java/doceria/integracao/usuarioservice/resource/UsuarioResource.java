package doceria.integracao.usuarioservice.resource;

import doceria.integracao.usuarioservice.domain.Usuario;
import doceria.integracao.usuarioservice.service.UsuarioService;
import jakarta.ws.rs.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/usuarios")
@RequiredArgsConstructor
public class UsuarioResource {

    private final UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        return ResponseEntity.ok(usuarioService.listarUsuarios());
    }

    @PostMapping
    public ResponseEntity<Usuario> salvarUsuario(Usuario usuario) {
        return ResponseEntity.ok().body(usuarioService.salvar(usuario));
    }

    @PutMapping
    public ResponseEntity<Usuario> atualizar(Usuario usuario) {
        return ResponseEntity.ok(usuarioService.atualizar(usuario));
    }

    @DeleteMapping
    public ResponseEntity<Usuario> remover(Usuario usuario) {
        return ResponseEntity.ok(usuarioService.atualizar(usuario));
    }
}
