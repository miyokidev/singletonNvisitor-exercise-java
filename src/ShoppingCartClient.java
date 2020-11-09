/*
 * La classe qui repr�sente le chariot du client
 */
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartClient {
	// La liste d'objet qui repr�sente notre panier
	public List<AbstractBaseItem> cart = new ArrayList<AbstractBaseItem>();
	
	// M�thode permettant d'ajouter des objets dans notre panier
	public void addItem(AbstractBaseItem i) {
		cart.add(i);
	}
	
	// M�thode permettant d'afficher le total du prix de notre panier.
	public void printTotal() {
		// On instance ici notre singleton � l'aide de la m�thode getInstance().
		ShoppingCartCalculatorSingleton calc = ShoppingCartCalculatorSingleton.getInstance();
		
		int total=0;
		
		// foreach pour chaque elements dans notre panier.
		for(AbstractBaseItem i : cart) {
			total = total + i.accept(calc);
		}
		
		System.out.println("Total Cost = " + total);
	}
	
}
