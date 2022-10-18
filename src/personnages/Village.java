package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private String[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		super();
		this.nom = nom;
		this.villageois[nbVillageois] = villageois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}


	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		Village.villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
	}
	
	public void trouverHabitant(int numero) {
		System.out.println(Village.villageois[numero]);
	}
}
