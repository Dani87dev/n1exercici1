package n1exercici1;

public abstract class Instrument {

	private String name;
	private int price;
	
	//Constructor
	public Instrument(String nom, int preu) {
		this.name = nom;
		this.price = preu;
	}
	
	//Getters && Setters
	public String getNom() {
		return this.name;
	}
	public int getPreu() {
		return this.price;
	}
	public void setNom(String nom ) {
		this.name = nom;
	}
	public void setPreu(int preu) {
		this.price = preu;
	}
	
	
	//Métodes
	public abstract void play();
		//sense implementar
}
