package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}
	

	private String prendreParole() {
		return "Le Gaulois " + nom + ": ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "
		+ romain.getNom());
		romain.recevoirCoup(force / 3 * effetPotion);
		}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
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
		panoramix.preparerPotion(panoramix);
		asterix.boirePotion(panoramix.getForcePotion());
		asterix.parler("Merci Druide, je sens que ma force est " + asterix.effetPotion + " fois décuplée.");
		asterix.frapper(minus);
	}

}

