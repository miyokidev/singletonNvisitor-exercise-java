/*
 * La classe qui représente le chariot du client
 */
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartClient {
	public List<AbstractBaseItem> cart = new ArrayList<AbstractBaseItem>();
	
	public void addItem(AbstractBaseItem i) {
		cart.add(i);
	}
	
	public void printTotal() {
		ShoppingCartCalculatorSingleton calc = ShoppingCartCalculatorSingleton.getInstance();
		
		int sum=0;
		
		for(AbstractBaseItem i : cart) {
			sum = sum + i.accept(calc);
		}
		
		System.out.println("Total Cost = "+sum);
	}
	
}
