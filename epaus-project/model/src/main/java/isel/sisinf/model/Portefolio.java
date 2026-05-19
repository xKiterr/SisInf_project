package isel.sisinf.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "portefolio")
public class Portefolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //BIGSERIAL
    @Column(name = "portefolio_id")
    private Long id;

    //many portfolios belong to one Client
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_nif", referencedColumnName = "nif", nullable = false)
    private Cliente cliente;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "valor_total", nullable = false, precision = 15, scale = 2)
    private BigDecimal valorTotal = BigDecimal.ZERO;

    public Portefolio() {}

    public Portefolio(Cliente cliente, String nome) {
        this.cliente = cliente;
        this.nome = nome;
    }

    public Long getId() { return id; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public BigDecimal getValorTotal() { return valorTotal; }
    public void setValorTotal(BigDecimal valorTotal) { this.valorTotal = valorTotal; }
}