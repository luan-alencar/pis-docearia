package doceria.integracao.usuarioservice.service;

import doceria.integracao.usuarioservice.domain.Produto;
import doceria.integracao.usuarioservice.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto buscarPorID(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto atualizar(Produto produto) {
        Produto produtoSalvo = produtoRepository.findById(produto.getId()).orElseThrow();
        produtoSalvo.setNome(produto.getNome());
        produtoSalvo.setPreco(produto.getPreco());
        produtoSalvo.setCategorias(produto.getCategorias());
        return produtoRepository.save(produtoSalvo);
    }


    public void deletar(Long id) {
        produtoRepository.deleteById(id);
    }
}
