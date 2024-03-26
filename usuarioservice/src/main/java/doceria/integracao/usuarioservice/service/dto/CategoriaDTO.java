package doceria.integracao.usuarioservice.service.dto;

import lombok.Data;
import java.io.Serializable;
import java.util.List;

@Data
public class CategoriaDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private List<Integer> produtoIds;
}

