/*
 * Pour le moment rien de compliqué des points que nous avons déjà vu création de la classe abstraite dont les éléments vont hériter.
 */
public abstract class AbstractBaseItem{
	
	private String barCode;
	private int price;
	
	public AbstractBaseItem(String barCode, int price) {
		this.barCode = barCode;
		this.price = price;
	}
	
	public String getBarCode() {
		return this.barCode;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public abstract int accept(IShoppingCartVisitor v);
	
}
