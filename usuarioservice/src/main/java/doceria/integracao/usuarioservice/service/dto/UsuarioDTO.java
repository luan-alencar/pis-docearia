package doceria.integracao.usuarioservice.service.dto;

import jakarta.validation.constraints.Email;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class UsuarioDTO implements Serializable {

    private String nome;

    @CPF
    private String cpf;

    @Email
    private String email;

    private String telefone;

    private LocalDate dataNascimento;

}
