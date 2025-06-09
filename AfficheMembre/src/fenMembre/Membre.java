package fenMembre;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;
import java.util.HashMap;

public class Membre {
	private int id;
	private String nom; 
	private String prenom; 
	private String gender; 
	private LocalDate naiss; 
	private String adr; 
	private int cp; 
	private String city; 
	private int tel; 
	private String mail; 
	private String demoGala;
	private boolean etu; 
	private boolean comite;
	private String niv_danse;
	
	public Membre(String nom, String prenom, String gender, LocalDate naiss, String adr, int cp, String city, int tel, String mail, String demoGala, boolean etu, boolean comite) {
		this.id  = setId();
		this.nom = nom;
		this.prenom = prenom;
		this.gender = gender;
		this.naiss = naiss;
		this.adr = adr;
		this.cp = cp;
		this.city = city;
		this.tel = tel;
		this.mail = mail;
		this.demoGala = demoGala;
		this. etu = etu;
		this.comite = comite;
		this.niv_danse = "non_défini";
	}

	public String getAdr() {return adr;}
	public String getCity() {return city;}
	public int getcp() {return cp;}
	public String getDemoGala() {return demoGala;}
	public String getGender() {return gender;}
	public String getMail() {return mail;}
	public LocalDate getNaiss() {return naiss;}
	public String getNom() {return nom;}
	public String getPrenom() {return prenom;}
	public int getTel() {return tel;}
	public boolean getEtu(){return etu;}
	public boolean getComite(){return comite;}
	public String getNiv_danse() {return niv_danse;}
	int getId() {return id;}
	
	
	public void setAdr(String adr) {this.adr = adr;}
	public void setCity(String city) {this.city = city;}
	public void setcp(int cp) {this.cp = cp;}
	public void setComite(boolean comite) {this.comite = comite;}
	public void setDemoGala(String demoGala) {this.demoGala = demoGala;}
	public void setEtu(boolean etu) {this.etu = etu;}
	public void setGender(String gender) {this.gender = gender;}
	public void setMail(String mail) {this.mail = mail;}
	public void setNaiss(LocalDate naiss) {this.naiss = naiss;}
	public void setNiv_danse(String niv_danse) {this.niv_danse = niv_danse;}
	public void setNom(String nom) {this.nom = nom;}
	public void setPrenom(String prenom) {this.prenom = prenom;}
	public void setTel(int tel) {this.tel = tel;}


	public void modifierMembre(HashMap<String, String> args){
		for (String arg : args.keySet()) {
			switch (arg) {
				case "adr":
					setAdr(args.get(arg));
					break;
				case "city":
					setCity(args.get(arg));
					break;
				case "cp":
					setcp(Integer.parseInt(args.get(arg)));
					break;
				case "comite":
					setComite(Boolean.parseBoolean(args.get(arg)));
					break;
				case "demoGala":
					setDemoGala(args.get(arg));
					break;
				case "etu":
					setEtu(Boolean.parseBoolean(args.get(arg)));
					break;
				case "gender":
					setGender(args.get(arg));
					break;
				case "mail":
					setMail(args.get(arg));
					break;
				case "naiss":
					setNaiss(LocalDate.parse(args.get(arg)));
					break;
				case "niv_danse":
					setNiv_danse(args.get(arg));
					break;
				case "nom":
					setNom(args.get(arg));
					break;
				case "prenom":
					setPrenom(args.get(arg));
					break;
				case "tel":
					setTel(Integer.parseInt(args.get(arg)));
					break;			
				default:
				System.out.println("argument invalide trouvé : " + arg);
					break;
			}
		}
	}
	
	private int setId() {
		id = MembreList.getLastId() + 1;
		return id;
	}
}