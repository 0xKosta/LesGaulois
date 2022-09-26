package histoire;

public class Scenario {

	public static void main(String[] args) {
		// TODO creer un main qui permet de tester un scenario.
		personnages.Druide panoramix = new personnages.Druide("Panoramix", 5, 10);
		personnages.Gaulois obelix = new personnages.Gaulois("Obelix", 18);
		personnages.Gaulois asterix = new personnages.Gaulois("Asterix", 15);
		personnages.Romain minus = new personnages.Romain("Minus", 15);
		panoramix.parler("Bonjour, je suis le druide " + panoramix.getNom() + " et ma potion peut aller de 5 a 10");
		panoramix.parler("Je vais aller preparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Benelos, ce n'est pas juste!");
		panoramix.booster(asterix);
		asterix.parler("Bonjour.");
		minus.parler("UN GAU... UN GAUGAU...");
		int i;
		for (i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}
	}

}
