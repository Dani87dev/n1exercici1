package n1exercici1;

public class StringInstrument extends Instrument {

	static {
		System.out.println("La classe violí s'ha carregat");
	}
	
	public StringInstrument(String name, int price) {
		super(name, price);
	}
	
	
	//métode sobreescrit
    @Override
	public void play() {
		System.out.println("Està sonant un instrument de corda");
	}
}
