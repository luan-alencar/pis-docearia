package doceria.integracao.colaboradorService.resource;

import doceria.integracao.usuarioservice.service.ColaboradorService;
import doceria.integracao.usuarioservice.service.dto.UsuarioDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/usuarios")
@RequiredArgsConstructor
public class ColaboradorResource {

    private final ColaboradorService colaboradorService;

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> listarUsuarios() {
        return ResponseEntity.ok(colaboradorService.listar());
    }


//    @GetMapping("/{id}")
//    public ResponseEntity<UsuarioDTO> buscarUsuarioPorID(@PathVariable Long id) {
//        return ResponseEntity.ok(colaboradorService.buscarPorId(id));
//    }
//
//    @PostMapping
//    public ResponseEntity<UsuarioDTO> salvarUsuario(@RequestBody Usuario usuario) {
//        return ResponseEntity.ok().body(colaboradorService.salvar(usuario));
//    }
//
//    @PutMapping
//    public ResponseEntity<UsuarioDTO> atualizar(@RequestBody Usuario usuario) {
//        return ResponseEntity.ok(colaboradorService.atualizar(usuario));
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        colaboradorService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
