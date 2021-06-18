import java.util.ArrayList;

public class Avis {
	
	
	
	Film F;
	String Avis;
	int note;
	
	public Avis(String Avis,int note,Film F) {
		
		if(note < 1 || note > 5) {
			
			throw new RuntimeException("Note non comprise entre 1 et 5");
			
		}
		else {
			this.note = note;
		}
		if(Avis.length() > 80) {
			
			throw new RuntimeException("Caractere au dessus de 80");
			
		}
		else {
			this.Avis = Avis;
		}
		this.F = F ;

		
	}
	void setNote(int note) {

		if(note < 1 || note > 5) {
			
			throw new RuntimeException("Note non comprise entre 1 et 5");
			
		}
		else {
			this.note = note;
		}
	}
	void SetCommentaire(String Avis) {
		if(Avis.length() > 80) {
	
			throw new RuntimeException("Caractere au dessus de 80");
			
		}
		else {
			this.Avis = Avis;
		}
		
		
	}
	String getCommentaire() {
		return this.Avis;
	}
	int getNote() {
		return this.note;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
