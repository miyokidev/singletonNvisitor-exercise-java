/*
 *  On cr�e ici une interface avec le design pattern visitor utilistant un type g�n�rique
 */
public interface IShoppingCartVisitor {
	
	int visit(Mouse m);
	int visit(Keyboard k);
}
