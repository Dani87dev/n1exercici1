package n1exercici1;

public abstract class Instrument {

	private String name;
	private int price;
	
	//Constructor
	public Instrument(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//Getters && Setters
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public void setName(String nom ) {
		this.name = name;
	}
	public void setPrice(int preu) {
		this.price = price;
	}
	
	
	//Métodes
	public abstract void play();
		//without implementing
}
