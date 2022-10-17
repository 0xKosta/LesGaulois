package histoire;

import personnages.Equipement;

public class Scenario {

	public static void main(String[] args) {
		// TODO creer un main qui permet de tester un scenario.
		personnages.Druide panoramix = new personnages.Druide("Panoramix", 5, 10);
		personnages.Gaulois obelix = new personnages.Gaulois("Obelix", 18);
		personnages.Gaulois asterix = new personnages.Gaulois("Asterix", 6);
		personnages.Romain minus = new personnages.Romain("Minus", 20);
		personnages.Romain milexcus = new personnages.Romain("Milexcus", 8);
		personnages.Musee musee = new personnages.Musee();
		panoramix.parler("Je vais aller preparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par Benelos, ce n'est pas juste!");
		panoramix.booster(asterix);
		asterix.parler("Bonjour.");
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		milexcus.sEquiper(Equipement.CASQUE);
		minus.parler("UN GAU... UN GAUGAU...");
		int i;
		for (i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}
		milexcus.parler("UN GAU... UN GAUGAU...");
		for (i = 0; i < 4; i++) {
			asterix.frapper(milexcus);
		}
		asterix.faireUneDonnation(musee);
	}

}
