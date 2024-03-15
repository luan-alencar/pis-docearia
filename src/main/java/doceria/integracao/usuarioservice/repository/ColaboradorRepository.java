package doceria.integracao.usuarioservice.repository;

import doceria.integracao.usuarioservice.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositry extends JpaRepository<Long, Usuario> {
}
