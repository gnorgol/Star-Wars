import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

import java.util.Collection;
import java.util.ArrayList;
public class Film {
	
	String Titre ,numEpisode;
	int ann�eSortie,Cout,Recette;
	//Collection<Acteur>duet;
	ArrayList<Avis> LesAvis = new ArrayList<Avis>();
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
	void setListeAvis(ArrayList<Avis> LesAvis) {
		this.LesAvis = LesAvis;
		
	}
	void addListeAvis(Avis LesAvis) {
		this.LesAvis.add(LesAvis);
		
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
