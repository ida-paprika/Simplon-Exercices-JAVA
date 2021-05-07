package fr.formation.heritage;

public class Apprenant extends Personne {

	public enum Os {INDEFINI, WINDOWS, MAC, LINUX};
	private String lieuDeTravail;
	private Os system;

	public Apprenant(String prenom, int age, String lieuDeTravail, Os system) {
		super(prenom, age);
		this.lieuDeTravail = lieuDeTravail;
		this.system = system;
	}
	
	public String getLieuDeTravail() {
		return lieuDeTravail;
	}
	public void setLieuDeTravail(String lieuDeTravail) {
		this.lieuDeTravail = lieuDeTravail;
	}
	public Os getSystem() {
		return system;
	}
	public void setSystem(Os system) {
		this.system = system;
	}
	
	public void travailler() {
		System.out.println("Dur dur java !");
	}
	
	public void chomer() {
		System.out.println("Ah que j’aime les pauses café …");
	}
	
	@Override
	public void bonjour() {
		super.bonjour();
		if (this.system == Os.INDEFINI) {
			System.out.println("Tu ne connais pas encore ton OS !");
		} else if (this.system == Os.WINDOWS) {
			System.out.println("Tu vas bosser sur Windows ! Super, comme en formation !");
		} else if (this.system == Os.LINUX) {
			System.out.println("Tu vas bosser sur Linux ! Tu aimes la liberté !");
		} else {
			System.out.println("Tu vas bosser sur Mac ! Ouille ! Mais bon, un linux se cache sous le capot…");
		}
		System.out.println("Ton lieu de travail est à "+ this.lieuDeTravail);
	}
	
}
