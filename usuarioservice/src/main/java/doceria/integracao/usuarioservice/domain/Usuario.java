package doceria.integracao.usuarioservice.domain;

import doceria.integracao.usuarioservice.service.enums.Roles;
import javax.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "usuario")
@Data
public abstract class Usuario implements Serializable {
    public static final long serialVersionUID = 1L;

    public String nome;

    public String cpf;

    public String email;

    public String telefone;

    public LocalDate dataNascimento;

    @Enumerated(EnumType.STRING)
    public Roles permissao;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;
}
