package doceria.integracao.usuarioservice.service;

import doceria.integracao.usuarioservice.domain.Categoria;
import doceria.integracao.usuarioservice.repository.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    public Categoria buscarPorId(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public Categoria atualizar(Categoria categoria) {
        Categoria categoriaSalva = categoriaRepository.findById(categoria.getId()).orElse(null);
        if (categoriaSalva != null) {
            return categoriaRepository.save(categoria);
        }
        return null;
    }

    public void deletar(Long id) {
        categoriaRepository.deleteById(id);
    }
}
