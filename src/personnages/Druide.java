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
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() == "Obelix") {
			parler("Non, Obelix!... Tu n'auras pas de poition magique!");
		} else {
			gaulois.boirePotion(forcePotion);
		}
	}
	
	public void preparerPotion() {
		Random random = new Random();
		forcePotion = random.nextInt(effetPotionMin, effetPotionMax);
		if (forcePotion > 7) {
			System.out.println("J'ai prepare une super potion de force " + forcePotion + ".");
		} else {
			System.out.println("Je n'ai pas trouve tous les ingredients, ma potion est seulement de force " + forcePotion + ".");
		}
	}
	
	public static void main(String[] args) {
		Gaulois obelix = new Gaulois("Obelix", 18);
		Gaulois asterix = new Gaulois("Asterix", 18);
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
		panoramix.booster(asterix);
		panoramix.booster(obelix);
	}
	
}
