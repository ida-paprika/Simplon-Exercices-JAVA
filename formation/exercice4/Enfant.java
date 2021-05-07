package fr.formation.exercice4;

import java.util.ArrayList;

public class Enfant {

	private String nom;
	private String prenom;
	private int age;
	private ArrayList<Jouet> listeCadeaux;
	
	
	
	
	public Enfant(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.listeCadeaux = new ArrayList<Jouet>();
	}

	


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<Jouet> getListeCadeaux() {
		return listeCadeaux;
	}

	public void setListeCadeaux(Jouet jouet) {
		listeCadeaux.add(jouet);
	}


	public void afficher() {
		System.out.print("Liste de cadeaux de "+ this.getPrenom() +" : ");
		for (Jouet j : this.getListeCadeaux()) {
			System.out.printf("'%s' ",j.getLibelle());
		}
		System.out.println();
	}


	public static void main(String[] args) {
//		Enfant nono = new Enfant("Bidule","Noémie",8);
//		Enfant jojo = new Enfant("Machin","Joachim",6);
//		Enfant souf = new Enfant("Truc","Soufiane",9);

	}



}
