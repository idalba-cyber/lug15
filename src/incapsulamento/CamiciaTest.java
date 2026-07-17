package incapsulamento;

import java.util.Scanner;

public class CamiciaTest {

	public static void main(String[] args) {
		Camicia miaCamicia = new Camicia();
		Scanner inputTesti = new Scanner(System.in);
		Scanner inputNumeri = new Scanner(System.in);
		
		
		System.out.println("Inserisci l'ID della camicia (4 cifre): ");
		miaCamicia.setID(inputNumeri.nextInt()); 
		
		System.out.println("Inserisci la descrizione (tra 8 e 20 caratteri): ");
		miaCamicia.setDescrizione(inputTesti.nextLine());
		
		System.out.println("Inserisci il codice colore (R=red; G=green, B=blue, W=white): ");
		miaCamicia.setCodiceColore(inputTesti.nextLine().toUpperCase().charAt(0)); //chatAt prende solo il primo carattere
		
		System.out.println("Inserisci il prezzo unitario (tra 10,0 e 100,0 euro): ");
		miaCamicia.setPrezzo(inputNumeri.nextDouble());

		System.out.println("Inserisci la quantità di camicie disponibili (almeno 1): ");
		miaCamicia.setDisponibili(inputNumeri.nextInt());
		
		System.out.println("Inserisci la quantità di camicie acquistate (almeno 1 e al max " + miaCamicia.getDisponibili() + " )");
		miaCamicia.setAcquistate(inputNumeri.nextInt());
		
		miaCamicia.display();
		inputTesti.close();
		inputNumeri.close(); // le istanze di Scanner vanno chiuse nel metodo più "a monte" del programma
		
		System.exit(0); // chiusura normale del programma (0 significa nessun problema; quando il programma crasha, Java lancia System.exit(1);
		
		
	}

}
