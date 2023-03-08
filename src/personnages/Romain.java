package personnages; 

public class Romain {
	private String nom;
	private int force;
	private Equipement [] equipements;
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) 
	{
		assert force > 0:"erreur la force du romain est négative ou nul";
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	private String prendreParole() {
		return "Le romain  " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert this.force > 0:"erreur la force du romain est négative ou nul";
		int f_debut = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}		
		assert this.force < f_debut: "La force n'as pas diminué";
	}
	
	public void sEquiper(Equipement e) {
		switch(nbEquipement){
			case 2:
				System.out.println("Le soldat " + nom +" est déjà bien protégé !");
				break;
			case 1:
				if(equipements[0] == e)
				{
					System.out.println("Le soldat, " + nom + " possède déjà, un " + equipements[0] + " !");
				}else {
					nbEquipement++;
					equipements[nbEquipement-1] = e;
					System.out.println("Le soldat "+ nom +" s’équipe avec un " + e +".");
				}
				break;
			default:
				nbEquipement++;
				equipements[0] = e;
				System.out.println("Le soldat "+ nom +" s’équipe avec un " + e +".");
				break;
		}
	}
	
	public static void main(String[] args)
	{
		Romain minus = new Romain("Minus", 6);
		//System.out.println(Equipement.CASQUE);
		//System.out.println(Equipement.BOUCLIER);
		
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		
	}
}
