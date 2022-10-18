package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force >= 0: "force doit être positive";
	}
	
	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}

	private String prendreParole() {
		return "Le romain " + nom + ": ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert force >= 0: "force doit être positive";
		int forceBuff = force; 
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert forceBuff > force: "force doit avoir diminuée";
	}
	
	
	@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}

	public static void main(String[]args) {
		Romain minus = new Romain("Minus", 6);
		System.out.println(minus);
		minus.parler("UN GAU... UN GAUGAU...");
		minus.recevoirCoup(5);
		minus.recevoirCoup(7);
	}
}
