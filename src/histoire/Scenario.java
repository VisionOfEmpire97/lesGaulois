package histoire;
import personnages.*;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix",30);
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste!");
		asterix.boirePotion(panoramix.getForcePotion());
		asterix.parler("Bonjour à tous");
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.parler("UN GAU... UN GAUGAU...");
		while (minus.getForce() > 0){  //attention on est sur des int
			asterix.frapper(minus);    //si la force est < 3 à l'init on a une boucle infinie
		}
	}
}
