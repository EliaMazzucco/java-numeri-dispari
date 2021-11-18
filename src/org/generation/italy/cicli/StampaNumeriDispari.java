package org.generation.italy.cicli;

import java.util.Random;
import java.util.Scanner;

public class StampaNumeriDispari {
	
	public static void main(String[] args) {
		
		//Creare un array di lunghezza n stabilita dall’utente (quindi dobbiamo interagire con l’utente tramite console)
		
		
		
		System.out.println("stabilisci la lunghezza: ");
		Scanner scanner = new Scanner (System.in) ;	
		
		int lunghezza = scanner.nextInt();	
		System.out.println("Creo un array lungo " + lunghezza);	
		
		int[] n = new int[lunghezza];
		
		for(int i=0; i<n.length; i++ ) {		
		
		
		Random randomGenerator = new Random();
		int max = 100;
		int numeriRandom = randomGenerator.nextInt(max);
		
		n[i] = numeriRandom;
		
		
		System.out.println(n[i]);	
		}


		
					
		
		//Popolarlo con numeri interi casuali compresi tra 0 e 100 (0 incluso, 100 escluso)
		//Scorrere gli elementi  dell’array e stampare a video soltanto i numeri dispari
		

		
			

			
		
		
		
	
			

		
		
		
		
		
		
		
	

		

		
		scanner.close();
	}
	
}
