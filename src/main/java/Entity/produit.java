package Entity;

import org.hibernate.mapping.Set;

import javax.persistence.*;
import java.util.HashSet;


@Entity
@Table(name = "PRODUIT",
        uniqueConstraints = { @UniqueConstraint(columnNames = { "PRODUIT_ID" }) })
public class produit {


    public produit() {
    }



    public produit(Long produitId, Long produitName, Double produitPrix) {
        this.produitId = produitId;
        this.produitName = produitName;
        this.produitPrix = produitPrix;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "PRODUIT_ID", nullable = false, length = 100)

    private Long produitId;

    public Long getProduitId() {
        return produitId;
    }

    public void setProduitId(Long produitId) {
        this.produitId = produitId;
    }

    @Column(name = "PRODUIT_NAME", nullable = false)

    private Long produitName;

    public Long getProduitName() {
        return produitName;
    }

    public void setProduitName(Long produitName) {
        this.produitName = produitName;
    }

    @Column(name = "PRODUIT_PRIX", nullable = false)

    private Double produitPrix;

    public Double getProduitPrix() {
        return produitPrix;
    }

    public void setProduitPrix(Double produitPrix) {
        this.produitPrix = produitPrix;
    }
}
