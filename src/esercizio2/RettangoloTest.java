package esercizio2;

public class RettangoloTest {

	public static void main(String[] args) {
		
		System.out.println("RETTANGOLO (metodi): ");
  
        Rettangolo rettang1 = new Rettangolo();
        
        rettang1.dimensioni(8, 4);
        
       
        System.out.println("Area rettangolo: " + rettang1.calcolaArea());
        
        System.out.println("Disegno:");
        rettang1.disegna('@');

        System.out.println("\n");

        System.out.println("RETTANGOLO (Costruttore): ");

        Rettangolo rettang2 = new Rettangolo(5, 3);
        
        
        System.out.println("Area rettangolo: " + rettang2.calcolaArea());
       
        System.out.println("Disegno:");
        rettang2.disegna('*');
    }
}