package org.generation.italy.cicli;

import java.util.Random;
import java.util.Scanner;

public class StampaNumeriDispari {
	
	public static void main(String[] args) {
		
		//Creare un array di lunghezza n stabilita dall’utente (quindi dobbiamo interagire con l’utente tramite console)
		
		
		
		System.out.println("stabilisci la lunghezza: ");
		Scanner scanner = new Scanner (System.in) ;	
		
		int lunghezza = scanner.nextInt();	
		System.out.println("Creo un array lungo " + lunghezza + " con numeri causali: ");	
		
		int[] n = new int[lunghezza];
		
		
		for(int i=0; i<n.length; i++ ) {		
			
		//Popolarlo con numeri interi casuali compresi tra 0 e 100 (0 incluso, 100 escluso)
		//Scorrere gli elementi  dell’array e stampare a video soltanto i numeri dispari
		
		Random randomGenerator = new Random();
		int max = 100;
		int var = randomGenerator.nextInt(max);
		if(var % 2 == 0) {
			var++;			
		}
	
		n[i] = var;		
		}
		
		for(int j=0; j<n.length; j++) {	
			
				System.out.println(n[j]);			
		}				
		scanner.close();
	}	
}