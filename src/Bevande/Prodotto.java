package Bevande;

public class Prodotto{
	
	
	private String Nome;
	private double Prezzo;
	
	
	public Prodotto(String nom, double prezzo) {
		this.Nome = nom;
		this.Prezzo = prezzo;
	}
	
	public String getNome() {
		return this.Nome;
	}
	
	public double getPrezzo() {
		return this.Prezzo;
	}
	
	
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	
	
	public void setPrezzo(double prezzo) {
		this.Prezzo = prezzo;
	}



}


