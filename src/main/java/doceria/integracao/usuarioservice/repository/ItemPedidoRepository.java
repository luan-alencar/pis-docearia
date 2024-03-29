package doceria.integracao.usuarioservice.repository;

import doceria.integracao.usuarioservice.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Long, Endereco> {
}
