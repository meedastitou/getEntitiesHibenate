package testaa;
// Generated 9 juin 2023, 00:46:10 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Vendeur generated by hbm2java
 */
@Entity
@Table(name = "vendeur", catalog = "immobilier")
public class Vendeur implements java.io.Serializable {

	private Integer idVendeur;
	private String nom;
	private String prenom;
	private String cne;
	private String tel;
	private String email;

	public Vendeur() {
	}

	public Vendeur(String nom, String prenom, String cne, String tel, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.cne = cne;
		this.tel = tel;
		this.email = email;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_vendeur", unique = true, nullable = false)
	public Integer getIdVendeur() {
		return this.idVendeur;
	}

	public void setIdVendeur(Integer idVendeur) {
		this.idVendeur = idVendeur;
	}

	@Column(name = "nom", nullable = false)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "prenom", nullable = false)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "cne", nullable = false)
	public String getCne() {
		return this.cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	@Column(name = "tel", nullable = false)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "email", nullable = false)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
