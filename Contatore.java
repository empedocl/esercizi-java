import java.util.Scanner;

public class Contatore {
	
	public static int mcAttuali;
	public static int mcPrecedenti;
	public static int totale;
	public static double prezzoMc = 0.56;
	
	
    /*
	public Contatore(int mcAttuali, int mcPrecedenti, int totale) {
		super();
		this.mcAttuali = mcAttuali;
		this.mcPrecedenti = mcPrecedenti;
		this.totale = totale;
	}
*/
	public static void main(String[] args) {
		
		System.out.println("Leggi i metri cubu attuali: ");
		
		Scanner sc = new Scanner(System.in);
		int mcAttuali = sc.nextInt();
		
		System.out.println("Hai inserito "+ mcAttuali);
		
		System.out.println("Inserisci i metri cubi precedenti: ");
		int mcPrecedenti = sc.nextInt();
		
		System.out.println("Hai inserito "+ mcPrecedenti);
		totale = mcAttuali - mcPrecedenti;
		System.out.println("Hai consumato: " + totale );
		
		System.out.println("La bolletta dovrebbe essere di Euro: ");
		
		totale= (int) (totale * 0.56);
		
		System.out.println(totale);
		
		

	}

}