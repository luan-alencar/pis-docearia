package doceria.integracao.usuarioservice.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "endereco")
@Data
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String rua;

    private String numero;

    private String complemento;

    private String cidade;

    private String estado;

    private String cep;
}
