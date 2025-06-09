package modele;

import javafx.beans.property.*;

public class Employe {
	private final StringProperty prenom;
	private final StringProperty nom;
	private final StringProperty adresse;
	private final StringProperty email;
	private final IntegerProperty jour;
	private final IntegerProperty mois;
	private final IntegerProperty annee;
	private final IntegerProperty age;
	private final StringProperty niveauDanse;
	private final StringProperty saison;
	private final StringProperty cours;

	public Employe() {
		this.prenom = new SimpleStringProperty();
		this.nom = new SimpleStringProperty();
		this.adresse = new SimpleStringProperty();
		this.email = new SimpleStringProperty();
		this.jour = new SimpleIntegerProperty();
		this.mois = new SimpleIntegerProperty();
		this.annee = new SimpleIntegerProperty();
		this.age = new SimpleIntegerProperty();
		this.niveauDanse = new SimpleStringProperty();
		this.saison = new SimpleStringProperty();
		this.cours = new SimpleStringProperty();
	}
	public Employe(String prenom, String nom, String adresse, String email, int jour, int mois, int annee, int age, String niveauDanse, String saison, String cours) {
		this.prenom = new SimpleStringProperty(prenom);
		this.nom = new SimpleStringProperty(nom);
		this.adresse = new SimpleStringProperty(adresse);
		this.email = new SimpleStringProperty(email);
		this.jour = new SimpleIntegerProperty(jour);
		this.mois = new SimpleIntegerProperty(mois);
		this.annee = new SimpleIntegerProperty(annee);
		this.age = new SimpleIntegerProperty(age);
		this.niveauDanse = new SimpleStringProperty(niveauDanse);
		this.saison = new SimpleStringProperty(saison);
		this.cours = new SimpleStringProperty(cours);
	}

	public String getNom() {
		return nom.get();
	}
	public void setNom(String nom) {
		this.nom.set(nom);
	}
	public StringProperty nomProperty() {
		return this.nom;
	}
	
	public String getPrenom() {
		return prenom.get();
	}
	public void setPrenom(String prenom) {
		this.prenom.set(prenom);
	}
	public StringProperty prenomProperty() {
		return this.prenom;
	}

	public String getAdresse() {
		return adresse.get();
	}
	public void setAdresse(String adresse) {
		this.adresse.set(adresse);
	}
	public StringProperty adresseProperty() {
		return this.adresse;
	}

	public String getEmail() {
		return email.get();
	}
	public void setEmail(String email) {
		this.email.set(email);
	}
	public StringProperty emailProperty() {
		return this.email;
	}

	public int getJour() {
		return jour.get();
	}
	public void setJour(int jour) {
		this.jour.set(jour);
	}	
	// Pas de property sur int

	public int getMois() {
		return mois.get();
	}
	public void setMois(int mois) {
		this.mois.set(mois);
	}	
	
	public int getAnnee() {
		return annee.get();
	}
	public void setAnnee(int annee) {
		this.annee.set(annee);
	}	

	public int getAge() {
		return age.get();
	}
	public void setAge(int age) {
		this.age.set(age);
	}	

	public String getNiveauDanse() {
		return niveauDanse.get();
	}
	public void setNiveauDanse(String niveauDanse) {
		this.niveauDanse.set(niveauDanse);
	}
	public StringProperty niveauDanseProperty() {
		return this.niveauDanse;
	}

	public String getSaison() {
		return saison.get();
	}
	public void setSaison(String saison) {
		this.saison.set(saison);
	}
	public StringProperty saisonProperty() {
		return this.saison;
	}
	
	public String getCours() {
		return cours.get();
	}
	public void setCours(String cours) {
		this.cours.set(cours);
	}
	public StringProperty coursProperty() {
		return this.cours;
	}
	
	public void affiche() {
		System.out.println("Prenom : " + this.getPrenom());
		System.out.println("Nom : " + this.getNom());
		System.out.println("Adresse : " + this.getAdresse());
		System.out.println("Email : " + this.getEmail());
		System.out.println("Jour : " + this.getJour());
		System.out.println("Mois : " + this.getMois());
		System.out.println("Annne : " + this.getAnnee());
		System.out.println("Age : " + this.getAge());
		System.out.println("Saison : " + this.getSaison());
		System.out.println("Cours : " + this.getCours());
	}
	
}
