package doceria.integracao.usuarioservice.repository;

import doceria.integracao.usuarioservice.domain.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaboradorRepository extends JpaRepository<Long, Colaborador> {
}
