/**
	 Product class defines the products available in a SuperMarket.
	 Each product can be identified by its product code
	 A product object will have an Offer object as its member. 
	 */
public class Product {
	
	private String productCode;
	private double productPrice;
	private Offer offer;
	private double salePrice;
	
	/**
	 * @param prodCode
	 * @param prodPrice
	 * @param offerObj
	 */
	public Product( String prodCode, double prodPrice, Offer offerObj){
		this.productCode =  prodCode;
		this.productPrice = prodPrice;
		this.setOffer(offerObj);
	}
	
	/**
	 * In case there is no offer on a product,Offer.offerType will be set as Offer.OFFER_TYPE_NONE
	 * @param prodCode
	 * @param prodPrice
	 */
	public Product( String prodCode, double prodPrice){
		this.productCode =  prodCode;
		this.productPrice = prodPrice;	
		this.offer = new Offer(Offer.OFFER_TYPE_NONE);
	}
	/**
	 * @return
	 */
	public String getProductCode() {
		return productCode;
	}
	/**
	 * @param productCode
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	/**
	 * @return
	 */
	public double getProductPrice() {
		return productPrice;
	}
	/**
	 * @param productPrice
	 */
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	/**
	 * @return
	 */
	/**
	 * @return
	 */
	public Offer getOffer() {
		return offer;
	}

	/**
	 * @param offer
	 */
	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	/**
	 * @return
	 */
	public double getSalePrice() {
		return salePrice;
	}

	/**
	 * @param salePrice
	 */
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	
	
	

}
