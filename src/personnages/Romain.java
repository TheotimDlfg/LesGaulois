package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) 
	{
		assert force > 0:"erreur la force du romain est négative ou nul";
		this.nom = nom;
		this.force = force;
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
	public static void main(String[] args)
	{
		Romain minus = new Romain("Minus", 6);
	}
}
