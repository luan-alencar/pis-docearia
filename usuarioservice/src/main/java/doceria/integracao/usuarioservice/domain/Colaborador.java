package doceria.integracao.usuarioservice.domain;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "colaborador")
@PrimaryKeyJoinColumn(name = "usuario_id")
public class Colaborador extends Usuario {

    private Boolean gerente;
}
