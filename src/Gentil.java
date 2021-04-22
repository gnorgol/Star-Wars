
public class Gentil {

	boolean Force;
	
	public Gentil(boolean Force){
		
	this.Force = Force;
		
	}
	void setForce(boolean Force) {
		this.Force = Force;
	}
	boolean getForce() {
		return this.Force;
	}
	public String	toString() {
		return "Force : "+this.Force;
	}
	
}
