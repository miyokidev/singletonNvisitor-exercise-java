/*
 * Ceci est donc notre deuxième élément "un clavier".
 */
public class Keyboard extends AbstractBaseItem {

	public Keyboard(String barCode, int price) {
		super(barCode, price);
	}
	
	// La méthode int accept(), permet à l'objet souris d'être visité par le visiteur elle appelle la méthode int visit() du visitor avec comme paramètre lui-même.
	@Override
	public int accept(IShoppingCartVisitor v) {
		return v.visit(this);
	}
}
