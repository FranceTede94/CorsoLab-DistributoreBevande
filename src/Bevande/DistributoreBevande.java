package Bevande;

public class DistributoreBevande{

	
	private Prodotto [] TipoProdotti = new Prodotto[3];
	private int saldo = 3;
	
	
	public DistributoreBevande(Prodotto[] prodotti, int saldo) {
		this.TipoProdotti = prodotti;
		this.saldo = saldo;
		
	}
	

	// Metodo per caricare le bevande
	public void Carica() {
	
		int numero = (int)(Math.random()*TipoProdotti.length);
		System.out.println(numero);
	
		for(int i=0; i<TipoProdotti.length;i++) {
			if(i == numero) {
				System.out.println("Bevanda caricata: " + TipoProdotti[numero].getNome());
				System.out.println();
			}
			System.out.println("Hai inserito in modo randomico tutti i prodotti: " + TipoProdotti[i].getNome());
		}
	}	
	
	
	// Mtodo che permette di dare un importo in modo randomico alle bevande
	
	public void InserisciImporto() {
		
		Double [] prezzi  = {1.20, 1.50, 2.50};
		
		int numero = (int) (Math.random()*TipoProdotti.length);
		
		for(int i=0; i<TipoProdotti.length;i++) {
			for(int y=0;y<prezzi.length;y++) {
				
				if(i == y && i == numero) {
					System.out.println();
					System.out.println("La bevanda " + TipoProdotti[numero].getNome() + " costa: "  + prezzi[y]);
				}
			}
		}
			
	}
	
	/* Metodo che dato in ingresso un numero di prodotto, restituisca il prodotto associato a quel numero e decrementi
	il saldo disponibile nel distributore */
	
	public String getProdotto(int prodotto) {
		
		for(int i=0; i<TipoProdotti.length;i++) {
			if(i == prodotto) {
				saldo--;
				return "Il prodotto inserito è " + TipoProdotti[i].getNome() + " e ora ci sono " + saldo + " prodotti nel distributore";
			
				}

			}
		    return "Il saldo dei prodotti è " + saldo;
		    
		    
		}
	
	// Metodo che restituisca il saldo attuale del distributore
			public int getSaldo() {
				return saldo;
			
			}
	
			
	// Metodo che restituisca il resto dovuto e il saldo si azzeri 
		public int getResto() {
	        int resto = saldo;
	        saldo = 0;
	        return resto;
	    } 
	}
	
		
		
		
		
		
		

	
	
