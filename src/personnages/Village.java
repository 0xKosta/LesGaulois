package personnages;

public class Village {
	private String nom;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private Chef chef;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void afficherVillageois() {
		int i = 0;
		String annonce = "Dans village du chef " + chef.getNom() + 
				" vivent les legendaires gaulois:";
		System.out.println(annonce);
		while (villageois[i] != null) {
			System.out.println("- " + villageois[i].getNom());
			i++;
		}
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;	
	}
	
	public Gaulois trouverHabitant(int numeroVillageois) {
		return villageois[numeroVillageois]; 
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}
	
	
	public static void main(String args[]) {
		Village village = new Village("Village des Irreductibles", 30);
		//Gaulois gaulois = village.trouverHabitant(30);
		//Les tableaux en Java ont comme premier indice 0, 
		//donc un tableau de longueur 30 va de 0 a 29.
		Chef abracourcix = new Chef("Abracourcix", 6, village);
		village.setChef(abracourcix);
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		//La reponse obtenue est null car un villageois avec le indice 1 n'existe pas
		//et donc il n'y a aucune information sur ce gaulois.
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		
	}
}


