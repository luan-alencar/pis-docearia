package doceria.integracao.usuarioservice.service.mapper;

import doceria.integracao.usuarioservice.domain.Colaborador;
import doceria.integracao.usuarioservice.service.dto.UsuarioDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface ColaboradorMapper extends EntityMapper <UsuarioDTO, Colaborador> {

    @Override
    UsuarioDTO toDTO(Colaborador entity);

    @Override
    Colaborador toEntity(UsuarioDTO dto);
}
