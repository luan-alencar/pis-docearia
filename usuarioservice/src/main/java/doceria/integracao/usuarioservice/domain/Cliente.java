package doceria.integracao.usuarioservice.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
@PrimaryKeyJoinColumn(name = "usuario_id")
public class Cliente extends Usuario {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;
}
