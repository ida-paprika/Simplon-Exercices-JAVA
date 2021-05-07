package fr.formation.heritage2;

public class Personne {
	private String prenom;
	private int age;
	
	public Personne(String prenom, int age) {
		this.prenom = prenom;
		this.age = age;
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
	
	public void dormir() {
		System.out.println("Rrrrrrr Rrrrrrr");
	}
	
	public void manger(String fruit) {
		System.out.println("Miam miam, c’est bon ce fruit, "+ fruit +" !");
	}
	
	public void bonjour() {
		System.out.println("Bonjour, tu es "+ this.prenom +" et tu as "+ this.age +" ans");
	}
	
	
}
