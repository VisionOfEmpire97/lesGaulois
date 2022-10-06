package histoire;
import personnages.*;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Astérix", 8);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix",5,10);
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		panoramix.preparerPotion(panoramix);
		asterix.boirePotion(panoramix.getForcePotion());
		asterix.parler("Merci Druide, je sens que ma force est " + asterix.getEffetPotion() + " fois décuplée.");
		asterix.frapper(minus);
	}
}
