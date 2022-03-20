package ed.ismael;

public class Alumne {
	
	
	public String nombre;
	public String cognoms;
	public int any;
	public String cicleFormatiu;
	
	@Override
	public String toString() {
		
		return  "n = " + nombre + System.lineSeparator() +
				"c = " + cognoms + System.lineSeparator() +
				"a = " + any + System.lineSeparator() +
				"cl = " + cicleFormatiu;
				
		
	}

}
