package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}

	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}


	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
	}
	
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
	}
	
	public void afficherVillageois(Chef chef) {
		System.out.println("Dans le village du chef " + chef.getNom() +
				" vivent les légendaires gaulois:");
		int buff = 0;
		while (buff < nbVillageois) {
			System.out.println("- " + villageois[buff].getNom());
			buff += 1;
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		//type mismatch : cannot convert String to gaulois;
		Chef Abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(Abraracourcix);
		Gaulois asterix = new Gaulois("Astérix",8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//type mismatch : cannot convert String to gaulois;
		//System.out.println(gaulois);
		village.afficherVillageois(Abraracourcix);
		Gaulois Obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(Obelix);
		village.afficherVillageois(Abraracourcix);
	}
}
