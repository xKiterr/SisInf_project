package isel.sisinf.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "posicao")
@IdClass(PosicaoId.class)
public class Posicao {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "portefolio", referencedColumnName = "portefolio_id")
    private Portefolio portefolio;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instrumento_isin", referencedColumnName = "instrumento_id")
    private Instrumento instrumento;

    @Column(name = "quantidade", nullable = false, precision = 15, scale = 4)
    private BigDecimal quantidade;

    public Posicao() {}

    public Posicao(Portefolio portefolio, Instrumento instrumento, BigDecimal quantidade) {
        this.portefolio = portefolio;
        this.instrumento = instrumento;
        this.quantidade = quantidade;
    }

    public Portefolio getPortefolio() { return portefolio; }
    public void setPortefolio(Portefolio portefolio) { this.portefolio = portefolio; }

    public Instrumento getInstrumento() { return instrumento; }
    public void setInstrumento(Instrumento instrumento) { this.instrumento = instrumento; }

    public BigDecimal getQuantidade() { return quantidade; }
    public void setQuantidade(BigDecimal quantidade) { this.quantidade = quantidade; }
}