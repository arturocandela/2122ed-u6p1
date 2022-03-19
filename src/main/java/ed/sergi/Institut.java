package ed.sergi;

public class Institut {

	public static void main(String[] args) {
		
		Alumne alumneSergi = new Alumne();
		
		alumneSergi.nom = "Sergi";
		alumneSergi.congNoms = "Payà";
		alumneSergi.cicleFormatiu = "1º DAW";
		alumneSergi.any = 2021;
		
		System.out.println(alumneSergi.toString());

	}

}
