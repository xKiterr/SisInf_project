package isel.sisinf.model;

import java.io.Serializable;
import java.util.Objects;

//composite primary key for Posicao
public class PosicaoId implements Serializable {
    private Long portefolio;
    private Instrumento instrumento;

    public PosicaoId() {}

    public PosicaoId(Long portefolio, Instrumento instrumento) {
        this.portefolio = portefolio;
        this.instrumento = instrumento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PosicaoId that = (PosicaoId) o;
        return Objects.equals(portefolio, that.portefolio) &&
                Objects.equals(instrumento, that.instrumento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portefolio, instrumento);
    }
}