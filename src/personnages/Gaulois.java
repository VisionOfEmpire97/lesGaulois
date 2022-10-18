package personnages;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	private int force, nb_trophees;
	private Equipement trophees[] = new Equipement[100];
	
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
	

//	private String prendreParole() {
//		return "Le Gaulois " + nom + ": ";
//	}
	
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
		}
	
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
//		+ romain.getNom());
//		romain.recevoirCoup(force / 3 * effetPotion);
//		}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++, nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
		return;
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");

	}
	

	public String toString() {
		return "Gaulois [nom = " + nom + ", force  = " + force + ", effetPotion = " + 
				effetPotion + "]";
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Astérix", 8);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix",5,10);
		// System.out.println(asterix);
		asterix.parler("Bonjour à tous");
		asterix.boirePotion(panoramix.getForcePotion());
		asterix.frapper(minus);
	}

}

