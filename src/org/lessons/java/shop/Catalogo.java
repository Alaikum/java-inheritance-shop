package org.lessons.java.shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome, marca, c, colore;
		float prezzo, iva, memory, x, y, z;
		int numPro;
		long imei;
		boolean smart = false, wireless = false;

		Scanner s = new Scanner(System.in);
		System.out.print("Quanti prodotti vuoi inserire?");
		numPro = Integer.parseInt(s.nextLine());
		Prodotto[] p = new Prodotto[numPro];

		for (int i = 0; i < p.length; i++) {
			System.out.printf("Il prodotto num %d è : \n", i + 1);
			System.out.print("1)Smartphone(a);\n2)Televisore(b);\n3)Cuffie(c);\n");
			c = s.nextLine();

			// dati comuni
			System.out.print("Inserisci il nome del prodotto: ");
			nome = s.nextLine();
			System.out.print("Inserisci la marca del prodotto: ");
			marca = s.nextLine();
			System.out.print("Inserisci il prezzo del prodotto: ");
			prezzo = Float.parseFloat(s.nextLine());
			System.out.print("Inserisci il valore dell'IVA del prodotto: ");
			iva = Float.parseFloat(s.nextLine());

			// SMARTPHON
			if (c.toLowerCase().equals("a")) {
				System.out.println("Inserisci dei Dati Aggiuntivi per lo Smartphone: ");
				System.out.print("-inserisci la memoria dello Smartphone: ");
				memory = Float.parseFloat(s.nextLine());
				System.out.print("-inserisci il codice IMEI dello Smartphone: ");
				imei = Long.parseLong(s.nextLine());
				p[i] = new Smartphone(nome, marca, prezzo, iva, memory, imei);
			}
			// TELEVISORE
			else if (c.toLowerCase().equals("b")) {
				System.out.println("Inserisci dei Dati Aggiuntivi per il Televisore: ");
				System.out.print("-inserisci la larghezza del Televisore: ");
				x = Float.parseFloat(s.nextLine());
				System.out.print("-inserisci l'altezza del Televisore: ");
				y = Float.parseFloat(s.nextLine());
				System.out.print("-inserisci la profondità del Televisore: ");
				z = Float.parseFloat(s.nextLine());
				System.out.print("-il Televisore è Smart (S/N): ");
				String answer = s.nextLine();
				if (answer.toLowerCase().equals("s")) {
					smart = true;
				}
				p[i] = new Televisore(nome, marca, prezzo, iva, smart, x, y, z);
			}
			// CUFFIA
			else if (c.toLowerCase().equals("c")) {
				System.out.println("Inserisci dei Dati Aggiuntivi per la Cuffia: ");
				System.out.print("-inserisci il colore della Cuffia: ");
				colore = s.nextLine();
				System.out.print("-la Cuffia è Wireless (S/N): ");
				String answer = s.nextLine();
				if (answer.toLowerCase().equals("s")) {
					wireless = true;
				}
				p[i] = new Cuffia(nome, marca, prezzo, iva, colore, wireless);

			}

		}

		// Stampo tutti i dati
		for (int j = 0; j < p.length; j++) {
			System.out.println("-_-_-_-");
			System.out.println(p[j].toString());
		}

		s.close();
	}

}
