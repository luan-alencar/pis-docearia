package doceria.integracao.usuarioservice.repository;

import doceria.integracao.usuarioservice.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepositry extends JpaRepository<Long, Pedido> {
}
