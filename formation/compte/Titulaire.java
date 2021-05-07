package fr.formation.compte;

import java.util.ArrayList;

public class Titulaire {
	
	private String prenom;
	private String nom;
	private String telephone;
	private ArrayList<Compte> listeComptes;


	public Titulaire(String prenom, String nom, String telephone) {
		this.prenom = prenom;
		this.nom = nom;
		this.telephone = telephone;
		this.listeComptes = new ArrayList<Compte>();
	}

// GETTERS - SETTERS	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public ArrayList<Compte> getListeComptes() {
		return listeComptes;
	}

	public void setListeComptes(ArrayList<Compte> listeComptes) {
		this.listeComptes = listeComptes;
	}


}
