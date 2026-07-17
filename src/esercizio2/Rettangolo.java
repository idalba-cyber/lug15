package esercizio2;

public class Rettangolo {
	private int base;
	private int altezza;

	public Rettangolo() {}
	
// COSTRUTTORE personalizzato
public Rettangolo(int base, int altezza) {
    this.base = base;
    this.altezza = altezza;
}


// METODO
public void dimensioni(int larghezza, int altezza) {
    this.base = larghezza;
    this.altezza = altezza;
}


public int calcolaArea() {
    return base * altezza;
}


public void disegna(char simbolo) {
   

    for (int i = 0; i <= altezza; i++) {
        for (int j = 0; j <= base; j++) {
            System.out.print(simbolo + " ");
        }
        System.out.println();
    }
}
}