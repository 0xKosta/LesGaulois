package personnages;

public class Village {
	private String nom;
	private int population;
	
	public Village(String nom, int population) {
		this.nom = nom;
		this.population = population;
	}

	public String getNom() {
		return nom;
	}
	
	public void afficherPopulation() {
		System.out.println("Le village de " + nom + " a une population de " + population + ".");
	}
	
	public void ajouterHabitant() {
		population += 1;
	}
	
	public static void main(String args[]) {
		Village amorica = new Village("Amorica", 10);
		amorica.afficherPopulation();
	}
}


