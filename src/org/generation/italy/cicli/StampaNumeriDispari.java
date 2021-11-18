package org.generation.italy.cicli;

import java.util.Random;
import java.util.Scanner;

public class StampaNumeriDispari {

	public static void main(String[] args) {


		System.out.println("stabilisci la lunghezza: ");
		Scanner scanner = new Scanner (System.in) ;	

		int lunghezza = scanner.nextInt();	
		String s = "";
		String listaInt = "";
		String listaIntOdd = "";


		int[] n = new int[lunghezza];		
		int oddN = 0;

		int sum = 0;

		for(int i=0; i<n.length; i++ ) {		

			Random randomGenerator = new Random();
			int max = 100;
			int numeroRandom = randomGenerator.nextInt(max);		
			n[i] = numeroRandom;
			
			listaInt += n[i] + " \n";
			

			if(n[i] % 2 !=0) {				
				oddN++;
				listaIntOdd += n[i] + " \n";
			}						
		}
	
		int[] oddArr = new int[oddN];
		int k = 0;

		for(int j=0; j<n.length; j++) {

			
			
			if(n[j] % 2 !=0) {	
				oddArr[k] = n[j];
				k++;
			}		

			if (n[j] > 10 && n[j] < 50) {
				sum += n[j];				
			}
		}

		s = "Lista dei numeri:\n" + listaInt + "\nLista dei numeri dispari:\n" + listaIntOdd + "\nquantità numeri dispari: " + oddN + "\nquantità numeri pari: " + (lunghezza-oddN) + "\nsomma: " + sum;






		System.out.println(s);



		scanner.close();
	}	
}