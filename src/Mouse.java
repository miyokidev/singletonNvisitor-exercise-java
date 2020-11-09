/*
 * Ceci est donc notre premier élément "une souris".
 */
public class Mouse extends AbstractBaseItem {
	
	public Mouse(String barCode, int price) {
		super(barCode,price);
	}

	@Override
	public int accept(IShoppingCartVisitor v) {
		return v.visit(this);
	}
}
