package isel.sisinf.model;

import jakarta.persistence.*;

@Entity
@Table(name = "contacto_email")
public class ContactoEmail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//BIGSERIAL
    @Column(name = "contacto_email_id")
    private Long id;

    @Column(name = "descricao", length = 50, nullable = false)
    private String descricao;

    @Column(name = "email", length = 254, nullable = false)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_nif", referencedColumnName = "nif", nullable = false)
    private Cliente cliente;

    public ContactoEmail() {}

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
}