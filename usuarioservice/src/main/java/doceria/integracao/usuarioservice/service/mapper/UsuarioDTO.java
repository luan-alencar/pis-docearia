package doceria.integracao.usuarioservice.service.mapper;

import doceria.integracao.usuarioservice.domain.Cliente;
import doceria.integracao.usuarioservice.domain.Colaborador;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface UsuarioDTO extends EntityMapper<Colaborador, Cliente>{

}
