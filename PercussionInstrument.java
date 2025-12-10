package n1exercici1;

public class PercussionInstrument extends Instrument{

	static {
		System.out.println("La classe Percussió s'ha carregat");
	}
	
	public PercussionInstrument(String name, int price) {
		super(name, price);
	}
	
	
	//métode sobreescrit
    @Override
	public void play() {
		System.out.println("Està sonant un instrument de percussió");
	}
	
	
}
