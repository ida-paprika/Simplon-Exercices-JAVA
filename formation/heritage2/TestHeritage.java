package fr.formation.heritage2;

import fr.formation.heritage2.Apprenant.Os;

public class TestHeritage {

	public static void main(String[] args) {
		
		Apprenant phil = new Apprenant("Philippe",54,"Montreuil", Os.WINDOWS);
		phil.bonjour();
		phil.travailler();
		phil.manger("banane");
		phil.chomer();
		phil.dormir();
		System.out.println("------------");

		Personne jojo = new Personne("Josselin",34);

		jojo.bonjour();
		jojo.manger("pizza");
		jojo.dormir();

		System.out.println("------------");
		Personne anissa = new Apprenant("Anissa",23, "Montreuil",Os.MAC);
		anissa.bonjour();
		anissa.manger("chocolat");
		anissa.dormir();
		

	}

}
