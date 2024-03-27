package doceria.integracao.usuarioservice.service.dto;

import doceria.integracao.usuarioservice.service.enums.Roles;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class UsuarioDTO implements Serializable {

    private Long id;

    private String nome;

    private String cpf;

    private String email;

    private String telefone;

    private LocalDate dataNascimento;

    private Roles permissao;

    private Long endereco;
}
