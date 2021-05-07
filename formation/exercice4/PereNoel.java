package fr.formation.exercice4;
import java.util.ArrayList;

public class PereNoel {


	private ArrayList<Enfant> listeEnfants;
	private ArrayList<Jouet> listeJouets;
	
	public PereNoel() {
		super();
		this.listeJouets = new ArrayList<Jouet>();
		this.listeEnfants = new ArrayList<Enfant>();
	}

/* GETTERS SETTERS*/
	public ArrayList<Enfant> getListeEnfants() {
		return listeEnfants;
	}

	public void setListeEnfants(ArrayList<Enfant> listeEnfants) {
		this.listeEnfants = listeEnfants;
	}

	public ArrayList<Jouet> getListeJouets() {
		return listeJouets;
	}

	public void setListeJouets(ArrayList<Jouet> listeJouets) {
		this.listeJouets = listeJouets;
	}
	
/* FUNCTIONS */	
	public void ajouterJouet(Jouet jouet) {
		this.listeJouets.add(jouet);
	}
	
	public void ajouterEnfant(Enfant enfant) {
		this.listeEnfants.add(enfant);
	}
	
	public void afficherListeDesJouets() {
		for(Jouet i: this.listeJouets) {
			System.out.print(i.getLibelle() +" | ");
		}
		System.out.println("");
	}
	
	public void afficherListeDesEnfants() {
		for(Enfant i: this.listeEnfants) {
			System.out.print(i.getNom() +" | ");
		}
		System.out.println("");
	}
	
	public void distribuer(Enfant enfant, Jouet jouet) {
		if ( jouet.getEtat() != "offert") {
			enfant.setListeCadeaux(jouet);
			jouet.setEtat("offert");
			System.out.printf("%s a reçu '%s' \n", enfant.getPrenom(), jouet.getLibelle());
		} else {
			System.out.println("Cadeau déjà offert :(");
		}
	}



	public static void main(String[] args) {
		PereNoel papaNono = new PereNoel();

		Enfant nono = new Enfant("Bidule","Noémie",8);
		Enfant jojo = new Enfant("Machin","Joachim",6);
		Enfant souf = new Enfant("Truc","Soufiane",9);
		
		Jouet joujou1 = new Jouet("Ferrari 308GTB");
		Jouet joujou2 = new Jouet("BarbiZou la poupée qui gazouille");
		Jouet joujou3	= new Jouet("Super puzzle avec 180 pièces");
		Jouet joujou4 = new Jouet("Mikado");
		Jouet joujou5 = new Jouet("Rubik's Cube");
		Jouet joujou6	= new Jouet("iPad");
		
		papaNono.ajouterJouet(joujou1);
		papaNono.ajouterJouet(joujou2);
		papaNono.ajouterJouet(joujou3);
		papaNono.ajouterJouet(joujou4);
		papaNono.ajouterJouet(joujou5);
		papaNono.ajouterJouet(joujou6);
		
		papaNono.afficherListeDesJouets();
		
		papaNono.ajouterEnfant(nono);
		papaNono.ajouterEnfant(jojo);
		papaNono.ajouterEnfant(souf);
		
		papaNono.afficherListeDesEnfants();
		
		papaNono.distribuer(nono,joujou1);
		papaNono.distribuer(jojo, joujou2);
		papaNono.distribuer(souf,joujou3);
		papaNono.distribuer(souf,joujou4);
		papaNono.distribuer(nono,joujou5);
		papaNono.distribuer(jojo,joujou6);
		
		nono.afficher();
		jojo.afficher();
		souf.afficher();
		
		papaNono.distribuer(nono,joujou2);
	}



}
