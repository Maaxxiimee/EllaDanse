package fenMembre;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MembreList {

	static private List<Membre> listmember = new ArrayList<>();
	
	static public void addMembre(Membre m) {
		listmember.add(m);
	}
	
	static public List getList() {
		return listmember;
	}
	 
	static public void delMembre(Membre m) {
		listmember.remove(m);
	}	
	
	static public int getLastId() {
		int returner = 0;
		if (listmember.size() > 0) {
			returner = listmember.get(listmember.size()-1).getId();			
		}
		return returner;
	}
	
	static public void createMember(String nom, String prenom, String gender, LocalDate naiss, String adr, int cp, String city, int tel, String mail, String demoGala, boolean etu, boolean comite) {
		Membre m = new Membre(nom, prenom, gender, naiss, adr, cp, city, tel, mail, demoGala, etu, comite);
	}
		
}