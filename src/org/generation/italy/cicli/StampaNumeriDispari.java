package org.generation.italy.cicli;

import java.util.Scanner;

public class StampaNumeriDispari {
	
	public static void main(String[] args) {
		
		//Creare un array di lunghezza n stabilita dall’utente (quindi dobbiamo interagire con l’utente tramite console)
		
		
		
		System.out.println("stabilisci la lunghezza: ");
		Scanner scanner = new Scanner (System.in) ;	
		int lunghezza = scanner.nextInt();
		
		//Popolarlo con numeri interi casuali compresi tra 0 e 100 (0 incluso, 100 escluso)
		
		if(lunghezza>=0 && lunghezza < 100) {
		System.out.println("Creo un array lungo " + lunghezza);
		
		//Scorrere gli elementi  dell’array e stampare a video soltanto i numeri dispari
		
		int[] n = new int[lunghezza];
		
		for(int i = 0; i < n.length ; i++) {
			n[i] += i+1;
			System.out.println(n[i] + " ");
		}		
		
		
		
		}else {
			System.out.println("Inserisci un numero tra 0 e 99");
		}
		

		
		scanner.close();
	}
	
}
