package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	private int codice;
	private String nome, marca;
	private float prezzo, iva;

	public Prodotto(String nome, String marca, float prezzo, float iva) {
		super();
		Random r = new Random();
		codice = r.nextInt(1000);
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public float getPrezzoIva() {
		float prezzoIva = prezzo + (prezzo * iva / 100);
		return prezzoIva;
	}

	public int getCodice() {
		return codice;
	}

	public String toString() {
		String dati = "Eccoci qui i dati del tuo Prodotto:"
				+ "\nNome: "+getNome()+"\nMarca: "+getMarca()+"\nPrezzo: "+getPrezzo()+"€\nIva:"+getIva()
				+"%\nPrezzo con Iva: "+getPrezzoIva()+"€";
		return dati;
	}

}
