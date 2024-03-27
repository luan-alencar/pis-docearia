package doceria.integracao.usuarioservice.domain;

import javax.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Table
@Entity
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "estado_id") // definindo o nome da chave estrangeira no DB
    private Estado estado;

}
