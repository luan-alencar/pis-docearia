package doceria.integracao.produtoSerivce.resource;

import doceria.integracao.usuarioservice.domain.Produto;
import doceria.integracao.usuarioservice.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/produtos")
@RequiredArgsConstructor
public class ProdutoResource {

    private final ProdutoService produtoSerivce;

    @GetMapping
    public ResponseEntity<List<Produto>> listarProdutos() {
        return ResponseEntity.ok(produtoSerivce.listarProdutos());
    }

    @PostMapping
    public ResponseEntity<Produto> salvarUsuario(Produto produto) {
        return ResponseEntity.ok().body(produtoSerivce.salvar(produto));
    }

    @PutMapping
    public ResponseEntity<Produto> atualizar(Produto produto) {
        return ResponseEntity.ok(produtoSerivce.atualizar(produto));
    }

    @DeleteMapping
    public ResponseEntity<Produto> remover(Produto produto) {
        return ResponseEntity.ok(produtoSerivce.atualizar(produto));
    }
}
