package n1exercici1;

public class PercussionInstrument extends Instrument{

	static {
		System.out.println("Percussion class is loaded");
	}
	
	public PercussionInstrument(String name, int price) {
		super(name, price);
	}
	
	
	//métode sobreescrit
    @Override
	public void play() {
		System.out.println("A percussion instrument is playing");
	}
	
	
}
