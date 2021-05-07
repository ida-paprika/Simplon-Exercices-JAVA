package fr.formation.biblio;
import java.util.HashMap;

public class GestionBiblio {
	
	private HashMap<Integer, Livre> tabLivres;

// CONSTRUCTOR	
	public GestionBiblio() {
		super();
		this.tabLivres = new HashMap<Integer, Livre>();
	}
	
// GETTERS - SETTERS	
	public HashMap<Integer, Livre> getTabLivres() {
		return tabLivres;
	}

	public void setTabLivres(HashMap<Integer, Livre> tabLivres) {
		this.tabLivres = tabLivres;
	}

// FUNCTIONS
	public void afficherBibliotheque() {
		for (Livre l : this.tabLivres.values()) {
	    	l.toString(l);
	    }
	}
	
	public void addLivre(Livre livre) {
		this.tabLivres.put(livre.getIsbn(), livre);
	}


	public void deleteLivre(int isbn) {
		this.tabLivres.remove(isbn);
	}
	
	public int totalLivres() {
		return this.tabLivres.size();
	}
	
	public double prixTotalLivres() {
		float total = 0;
		for (Livre l : this.tabLivres.values()) {
	    	total += l.getPrix();
	    }
		return total;
	}
	
	public void searchLivre(int isbn) {
		Livre livre = null;
		for (Integer i : this.tabLivres.keySet()) {
	    	if (i == isbn) {
	    		livre = this.tabLivres.get(i);
	    	}
	    }
		if (livre != null) {
			livre.toString(livre);
		} else {
			System.out.println("La bibliothèque ne possède pas ce livre");
		}
	}
	
	
	public static void main(String[] args) {
		
		GestionBiblio biblio = new GestionBiblio();
		
	    Livre livre1 = new Livre(1234, "titre1", (float) 12.00);
	    Livre livre2 = new Livre(5678, "titre2", (float) 13.00);
	    Livre livre3 = new Livre(6789, "titre3", (float) 14.00);

	    biblio.addLivre(livre1);
	    biblio.addLivre(livre2);
	    biblio.addLivre(livre3);
	    
	    System.out.println("*** Recherche par ISBN ***");
	    biblio.searchLivre(5678);
	    System.out.println("");
	    
	    System.out.println("La bibliothèque contient "+ biblio.totalLivres() +" livres.");
	    System.out.printf("Les livres ont une valeur totale de %.2f€", biblio.prixTotalLivres());
	    System.out.println("");
	    
	    biblio.addLivre(new Livre(9876, "Titre4", (float) 18.00));
	    System.out.println("");
	    
	    biblio.afficherBibliotheque();

	    System.out.println("");
	    System.out.println("La bibliothèque contient "+ biblio.totalLivres() +" livres.");
	    System.out.printf("Les livres ont une valeur totale de %.2f€", biblio.prixTotalLivres());
	    System.out.println("");
	    
	    biblio.deleteLivre(5678);
	    
	    biblio.afficherBibliotheque();
	}

}
