/*
 * Nous allons ici utiliser le design patterns singleton histoire de s'assurer que l'on a qu'un seule instance du calculateur.
 */
public class ShoppingCartCalculatorSingleton implements IShoppingCartVisitor {

	private static ShoppingCartCalculatorSingleton calc;
	
	public static ShoppingCartCalculatorSingleton getInstance() {
		if (calc == null) { calc = new ShoppingCartCalculatorSingleton(); }
		return calc;
	}

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
	 * 	if (k.getBarCode() == "111") {
				cost = k.getPrice()-20;
			}
			else
				cost = k.getPrice();
		
			return cost;
		else if (e instanceof Keyboard)...
	 * }
	 * 
	 */
	
}
