package org.lessons.java.shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome, marca;
		float prezzo, iva, memory;
		Scanner s = new Scanner(System.in);
		System.out.print("Inserisci il nome del prodotto: ");
		nome = s.nextLine();
		System.out.print("Inserisci la marca del prodotto: ");
		marca = s.nextLine();
		System.out.print("Inserisci il prezzo del prodotto: ");
		prezzo = s.nextFloat();
		System.out.print("Inserisci il valore dell'IVA del prodotto: ");
		iva = s.nextFloat();
		System.out.print("Inserisci la memoria dello Smart: ");
		memory = s.nextFloat();

		Smartphone p = new Smartphone(nome, marca, prezzo, iva, memory);
		System.out.printf("Il prezzo base del prodotto è: %.2f € \n", p.getPrezzo());
		System.out.printf("Il prezzo con l'IVA del %.2f%% è di %.2f € \n", p.getIva(), p.getPrezzoIva());
		System.out.println(p.getMemory());

		s.close();
	}

}
