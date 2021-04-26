import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

import java.util.Collection;
import java.util.ArrayList;
public class Film {
	
	String Titre ,numEpisode;
	int ann�eSortie,Cout,Recette;
	//Collection<Acteur>duet;
	ArrayList<Acteur> duet = new ArrayList<Acteur>();
	
	public Film(String Titre , int ann�eSortie,String numEpisode , int Cout , int Recette,ArrayList<Acteur> duet) {
		
		this.Titre = Titre;
		this.ann�eSortie = ann�eSortie;
		this.numEpisode = numEpisode;
		this.Cout = Cout;
		this.Recette = Recette;
		this.duet  = duet ;
	}
	void setTitre(String Titre) {
		this.Titre = Titre;
		
	}
	void setAnn�eSortie(int ann�eSortie) {
		this.ann�eSortie = ann�eSortie;
			
	}
	void setnumEpisode(String numEpisode) {
		this.numEpisode = numEpisode;
	}
	void setCount(int Cout) {
		this.Cout = Cout;
	}
	void setRecette(int Recette) {
		this.Recette = Recette;
	}
	String getTitre() {
		 
		 return this.Titre; 
	 }
	int getann�eSortie() {
		 
		 return this.ann�eSortie; 
	 }
	String getnumEpisode() {
		 
		 return this.numEpisode; 
	 }
	
	int getCout() {
		 
		 return this.Cout; 
	 }
	int getRecette() {
		 
		 return this.Recette; 
	 }
	public String toString() {
		for(Acteur Value : duet) {
			System.out.println("Acteur : "+Value);
		}
		 return "Titre : "+this.Titre+" Ann�e de sortie : "+this.ann�eSortie+" num�ro Episode : "+this.numEpisode+" Ann�e de sortie : "+this.ann�eSortie +"Co�t : "+this.Cout+" Recette : "+this.Recette;
		 
	 }
	public int nbActeurs() {
		
		return this.duet.size();
	}
	public boolean isBefore(int ann�e) {
		
		if(ann�e<this.ann�eSortie) {
			return true;
		}
		else {
			return false;
		}
	}	

}
