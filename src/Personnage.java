import java.util.Collection;

public class Personnage {
	
	String Nom,Prenom;
	public Personnage(String Nom,String Prenom) {
		
		this.Nom = Nom;
		this.Prenom = Prenom;
	}
	void setNom(String Nom) {
		this.Nom = Nom;
		
	}
	void setPrenom(String Prenom) {
		this.Prenom = Prenom;
	}
	String getNom() {
		 
		 return this.Nom; 
	 }
	String getPrenom() {
		 
		 return this.Prenom; 
	 }
	public String toString() {
		 
		 return "Nom : "+this.Nom+" Prenom : "+this.Prenom;
		 
	 }
	
	
}
