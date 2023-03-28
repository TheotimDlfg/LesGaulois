package personnages;


public class Gaulois {
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	private String nom;
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	private int effetPotion = 1;
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
	
	public void boirePotion(int effet)
    {
        effetPotion = effet;
        System.out.println("Merci druide, je sens que ma force est " + effet + " fois décuplé !");
    }
	
	public void frapper(Romain romain) {
			System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
 			Equipement [] trophee = romain.recevoirCoup((force / 3) *effetPotion);
			for (int i = 0; trophee != null && i < trophee.length-1; i++,nbTrophees++)
			{
				this.trophees[nbTrophees] = trophee[i];
			}
		}
	
	public void faireUneDonnation(Musee m) {
		if(nbTrophees > 0) {
			System.out.println("Le gaulois " + nom + ": Je donne au musee tout mes trophees :");
			for(int i = 0; i < nbTrophees; i++) {
				System.out.println("- " + trophees[nbTrophees]);
				m.donnerTrophees(this, trophees[nbTrophees]);
				nbTrophees--;
			}
		}
	}
	
	
	public String extraireInstructionsCaml() {
		String liste = "";
		for(int i = 0; i < nbTrophees; i++) {
			liste += "(" + nom + ", " + trophees[nbTrophees] +")\n";
		}
		return liste;
	}
	
	
	@Override
	public String toString() {
	return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
		
	public static void main(String[] args)
	{
		Gaulois asterix =  new Gaulois("Astérix", 8);
		asterix.getNom();
		System.out.println(asterix);
		asterix.parler("coucou");
		Romain r  = new Romain("test", 4);
		asterix.frapper(r);
		
		
	}
}
