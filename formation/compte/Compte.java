package fr.formation.compte;

public class Compte {
	
	private static final String nomBanque = "Belle Banque";
	private static final String rib = "12345 6789";
	private static int nombreClients = 3;
	private Titulaire titulaire;
	private int numeroCompte;
	private double soldeCompte;

	public Compte(Titulaire titulaire) {
		this(titulaire, 0);
	}
	
	public Compte(Titulaire titulaire, double soldeCompte) {
		this.titulaire = titulaire;
		this.soldeCompte = soldeCompte;
		setNombreClients();
		this.numeroCompte = getNombreClients();
		
	}


	// GETTERS - SETTERS
	public static int getNombreClients() {
		return nombreClients;
	}

	public static void setNombreClients() {
		Compte.nombreClients = getNombreClients()+1;
	}

	public Titulaire getTitulaire() {
		return titulaire;
	}

	public void setTitulaire(Titulaire titulaire) {
		this.titulaire = titulaire;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public static String getNombanque() {
		return nomBanque;
	}

	public static String getRib() {
		return rib;
	}

}
