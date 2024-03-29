package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMax = effetPotionMax;
		this.effetPotionMin = effetPotionMin;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force "+ effetPotionMin + " à " + effetPotionMax + ".");
		
	}
	
	public String getNom() {
		return nom;
	}
	
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	 
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void booster(Gaulois gaulois)
    {
        if (gaulois.getNom() == "Obélix")
        {
            parler("Non Obélix !... Tu n'auras pas de potion magique !");
        }
        else
        {
            gaulois.boirePotion(forcePotion);
        }
    }
	
	public void preparerPotion() {
		Random rand = new Random();
		int fp = rand.nextInt(effetPotionMax);
		if(fp > 7) {
			parler("J'ai préparé une super potion de force" + fp);
		}else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force" + fp);
		}
	}
	
	public static void main(String[] args)
	{	
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion(); // pas sur de la fonction
	}
}
