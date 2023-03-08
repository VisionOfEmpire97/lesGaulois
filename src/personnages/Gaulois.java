package personnages;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private int force;
	private int nbtrophees;
	private Equipement[] trophees = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	/**
	 * @return the effetPotion
	 */
	public int getEffetPotion() {
		return effetPotion;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] armureDetruite = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; armureDetruite != null && i < armureDetruite.length; i++, nbtrophees++) {
			this.trophees[nbtrophees] = armureDetruite[i];
		}
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");

	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Astérix", 8);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
		// System.out.println(asterix);
		asterix.parler("Bonjour à tous");
		asterix.boirePotion(panoramix.getForcePotion());
		asterix.frapper(minus);
	}

}

