package org.imie;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("bienvenue au decompte de score de tennis");
		
		Jeux jeux = new Jeux();
		
		Scanner scanner= new Scanner(System.in);
		
		Boolean finAppli = false;
		while (!finAppli) {
			System.out.println("quel joueur marque");
			String saisie = scanner.next();
			if (saisie.compareTo("X")==0){
				finAppli=true;
			}else {
				if(saisie.compareTo("1")==0){
					jeux.marquerJoueur1();
				}else if (saisie.compareTo("2")==0) {
					jeux.marquerJoueur2();
				}
			}
			
			System.out.format("score :%s \n", jeux.getScore());
		}
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}