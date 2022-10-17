package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		assert (force > 0);
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2];
	}
	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
			case 2: {
				System.out.println("Le soldat " + nom + " est deja bien protege!");
				break;
			}
			case 1: {
				if (equipements[0] == equipement) {
					System.out.println("Le soldat " + nom + " possede deja un " + 
							equipement + " !");
					break;
				} else {
					equipement(equipement);
					break;
				}
			}
			default : {
				equipement(equipement);
				break;
			}
		}
	}
	
	private void equipement(Equipement equipement) {
		equipements[nbEquipement] = equipement;
		nbEquipement++;
		System.out.println("Le soldat " + nom + " s'equipe d'un " + 
				equipement + ".");
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "'" + texte + "'");
	}
	
	private	String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	/*
	 * public void recevoirCoup(int forceCoup) { force -= forceCoup; if (force > 0)
	 * { parler("Aie"); } else { parler("J'abondonne..."); } }
	 */
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		if (force == 0) {
			parler("Aïe");
		} else {				
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		// post condition la force à diminuer
		assert force < oldForce;
		return equipementEjecte;
	}
	
	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de " 
	+ forceCoup;
		int resistanceEquipement = 0;
			if (nbEquipement != 0) {
				texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
				for (int i = 0; i < nbEquipement; i++) {
					if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
						resistanceEquipement += 8;
					} else {
						System.out.println("Equipement casque");
						resistanceEquipement += 5;
					}
				}
				texte += resistanceEquipement + "!";
			}
			parler(texte);
			forceCoup -= resistanceEquipement;
			if (forceCoup <= 0) {
				return 0;
			}
			return forceCoup;
		}
	
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + 
				"s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
			return equipementEjecte;
	}
	
	public static void main(String[] args) {
		//TODO creer un main qui permet de tester la classe Romain.
		Romain cesar = new Romain("Cesar", 10);
		System.out.println(cesar.prendreParole());
		cesar.parler("Bonjour");
		cesar.recevoirCoup(10);
		cesar.recevoirCoup(10);
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
		cesar.sEquiper(Equipement.CASQUE);
		cesar.sEquiper(Equipement.CASQUE);
		cesar.sEquiper(Equipement.BOUCLIER);
		cesar.sEquiper(Equipement.CASQUE);
		
	}
}
