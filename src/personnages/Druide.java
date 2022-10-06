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
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller" + 
				"d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
	}
	
	public String getNom() {
		return nom;
	}
	
	public int preparerPotion(){
		Random rand = new Random();
		int rValue = rand.nextInt(effetPotionMax);
		if (rValue > 7) {
			Druide.parler("J'ai préparé une super potion de force");
		} else {
			Druide.parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force");
		}
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}
	
	private String prendreParole() {
		return "Le druide " + nom  + " : ";
	}
	
public static void main(String[] args) {
	Druide panoramix = new Druide("Panoramix",5,10);
	}
}
