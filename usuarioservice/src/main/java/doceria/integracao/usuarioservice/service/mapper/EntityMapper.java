package doceria.integracao.usuarioservice.service.mapper;

import org.mapstruct.Mapper;

public interface EntityMapper <D, E>{

    E toEntity(D dto);
    D toDTO(E entity);
}
