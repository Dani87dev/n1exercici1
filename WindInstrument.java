package n1exercici1;

public class WindInstrument extends Instrument{

	static {
		System.out.println("WindInstrument class is loaded");
	}

    public static String typeInstrument = "WindInstrument";

	public WindInstrument(String name, int price) {
		super(name, price);
	}
	
	
	//métode sobreescrit
    @Override
	public void play() {
		System.out.println("A wind instrument is playing");
	}
	
	
}
