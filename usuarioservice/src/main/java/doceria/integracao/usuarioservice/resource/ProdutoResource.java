package doceria.integracao.usuarioservice.resource;

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

    private final ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<Produto>> listarProdutos() {
        return ResponseEntity.ok(produtoService.listarProdutos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarProdutoPorID(@PathVariable Long id) {
        return ResponseEntity.ok(produtoService.buscarPorID(id));
    }

    @PostMapping
    public ResponseEntity<Produto> salvarProduto(@RequestBody Produto produto) {
        return ResponseEntity.ok().body(produtoService.salvar(produto));
    }

    @PutMapping
    public ResponseEntity<Produto> atualizarProduto(@RequestBody Produto produto) {
        return ResponseEntity.ok(produtoService.atualizar(produto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerProduto(@PathVariable Long id) {
        produtoService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
