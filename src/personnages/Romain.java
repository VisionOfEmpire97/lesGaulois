package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;
	
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force >= 0: "force doit être positive";
		this.equipements = new Equipement[2];
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
	
	public void afficherEquipement() {
		for (Equipement equipement : Equipement.values()) {
			System.out.println("- " + equipement);
		}
	}
	
	@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}
	
	private void incrementEquip(Equipement equipement){
		equipements[nbEquipement] = equipement;
		nbEquipement += 1;
		System.out.println("Le soldat Minus s’équipe avec un " + equipement);
	}
	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		case 1:
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement);
			} else {
				incrementEquip(equipement);
			}
			break;
		default:
			incrementEquip(equipement);
		}
	}
	public static void main(String[]args) {
		Romain minus = new Romain("Minus", 6);
//		System.out.println(minus);
//		minus.parler("UN GAU... UN GAUGAU...");
//		minus.recevoirCoup(5);
//		minus.recevoirCoup(7);
		minus.afficherEquipement();
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}
