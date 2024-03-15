package doceria.integracao.usuarioservice.repository;

import doceria.integracao.usuarioservice.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepositry extends JpaRepository<Long, Produto> {
}
