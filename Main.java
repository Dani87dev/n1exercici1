package n1exercici1;

public class Main {

	public static void main(String[] args) {

        System.out.println("Demostrant que al cridar a un atribut static es carrega la classe");
        String tipusVent =  WindInstrument.tipus;

        System.out.println("\nCreant un objecte de cada tipus de Instrument");
        //Creo un objecte de cada tipus
        StringInstrument guitarraDani = new StringInstrument("guitarra", 135);
        PercussionInstrument tamborDani = new PercussionInstrument("tambor dani", 135);
        WindInstrument trompetaDani = new WindInstrument("trompeta", 65);

        System.out.println("\nCridant al métode play de cada objecte creat");
        //cridar al métode play() de cada objecte creat
        guitarraDani.play();
        tamborDani.play();
        trompetaDani.play();


	}

}
