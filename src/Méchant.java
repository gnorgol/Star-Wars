
public class Méchant {

	boolean Obscur;
	
	public Méchant(boolean Obscur){
		
	this.Obscur = Obscur;
		
	}
	void setForce(boolean Obscur) {
		this.Obscur = Obscur;
	}
	boolean getForce() {
		return this.Obscur;
	}
	public String	toString() {
		return "Coté Obscur : "+this.Obscur;
	}
	
	
}
