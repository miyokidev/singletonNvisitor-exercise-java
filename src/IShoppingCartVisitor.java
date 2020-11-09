/*
 *  On crée ici une interface avec le design pattern visitor utilistant un type générique
 */
public interface IShoppingCartVisitor {
	
	int visit(Mouse m);
	int visit(Keyboard k);
}
