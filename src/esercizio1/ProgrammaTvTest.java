package esercizio1;

 
import java.util.Scanner;

public class ProgrammaTvTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Canale (1-99): "); 
        int canale = sc.nextInt();

        System.out.print("Anno (dal 2026): ");
        int anno = sc.nextInt();

        System.out.print("Mese (numero 1-12): ");
        int mese = sc.nextInt();

        System.out.print("Giorno: ");
        int giorno = sc.nextInt();

        System.out.print("Ora: ");
        int ora = sc.nextInt();

        System.out.print("Minuto: ");
        int minuto = sc.nextInt();

        System.out.print("Durata registrazione (max 200 minuti): ");
        int durata = sc.nextInt();

        ProgrammaTelevisivo pt = new ProgrammaTelevisivo(canale, anno, mese, giorno, ora, minuto, durata);

        pt.display();
        sc.close();
        System.exit(0);
        
    }
}
