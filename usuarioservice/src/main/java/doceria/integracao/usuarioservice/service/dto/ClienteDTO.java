package doceria.integracao.usuarioservice.service.dto;

import doceria.integracao.usuarioservice.service.enums.Roles;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class ClienteDTO extends UsuarioDTO implements Serializable {
    private static final long serialVersionUID = 1L;
}
