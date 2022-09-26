package histoire;

public class Scenario {

	public static void main(String[] args) {
		// TODO creer un main qui permet de tester un scenario.
		personnages.Gaulois asterix = new personnages.Gaulois("Asterix", 15);
		personnages.Romain minus = new personnages.Romain("Minus", 15);
		asterix.parler("Bonjour a tous");
		minus.parler("UN GAU... UN GAUGAU...");
		int i;
		for (i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}
	}

}
