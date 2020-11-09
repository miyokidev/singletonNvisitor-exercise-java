/*
 *  On crée ici une interface utilisant le design pattern visitor.
 */
public interface IShoppingCartVisitor {
	
	int visit(Mouse m);
	
	int visit(Keyboard k);
}
