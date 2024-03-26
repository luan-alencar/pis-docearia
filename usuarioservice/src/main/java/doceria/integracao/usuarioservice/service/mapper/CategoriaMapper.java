package doceria.integracao.usuarioservice.service.mapper;

import doceria.integracao.usuarioservice.domain.Categoria;
import doceria.integracao.usuarioservice.service.dto.CategoriaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoriaMapper extends EntityMapper <CategoriaDTO, Categoria>{

}
