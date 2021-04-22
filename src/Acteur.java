import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
public class Acteur {
	String Nom,Prenom;
	
	
	public Acteur(String Nom,String Prenom) {
		
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
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		Acteur A1 = new Acteur("Lucas","George");
		Film F1 = new Film("La Menace fantôme",1999,"I",100000,300000);
		Film F2 = new Film("L'attaque des clones",2002,"II",500000,560000);
		System.out.println(F1);
		System.out.println(F2);
		String test;
		System.out.println("Saisir le titre : ");
		String titre = sc.nextLine();
		System.out.println("Saisir l'année : ");
		String annéeString = sc.nextLine();
		int annee = Integer.parseInt(annéeString);
		System.out.println("Saisir le numéro : ");
		String numéro = sc.nextLine();
		System.out.println("Saisir le Coût : ");
		String CountString = sc.nextLine();
		int Count = Integer.parseInt(CountString);
		System.out.println("Saisir la recette : ");
		String RecetteString = sc.nextLine();
		int Recette = Integer.parseInt(RecetteString);
		Film F3 = new Film(titre,annee,numéro,Count,Recette);
		System.out.println(F3);
		Personnage P1 = new Personnage("Skywalker","Luke");
		Personnage P2 = new Personnage("Vador","Dark");
		System.out.println(P1);
		Collection<Film> Trilogie;
		Trilogie = new ArrayList<Film>();
		Trilogie.add(F1);
		Trilogie.add(F2);
		Trilogie.add(F3);
		afficherTrilogie(Trilogie);
	}
	public static void afficherTrilogie(Collection<Film> Trilogie) {
		
		for(Film Value : Trilogie) {
			System.out.println(Value);
		}
		
	}
}
