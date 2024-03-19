package doceria.integracao.usuarioservice.domain;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Table
@Entity
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @ManyToMany(mappedBy = "categorias")
    private List<Produto> produtos;

}
