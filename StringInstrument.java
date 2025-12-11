package n1exercici1;

public class StringInstrument extends Instrument {

	static {
		System.out.println("StringInstrument class is loaded");
	}
	
	public StringInstrument(String name, int price) {
		super(name, price);
	}
	
	
	//métode sobreescrit
    @Override
	public void play() {
		System.out.println("A string  instrument is playing");
	}
}
