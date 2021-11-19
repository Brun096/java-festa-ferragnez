package org.generation.italy;

import java.util.Scanner;

public class FerragnezSecurity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		String[] listaInvitati= {"dua Lipa", "paris Hilton", "manuel agnelli", "j-ax", "francesco totti", "ilary blasi", "bebe vio", "luis", "pardis zarei", "martina maccherone", "rachel zeilic"};
		
		boolean trovato=false;
		
		String invitato;
		
		System.out.println("Buona sera, Nome e Cognome, prego: ");
		invitato=scan.nextLine();
		invitato.toLowerCase();
		
		
		for(int i=0; i<listaInvitati.length; i++) {
			
			if(listaInvitati[i].equals(invitato)) {
				
				trovato=true;
				System.out.println("Benvenuta/o alla festa dei Ferragnez");
			}
		}
		
		if(!trovato) {
			System.out.println("Mi dispiace ma lei non è sualla lista. La prego di adarsene.");
		}
		
		
		
		
		
		
		
		
		scan.close();
	}

}
