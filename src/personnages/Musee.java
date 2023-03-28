package personnages;

public class Musee {
	// Attributs
	private Equipement[] tab;
	private int nbTrophee;
	
	public Musee(Equipement[] tab, int nbTrophee) {
		super();
		assert nbTrophee <= 200;
		this.tab = tab;
		this.nbTrophee = nbTrophee;
	}
	
	public void donnerTrophees(Gaulois gaulois, Equipement e) {
		nbTrophee++;
		tab[nbTrophee] = e;
		System.out.println( gaulois.getNom() + " a donné tout ces trohées au musée.");	
	}
}
