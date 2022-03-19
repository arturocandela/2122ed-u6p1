package ed.sergi;

public class Institut {

	private static final int ANY = 2021;
	private static final String CICLE_FORMATIU = "1º DAW";
	private static final String CONGNOMS_ALUMNE = "Payà";
	private static final String NOM_ALUMNE = "Sergi";

	public static void main(String[] args) {
		
		Alumne alumneSergi = new Alumne();
		
		alumneSergi.nom = NOM_ALUMNE;
		alumneSergi.congNoms = CONGNOMS_ALUMNE;
		alumneSergi.cicleFormatiu = CICLE_FORMATIU;
		alumneSergi.any = ANY;
		
		System.out.println(alumneSergi.toString());

	}

}
