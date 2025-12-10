package n1exercici1;

public class WindInstrument extends Instrument{

	static {
		System.out.println("La classe Vent s'ha carregat");
	}
	
	public WindInstrument(String name, int price) {
		super(name, price);
	}
	
	
	//métode sobreescrit
    @Override
	public void play() {
		System.out.println("Està sonant un instrument de vent");
	}
	
	
}
