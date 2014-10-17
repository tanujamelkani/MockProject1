
/*
 * Shopping Cart defines a real world loaded shopping cart that
 * has a Product and its corresponding count
 */
public class ShoppingCartItem {
	
	/**
	 * @param product
	 * @param quantity
	 */
	public ShoppingCartItem(Product product, int quantity)
	{
		this.product=product;
		this.quantity=quantity;
	}
	private Product product;
	private int quantity;
	
	/**
	 * @return
	 */
	public Product getproduct() {
		return product;
	}
	/**
	 * @param product
	 */
	public void setproduct(Product product) {
		this.product = product;
	}
	/**
	 * @return
	 */
	public int getquantity() {
		return quantity;
	}
	/**
	 * @param quantity
	 */
	public void setquantity(int quantity) {
		this.quantity = quantity;
	}
}
