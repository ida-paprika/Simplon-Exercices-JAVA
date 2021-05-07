package fr.formation.compte;

public class GererComptes {
	
// FUNCTIONS
	public static void afficherSolde(Compte compte) {
		System.out.printf("[%s] Solde du compte = %.2f€\n", compte.getTitulaire(), compte.getSoldeCompte());
	}
	
	public static void depotArgent(Compte compte, double montant) {
		double solde = compte.getSoldeCompte();
		compte.setSoldeCompte(solde + montant);
		System.out.printf("[%s] Nouveau solde = %.2f€\n", compte.getTitulaire().getNom(), compte.getSoldeCompte());
	}
	
	public static void retraitArgent(Compte compte, double montant) {
		double solde = compte.getSoldeCompte();
		if (solde < montant) {
			System.out.printf("[%s] Retrait de %.2f€ impossible (%.2f€ sur le compte)\n", compte.getTitulaire(), montant, compte.getSoldeCompte());
		} else {
			compte.setSoldeCompte(solde - montant);
			System.out.printf("[%s] Nouveau solde = %.2f€\n", compte.getTitulaire().getNom(), compte.getSoldeCompte());
		}
	}
		
	public static void detailCompte(Compte compte) {
		System.out.println("-----");
		System.out.printf("ENSEIGNE : '%s' | RIB COMPLET : %s %d\n", Compte.getNombanque(), Compte.getRib(), compte.getNumeroCompte());
		System.out.printf("TITULAIRE : '%s' | SOLDE : %.2f€\n", compte.getTitulaire().getNom(), compte.getSoldeCompte());
		System.out.println("-----");
	}
		
	public static Compte creerCompte(Titulaire titulaire, double d) {
		Compte compte = new Compte(titulaire, d);
		titulaire.getListeComptes().add(compte);
		return compte;
	}
	public static Compte creerCompte(Titulaire titulaire) {
		Compte compte = new Compte(titulaire);
		titulaire.getListeComptes().add(compte);
		return compte;
	}
	
	public static void afficherNombreComptes(Titulaire titulaire) {
		if (titulaire.getListeComptes().size() == 1) {
			System.out.println("Ce titulaire possède 1 compte");
		} else if (titulaire.getListeComptes().size() > 1) {
			System.out.println("Ce titulaire possède "+titulaire.getListeComptes().size()+" comptes");
		} else {
			System.out.println("Ce titulaire ne possède pas de compte");
		}
		
	}

	public static void main(String[] args) {

		Titulaire frodon = new Titulaire("Frodon", "Sacquet", "0123456789");
		Titulaire sam = new Titulaire("Sam", "Gamegie", "0987654321");
		
		Compte frodonCompte1 = creerCompte(frodon);
		Compte frodonCompte2 = creerCompte(frodon, 50.25);
		
		afficherNombreComptes(frodon);
		afficherNombreComptes(sam);
		
		depotArgent(frodonCompte1, 3000);
		detailCompte(frodonCompte1);
		
		depotArgent(frodonCompte1, 80);
		retraitArgent(frodonCompte1, 20);
		retraitArgent(frodonCompte1, 200);
		
	}

}
