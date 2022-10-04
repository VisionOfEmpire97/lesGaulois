package personnages;

public class Romain {
	private String nom;
	private int force;
	
	
	public String getNom() {
		return nom;
	}


	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

	private String prendreParole() {
		return "Le romain" + nom + ":";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}
	public static void main(String[]args) {
		Romain brutus = new Romain("Brutus", 3);
		System.out.println(brutus);
		//TODO terminer le main 
	}
}
