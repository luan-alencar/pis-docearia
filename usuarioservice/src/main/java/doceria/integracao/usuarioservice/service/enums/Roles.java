package doceria.integracao.usuarioservice.service.enums;

public enum Roles {

    GERAL(1L, "GERAL"),
    COLABORADOR(2L, "COLABORADOR"),
    CLIENTE(3L, "CLIENTE");

    private final Long id;
    private final String descricao;

    Roles(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
