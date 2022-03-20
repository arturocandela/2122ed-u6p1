package ed.ismael;

public class Institut {

	public static void main(String[] args) {
		
		Alumne persona = new Alumne();
		
		persona.nombre = "Arturo";
		persona.cognoms = "Candela";
		persona.cicleFormatiu = "1º DAM/DAW";
		persona.any = 2021;
		
		System.out.println(persona.toString());

	}

}
