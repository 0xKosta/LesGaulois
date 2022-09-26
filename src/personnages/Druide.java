package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int forcePotion = 1;
	private int effetPotionMin;
	private int effetPotionMax;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " +
		nom + " et ma potion peut aller d'une force "
		+ effetPotionMin + " a " + effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "'" + texte + "'");
	}
	
	public String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void preparerPotion() {
		Random random = new Random();
		int num = random.nextInt(effetPotionMin, effetPotionMax);
		if (num > 7) {
			System.out.println("J'ai prepare une super potion de force " + num + ".");
		} else {
			System.out.println("Je n'ai pas trouve tous les ingredients, ma potion est seulement de force " + num + ".");
		}
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
		
	}
	
}
