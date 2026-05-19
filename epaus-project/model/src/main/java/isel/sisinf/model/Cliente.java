package isel.sisinf.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @Column(name = "nif", length = 20)
    private String nif;

    @Column(name = "cartao_cidadao", length = 20, unique = true, nullable = false)
    private String cartaoCidadao;

    @Column(name = "nome", length = 256, nullable = false)
    private String nome;

    public Cliente() {}

    public Cliente(String nif, String cartaoCidadao, String nome) {
        this.nif = nif;
        this.cartaoCidadao = cartaoCidadao;
        this.nome = nome;
    }

    public String getNif() { return nif; }
    public void setNif(String nif) { this.nif = nif; }

    public String getCartaoCidadao() { return cartaoCidadao; }
    public void setCartaoCidadao(String cartaoCidadao) { this.cartaoCidadao = cartaoCidadao; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

}