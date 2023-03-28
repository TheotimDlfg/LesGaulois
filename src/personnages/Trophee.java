package personnages;

public class Trophee {
	private Gaulois gaulois;
	private Equipement[] equipement;
	
	public Trophee(Gaulois gaulois, Equipement[] equipement) {
		super();
		this.gaulois = gaulois;
		this.equipement = equipement;
	}

	public Gaulois getGaulois() {
		return gaulois;
	}

	public Equipement[] getEquipement() {
		return equipement;
	}
	
	public  void donnerNom() {
		System.out.println("Mon nom est" + gaulois.getNom() +".");	
	}
}
