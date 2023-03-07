package personnages;
import personnages.Chef;

public class Village 
{
	private String nom;
	private Chef chef;
	private int nbVillageois =0;
	private Gaulois [] villageois;
	public Village(String nom , int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois g)
	{
		if(nbVillageois < villageois.length)
		{
			this.villageois[nbVillageois] = g;
			this.nbVillageois++;
		}
	}
	
	public Gaulois trouverHabitant(int index)
	{
		return villageois[index-1];
	}

	public void afficherVillageois()
	{
		System.out.println("Dans village du chef Abraracourcis vivent les légendaires gaulois : ");
		for(int i = 0; i < this.nbVillageois; i++)
		{
			System.out.println("-" + this.villageois[i].getNom()); 
		}
	}
	public static void main(String[] args)
	{
		Village village = new Village("Village des Irréductibles", 30);
		//Gaulois gaulois = village.trouverHabitant(30);
		//l'exception survient car l'index max est 29 pas 30
		Chef abaracourcix = new Chef("Abaracourcix", 6, village);
		village.setChef(abaracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		
		
	}
}
