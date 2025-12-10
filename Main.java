package n1exercici1;

public class Main {

	public static void main(String[] args) {

        //Creo un objecte de cada tipus
        StringInstrument guitarraDani = new StringInstrument("guitarra", 135);
        PercussionInstrument tamborDani = new PercussionInstrument("tambor dani", 135);
        WindInstrument trompetaDani = new WindInstrument("trompeta", 65);

        //cridar al métode play() de cada objecte creat
        guitarraDani.play();
        tamborDani.play();
        trompetaDani.play();


	}

}
