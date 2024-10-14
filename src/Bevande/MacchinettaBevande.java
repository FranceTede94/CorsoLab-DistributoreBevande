package Bevande;

public class MacchinettaBevande {

    public static void main(String[] args) {
    	
        // Creazione degli oggetti Prodotto
        Prodotto Caffé = new Prodotto("Caffè", 1.20);
        Prodotto Cappuccino = new Prodotto("Cappuccino", 1.50);
        Prodotto Cioccolato = new Prodotto("Cioccolato", 2.00);

        // Array di oggetti Prodotto
        Prodotto[] prodotti = {Caffé, Cappuccino, Cioccolato};

        // Creazione del distributore di bevande
        DistributoreBevande bevande = new DistributoreBevande(prodotti, 3); 
		
		bevande.Carica();
	
		bevande.InserisciImporto();
		System.out.println();
		System.out.println(bevande.getProdotto(0));
		System.out.println();
		System.out.println("il saldo attuale del distributore è " + bevande.getSaldo());
		System.out.println();
		System.out.println("il resto dovuto è " + bevande.getResto() + " e il saldo è " + bevande.getSaldo() );
		
		
	
	}

}