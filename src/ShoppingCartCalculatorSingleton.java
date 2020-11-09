/*
 * Nous allons ici utiliser le design patterns singleton histoire de s'assurer que l'on a qu'un seule instance du calculateur.
 * On y implémente l'interface visitor et on y ré-écrit (override), les méthodes visit de l'interface.
 */
public class ShoppingCartCalculatorSingleton implements IShoppingCartVisitor {

	private static ShoppingCartCalculatorSingleton calc;
	
	// Il est essentiel de mettre le constructeur en private, pour empêcher l'instanciation de cette classe.
	private ShoppingCartCalculatorSingleton() {};
	
	// Cette méthode est essentiel au design pattern Singleton elle permet de n'avoir qu'un seul instance.
	// Si la classe n'a jamais été instancié on le fait pour la première fois ensuite on la retourne à chaque fois.
	public static ShoppingCartCalculatorSingleton getInstance() {
		if (calc == null) { calc = new ShoppingCartCalculatorSingleton(); }
		return calc;
	}
	
	// On ré-écrit ici les méthodes visit pour y effectuer les actions que l'on souhaite.
	// Par exemple comme ci-dessous les remises sur les prix ou produits que le magasin vend.

	@Override
	public int visit(Mouse m) { 
		int cost = 0;
		
		// Appliquez 10.- de remise si le prix de la souris dépasse 100.-
		if (m.getPrice() > 100) {
			cost = m.getPrice()-10;
		}
		else
			cost = m.getPrice();
		
		System.out.println("Mouse bar code: "+ m.getBarCode() + " cost = " + cost);
		return cost;
	}

	@Override
	public int visit(Keyboard k) {
		int cost = 0;
		
		// Appliquez 20.- de remise si le code barre du clavier est 111.
		if (k.getBarCode() == "111") {
			cost = k.getPrice()-20;
		}
		else
			cost = k.getPrice();
		
		System.out.println("Keyboard bar code: "+ k.getBarCode() + " cost = " + cost);
		return cost;
	}
	
	/*
	 * La méthode au-dessus évite de faire ça:
	 * 
	 * if (e instanceof Mouse) {
	 * 	if (e.getBarCode() == "111") {
				cost = e.getPrice()-20;
			}
			else
				cost = e.getPrice();
		
			return cost;
		else if (e instanceof Keyboard)...
	 * }
	 * 
	 */
	
}
