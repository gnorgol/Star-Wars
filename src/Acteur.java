import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class Acteur {
	String Nom,Prenom;
	ArrayList<Personnage> joue = new ArrayList<Personnage>();
	
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
		 
		 return this.Nom+" "+this.Prenom;	 
	 }
	public void addPersonnage(Personnage perso) {
		if(this.nbPersonnage() < 2) {
			this.joue.add(perso);
		}
		else {
			System.out.println("Il joue deja 2 personnage");
		}
	}
	public int nbPersonnage() {
		
		return this.joue.size();
		
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		Acteur A1 = new Acteur("Jackson","Samuel");
		Acteur A2 = new Acteur("Ford","Harrisson ");
		ArrayList<Acteur> duet  = new ArrayList<Acteur>();
		duet .add(A1);
		duet .add(A2);
		Film F1 = new Film("La Menace fantôme",1999,"I",100000,300000,duet);
		Film F2 = new Film("L'attaque des clones",2002,"II",500000,560000,duet);
		System.out.println(F1);
		System.out.println(F2);
		
		//Demmander film a l'utilisateur
		/* System.out.println("Saisir le titre : ");
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
		Film F3 = new Film(titre,annee,numéro,Count,Recette,duet);
		System.out.println(F3);
		*/
		Personnage P1 = new Personnage("Skywalker","Luke");
		Personnage P2 = new Personnage("Vador","Dark");
		Personnage P3 = new Personnage("Solo","Han");
		Personnage P4 = new Personnage("Jones","Indiana");
		
		
		
		System.out.println(P3);
		A2.addPersonnage(P3);//Acteur 2 joue Personnage 3
		A2.addPersonnage(P4);//Acteur 2 joue Personnage 4
		System.out.println(A2.nbPersonnage());//affiche nombre de personnage
		
		System.out.println(P1);
		Collection<Film> Trilogie;
		Trilogie = new ArrayList<Film>();
		Trilogie.add(F1);
		Trilogie.add(F2);
		//Trilogie.add(F3);
		afficherTrilogie(Trilogie);
		System.out.println(F1.nbActeurs());
		
		System.out.println("------------------------------------------------------");//Partie Avis
		
		
		Avis Avis1 = new Avis("Trés bon film",4, F2);
		Avis Avis2 = new Avis("Trés mauvais film",1, F2);
		Avis Avis3 = new Avis("Trés bon film",5, F1);
		Avis Avis4 = new Avis("Trés bon film",5, F2);
		F2.addListeAvis(Avis1);
		F2.addListeAvis(Avis2);
		F1.addListeAvis(Avis3);
		F2.addListeAvis(Avis4);
		
		System.out.println("note max = "+F2.getNoteMax());
		System.out.println("note min = "+F2.getNoteMin());
		System.out.println("note moy = "+F2.getNoteMoy());
		
	}
	public static void afficherTrilogie(Collection<Film> Trilogie) {
		for(Film Value : Trilogie) {
			System.out.println(Value);
		}
		
	}
}
