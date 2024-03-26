package doceria.integracao.usuarioservice.service.mapper;

import doceria.integracao.usuarioservice.domain.Categoria;
import doceria.integracao.usuarioservice.domain.Usuario;
import doceria.integracao.usuarioservice.service.dto.CategoriaDTO;
import doceria.integracao.usuarioservice.service.dto.UsuarioDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper extends EntityMapper <UsuarioDTO, Usuario>{

}
