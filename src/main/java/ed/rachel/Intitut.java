package ed.rachel;

public class Intitut {

	public static void main(String[] args) {
		
		Alumne p = new Alumne();
		
		p.nom = "Rachel";
		p.cognoms = "Samaniego";
		p.cicleFormatiu = "1º DAW";
		p.any = 2022;
		
		System.out.println(p.toString());

	}

}
