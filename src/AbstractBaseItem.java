/*
 * Pour le moment rien de compliqu� des points que nous avons d�j� vu cr�ation de la classe abstraite dont les �l�ments vont h�riter.
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
