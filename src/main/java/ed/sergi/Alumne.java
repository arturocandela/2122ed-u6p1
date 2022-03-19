package ed.sergi;

public class Alumne {
	
	
	public String nom;
	public String congNoms;
	public int any;
	public String cicleFormatiu;
	
	@Override
	public String toString() {
		
		return  "nom = " + nom + System.lineSeparator() +
				"congNoms = " + congNoms + System.lineSeparator() +
				"any = " + any + System.lineSeparator() +
				"cicleFormatiu = " + cicleFormatiu;
				
		
	}

}
