package n1exercici1;

public class Main {

	public static void main(String[] args) {

        System.out.println("Demonstrating that accessing a static attribute loads the class");
        String windType =  WindInstrument.typeInstrument;

        System.out.println("\nCreating an object of each type of Instrument");
        //Create each type of class
        StringInstrument guitarDani = new StringInstrument("guitar", 135);
        PercussionInstrument drumDani = new PercussionInstrument("drum Dani", 135);
        WindInstrument trumpetDani = new WindInstrument("trumpet", 65);

        System.out.println("\nCalling the play() method on each created object");
        //call to play() method of each object created
        guitarDani.play();
        drumDani.play();
        trumpetDani.play();


	}

}
