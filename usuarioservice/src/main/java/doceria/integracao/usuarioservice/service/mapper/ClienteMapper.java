package doceria.integracao.usuarioservice.service.mapper;

import doceria.integracao.usuarioservice.domain.Cliente;
import doceria.integracao.usuarioservice.service.dto.ClienteDTO;
import doceria.integracao.usuarioservice.service.dto.UsuarioDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClienteMapper extends EntityMapper<ClienteDTO, Cliente> {

    @Override
    ClienteDTO toDTO(Cliente entity);

    @Override
    Cliente toEntity(ClienteDTO dto);
}
