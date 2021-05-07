package fr.formation.biblio;

public class Livre {
	
	private int isbn;
	private String titre;
	private float prix;
	

	public Livre(int isbn, String titre, float prix) {
		this.isbn = isbn;
		this.titre = titre;
		this.prix = prix;
	}


	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}


	public void toString(Livre livre) {
		System.out.printf("Livre [isbn = %d, titre = %s, prix = %.2f€]\n", isbn, titre, prix);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
