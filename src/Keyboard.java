/*
 * Ceci est donc notre deuxi�me �l�ment "un clavier".
 */
public class Keyboard extends AbstractBaseItem {

	public Keyboard(String barCode, int price) {
		super(barCode, price);
	}
	
	// La m�thode int accept(), permet � l'objet souris d'�tre visit� par le visiteur elle appelle la m�thode int visit() du visitor avec comme param�tre lui-m�me.
	@Override
	public int accept(IShoppingCartVisitor v) {
		return v.visit(this);
	}
}
