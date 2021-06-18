import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

import java.util.Collection;
import java.util.ArrayList;
public class Film {
	
	String Titre ,numEpisode;
	int annéeSortie,Cout,Recette;
	//Collection<Acteur>duet;
	ArrayList<Avis> LesAvis = new ArrayList<Avis>();
	ArrayList<Acteur> duet = new ArrayList<Acteur>();
	
	public Film(String Titre , int annéeSortie,String numEpisode , int Cout , int Recette,ArrayList<Acteur> duet) {
		
		this.Titre = Titre;
		this.annéeSortie = annéeSortie;
		this.numEpisode = numEpisode;
		this.Cout = Cout;
		this.Recette = Recette;
		this.duet  = duet ;
	}
	void setTitre(String Titre) {
		this.Titre = Titre;
		
	}
	void setAnnéeSortie(int annéeSortie) {
		this.annéeSortie = annéeSortie;
			
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
	void setListeAvis(ArrayList<Avis> LesAvis) {
		this.LesAvis = LesAvis;
		
	}
	void addListeAvis(Avis LesAvis) {
		this.LesAvis.add(LesAvis);
		
	}
	String getTitre() {
		 
		 return this.Titre; 
	 }
	int getannéeSortie() {
		 
		 return this.annéeSortie; 
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
	ArrayList<Avis> getLesAvis() {
		return this.LesAvis;
	}
	
	int getNoteMax() {
		int noteTemp , noteMax;
		noteMax = 0;
		for(Avis Value : LesAvis) {
			noteTemp = Value.note;
			if(noteTemp > noteMax) {
				noteMax = noteTemp;
			}
		}
		
		return noteMax;
	}
	int getNoteMin() {
		int noteTemp , noteMin;
		noteMin = 5;
		for(Avis Value : LesAvis) {
			noteTemp = Value.note;
			if(noteTemp < noteMin) {
				noteMin = noteTemp;
			}
		}
		
		return noteMin;
	}
	float getNoteMoy() {
		float noteTemp , noteMoy;
		noteMoy = 0 ;
		noteTemp = 0;
		for(Avis Value : LesAvis) {
			if(noteMoy == 0) {
				noteMoy = (float) Value.note/LesAvis.size();
				noteTemp = noteMoy;
			}
			else {
				noteMoy = (float) Value.note/LesAvis.size()+ noteTemp;
				noteTemp = noteMoy;
			}
		}
		
		return noteMoy;
	}

	
	
	public String toString() {
		for(Acteur Value : duet) {
			System.out.println("Acteur : "+Value);
		}
		 return "Titre : "+this.Titre+" Année de sortie : "+this.annéeSortie+" numéro Episode : "+this.numEpisode+" Année de sortie : "+this.annéeSortie +"Coût : "+this.Cout+" Recette : "+this.Recette;
		 
	 }
	public int nbActeurs() {
		
		return this.duet.size();
	}
	public boolean isBefore(int année) {
		
		if(année<this.annéeSortie) {
			return true;
		}
		else {
			return false;
		}
	}	

}
