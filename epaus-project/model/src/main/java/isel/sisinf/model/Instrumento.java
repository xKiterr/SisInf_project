package isel.sisinf.model;

import jakarta.persistence.*;

@Entity
@Table(name = "instrumento")
public class Instrumento {

    @Id
    @Column(name = "instrumento_id", length = 12)
    private String id;

    @Column(name = "descricao", length = 256, nullable = false)
    private String descricao;

    public Instrumento() {}

    public String getId() { return id; }
    public String getDescricao() { return descricao; }
}