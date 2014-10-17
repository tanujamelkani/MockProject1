/*
 * Offer describes the offer on a product
 */
public class Offer {
	
	private String offerType; //buyXgetYfree, dollaroff, discountpercent, nooffer
	private double offerValue; //holds the discount for GET_Y_FREE or dollaroff or discountpercent
	private int multiplier;//holds the numerical value BUY_XS
	
	//String constants to hold the type of offer
	public static final String OFFER_TYPE_BUY_X_GET_Y_FREE = "buyXgetYfree";
	public static final String OFFER_TYPE_DOLLAROFF = "dollaroff";
	public static final String OFFER_TYPE_PERCENT_DISCOUNT = "discountpercent";
	public static final String OFFER_TYPE_NONE = "nooffer";
	/**
	 * @param type
	 * @param buyXgetYfree
	 */
	public Offer (String type, double offerValue, int multiplier)
	{
		this.offerType = type;		
		this.offerValue = offerValue;
		this.multiplier = multiplier;
	}
	/**
	 * @param type
	 * @param factor
	 */
	public Offer (String type, double offerValue)
	{
		this.offerType = type;		
		this.offerValue = offerValue;
		this.multiplier = 0;
	}
	/**
	 * @param type
	 */
	public Offer (String type)
	{
		this.offerType = type;
	}
	
	/**
	 * @return
	 */
	public String getOfferType() {
		return offerType;
	}
	/**
	 * @param offerType
	 */
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	/**
	 * @return
	 */
	public double getOfferValue() {
		return offerValue;
	}
	/**
	 * @param offerValue
	 */
	public void setOfferValue(double offerValue) {
		this.offerValue = offerValue;
	}
	/**
	 * @return
	 */
	public int getMultiplier() {
		return this.multiplier;
	}
	/**
	 * @param multiplier
	 */
	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}
	

}
