package ed.ismael;

public class Institut {

	private static final int ANY = 2021;
	private static final String CICLE_FORMATIU = "1º DAM/DAW";
	private static final String COGNOMS_ALUMNE = "Candela";
	private static final String NOM_ALUMNE = "Arturo";

	public static void main(String[] args) {
		
		Alumne persona = new Alumne();
		
		persona.nombre = NOM_ALUMNE;
		persona.cognoms = COGNOMS_ALUMNE;
		persona.cicleFormatiu = CICLE_FORMATIU;
		persona.any = ANY;
		
		System.out.println(persona.toString());

	}

}
