package ed.rachel;

public class School {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.nom = "Rachel";
		p.cognoms = "Samaniego";
		p.cicleFormatiu = "1º DAW";
		p.any = 2022;
		
		System.out.println(p.toString());

	}

}
