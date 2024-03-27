package doceria.integracao.usuarioservice.domain;

import doceria.integracao.usuarioservice.service.enums.Roles;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public abstract class  Usuario   implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String nome;

    private String cpf;

    private String email;

    private String telefone;

    private LocalDate dataNascimento;

    private Roles permissao;
}
