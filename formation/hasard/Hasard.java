package fr.formation.hasard;
import java.util.Random;

public class Hasard {

	private int[] tableau;
	private int moyenne;
	private int somme;
	
	public Hasard() {
		this(10);
	}
	
	public Hasard(int n) {
		this.tableau = new int[n];
		
		for (int i = 0; i < tableau.length; i++) {
			int nombre;
			do {
				nombre = new Random().nextInt(100);
				tableau[i]=(int)nombre;
			} while (nombre == 0);
		}
		
		this.somme = 0;
		for(int x: this.tableau) {
			somme += x;
		}
		this.moyenne = calculerMoyenne(n, this.somme);
		
	}



	public static int calculerMoyenne(int n, int somme) {
		int moyenne = somme / n;
		
		return moyenne;
	}
	
	public static void afficher(Hasard haz) {
		int[] tabHaz = haz.tableau;
		for (int i = 0; i < tabHaz.length; i++) {
			System.out.print(tabHaz[i]+" | ");
		}
		
		System.out.printf("\nMoyenne = %d / Somme = %d", haz.moyenne, haz.somme);
	}
	
	public static void afficherNombreSupMoyenne(Hasard haz) {
		String str = "";
		for(int n: haz.tableau) {
			if (n > haz.moyenne) {
				str += n+",";
			}
		}
		
		// couper les cheveux en 4 pour retourner un tableau de int[] même si ça sert à rien
		String[] tabStr = str.split(",");
		int[] nbrSupMoyenne = new int[tabStr.length];
		System.out.print("\nListe des nombres supérieurs à la moyenne : ");
		for (int i = 0; i < tabStr.length; i++){
			nbrSupMoyenne[i] = Integer.parseInt(tabStr[i]);
			System.out.print(nbrSupMoyenne[i]+", ");
	    }
		System.out.print("\n");
	}
	
	public static Hasard ajouter(Hasard haz, int nbr) {
		for(int i = 0; i < haz.tableau.length; i++) {
			haz.tableau[i] += nbr;
		}
		return haz;
	}
	
	public static void main(String[] args) {
		Hasard haz = new Hasard();
		afficher(haz);
		afficherNombreSupMoyenne(haz);
		haz = ajouter(haz, 3);
		afficher(haz);

	}

}
