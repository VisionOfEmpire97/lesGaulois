package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion;
		
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		super();
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller " + 
				"d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getForcePotion() {
		return forcePotion;
	}

	public void preparerPotion(){
		parler("Je vais aller préparer une petite potion...");
		Random rand = new Random();
		forcePotion = 0;
		while ( getForcePotion() < effetPotionMin) {
			forcePotion = rand.nextInt(effetPotionMax);
		}
		if (getForcePotion() > 7) {
			parler("J'ai préparé une super potion de force");
		} else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + getForcePotion());
		}
	}
	
	public void booster(Gaulois gaulois) {
			parler("Non," + gaulois.getNom() + "!... Tu n’auras pas de potion magique !");
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}
	
	private String prendreParole() {
		return "Le druide " + nom  + " : ";
	}
	
public static void main(String[] args) {
	Druide panoramix = new Druide("Panoramix",5,10);
	panoramix.preparerPotion();
	}
}
