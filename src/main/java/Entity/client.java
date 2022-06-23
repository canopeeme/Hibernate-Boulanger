package Entity;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "CLIENT",
        uniqueConstraints = { @UniqueConstraint(columnNames = { "CLIENT_ID" }) })
public class client {

    public client(Integer id, Long nom, Long prenom, Long telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    public client() {
    }

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "commande",
            joinColumns = { @JoinColumn(name = "CLIENT_ID") },
            inverseJoinColumns = { @JoinColumn(name = "PRODUIT_ID") }
    )


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "CLIENT_ID", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "CLIENT_NOM", nullable = false)
    private Long nom;

    public Long getNom() {
        return nom;
    }
    public void setNom(Long nom) {
        this.nom = nom;
    }

    @Column(name = "CLIENT_PRENOM", nullable = false)
    private Long prenom;

    public Long getPrenom() {
        return prenom;
    }

    public void setPrenom(Long prenom) {
        this.prenom = prenom;
    }

    @Column(name = "CLIENT_TEL", nullable = true)
    private Long telephone;

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }



}
