package doceria.integracao.usuarioservice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "colaborador")
@PrimaryKeyJoinColumn(name = "usuario_id")
public class Colaborador extends Usuario {

    private Boolean gerente;
}
