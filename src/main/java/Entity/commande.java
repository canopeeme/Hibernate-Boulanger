package Entity;

import javax.persistence.*;

@Entity
@Table(name = "COMMANDE",
        uniqueConstraints = { @UniqueConstraint(columnNames = { "COMMANDE_ID" }) })

public class commande {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "COMMANDE_ID", nullable = false)

    private Long commandeId;

    public Long getcommandeId() {
        return commandeId;
    }

    public void setcommandeId(Long commandeId) {
        this.commandeId = commandeId;
    }
}
