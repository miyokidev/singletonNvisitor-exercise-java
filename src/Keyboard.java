/*
 * Ceci est donc notre deuxi�me �l�ment "un clavier".
 */
public class Keyboard extends AbstractBaseItem {

	public Keyboard(String barCode, int price) {
		super(barCode, price);
	}
	
	@Override
	public int accept(IShoppingCartVisitor v) {
		return v.visit(this);
	}
}
