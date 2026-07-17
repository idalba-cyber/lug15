	    package esercizio1;

	    import java.util.Scanner;

	    public class ProgrammaTelevisivo {

	    	    private int canale;
	    	    private int anno;
	    	    private int mese;
	    	    private int giorno;
	    	    private int ora;
	    	    private int minuto;
	    	    private int durata;
	    	    Scanner sc = new Scanner(System.in);

	    	    // costruttore
	    	    public ProgrammaTelevisivo(int canale, int anno, int mese,int giorno, int ora,int minuto, int durata) {

	    	        setCanale(canale);
	    	        setAnno(anno);
	    	        setMese(mese);
	    	        setGiorno(giorno);
	    	        setOra(ora);
	    	        setMinuto(minuto);
	    	        setDurata(durata);
	    	    }

	    	   public ProgrammaTelevisivo() {}
	    	   
	    	    public void setCanale(int canale) {
	    	    	boolean ancora = true;
	    	    	do {
	    	    	if (canale > 0 && canale<=99) {
	    	            this.canale = canale;
	    	        	ancora = false;
	    	        }
	    		else { 
	    			System.out.print("I canali sono compresi tra 1 e 99, reinseriscilo: ");
	    			canale = sc.nextInt();
	    			
	    		}
	    	    	}while(ancora);         
	     }
	    	  

	    	    public void setAnno(int anno) {
	    	    	boolean ancora = true;
	    	    	do {
	    	        if (anno >= 2026) {
	    	            this.anno = anno;
	    	        ancora = false;
	    		}
	    		else { 
	    			System.out.print("L'anno deve essere superiore al 2026, reinseriscilo: ");
	    			anno = sc.nextInt();
	    			
	    		}
	    	        
	    	    }while(ancora); 
	    	    }

	    	    public void setMese(int mese) {
	    	    	boolean ancora = true;
	    			
	    			do {	
	    			 if (mese >= 1 && mese <= 12) {
	    	            this.mese = mese;
	    	            ancora = false;
	    	    } 
	    		 else { 
	    			System.out.print("Il mese deve essere tra 1 e 12, reinseriscilo (numero mese): ");
	    			mese = sc.nextInt();
	    			
	    		}
	    	    }while(ancora); 
	    	    }


	    	    public void setGiorno(int giorno) {
	    	        boolean ancora = true;

	    	        do {
	    	            switch (mese) {
	    	                case 1:
	    	                case 3:
	    	                case 5:
	    	                case 7:
	    	                case 8:
	    	                case 10:
	    	                case 12:
	    	                    if (giorno >= 1 && giorno <= 31) {
	    	                        this.giorno = giorno;
	    	                        ancora = false;
	    	                    }
	    	                    break;

	    	                case 2:
	    	                    if (giorno >= 1 && giorno <= 28) {
	    	                        this.giorno = giorno;
	    	                        ancora = false;
	    	                    }
	    	                    break;

	    	                case 4:
	    	                case 6:
	    	                case 9:
	    	                case 11:
	    	                    if (giorno >= 1 && giorno <= 30) {
	    	                        this.giorno = giorno;
	    	                        ancora = false;
	    	                    }
	    	                    break;
	    	            
 
	    	            default: 
	    	                System.out.print("Giorno non valido, reinseriscilo: ");
	    	                giorno = sc.nextInt();
	    	                ancora = false;
	    	            
	    	            }  

	    	        } while (ancora);
	    	    }

	    	    public void setOra(int ora) {
	    	    	 boolean ancora = true;
	    	    do {
	    	        if (ora >= 0 && ora <= 23) {
	    	            this.ora = ora;
	    	            ancora = false;
	    	        }
	    			else { 
	    				System.out.print("Lora deve essere compresa tra 0 e 23, reinseriscilo: ");
	    				ora = sc.nextInt();
	    				
	    			}
	    		    } while(ancora); 
	    	    }

	    	    public void setMinuto(int minuto) {
	    	    	boolean ancora = true;
	    	    	do {
	    	        if (minuto >= 0 && minuto <= 59) {
	    	            this.minuto = minuto;
	    	            ancora = false;
	    	        }
	    			else { 
	    				System.out.print("I minuti devono essere compresi tra 0 e 59, reinseriscilo: ");
	    				minuto = sc.nextInt();
	    				
	    			}
	    		    } while(ancora);     	
	    	    }

	    	    public void setDurata(int durata) {
	    	    	boolean ancora = true;
	    	    	do {
	    	    	if (durata > 0 && durata <=200) {
	    	            this.durata = durata;
	    	            ancora = false;
	    	    	 }
	    			else { 
	    				System.out.print("La durata massima è di 200 minuti, reinseriscilo: ");
	    				durata = sc.nextInt();
	    				
	    			}
	    		    } while(ancora);     	
	    	    }
	    	    
	    	    
	    	    
	    	    public int getCanale() {
	    			return canale;
	    		}
	    	     
	    	    public int getAnno() {
	    			return anno;
	    		}
	    	    
	    	    public int getMese() {
	    			return mese;
	    	    }
	    	    
	    	    public int getGiorno() {
	    			return giorno;
	    		}
	    	    
	    	    public int getOra() {
	    			return ora;
	    		}
	    	    
	    	    public int getMinuto() {
	    			return minuto;
	    		}
	    	    
	    	    public int getDurata() {
	    			return durata;
	    		}
	    			
	    			
	    	    public void display() {
	    	    	System.out.println("\nRegistrazione programma televisivo: ");
	    			System.out.println("Canale: " + getCanale() );
	    			System.out.println("Data: " + getGiorno() + "/" + getMese() + "/" + getAnno() );
	    			System.out.println("Ora inizio: " + getOra() + ":" + getMinuto() );
	    			System.out.println("Durata: " + getDurata() + " minuti");
	    	    }
	    			 
	    		
	    	}