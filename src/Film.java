public class Film {
	
	String Titre ,numEpisode;
	int annéeSortie,Cout,Recette;
	
	public Film(String Titre , int annéeSortie,String numEpisode , int Cout , int Recette) {
		
		this.Titre = Titre;
		this.annéeSortie = annéeSortie;
		this.numEpisode = numEpisode;
		this.Cout = Cout;
		this.Recette = Recette;
		
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
	public String toString() {
		 
		 return "Titre : "+this.Titre+" Année de sortie : "+this.annéeSortie+" numéro Episode : "+this.numEpisode+" Année de sortie : "+this.annéeSortie +"Coût : "+this.Cout+" Recette : "+this.Recette;
		 
	 }

}
