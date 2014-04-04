// Part of Question 3.10

public class Product {

	
	private String name;
	private double price;
	
	public Product(String pName, double pPrice)
	{
		name = pName;
		price = pPrice;
	/** creates a Product type varriable.
	 * @param the products name and price*/
	}
	
	public String getName()
	{
		return name;
	/** returns the name of the product **/
	}
	
	public Double getPrice()
	{
		return price;
	/** returns the price of the product**/
	}
	
	public void reducePrice(double priceDrop)
	{
		price = price - priceDrop;
	/** recalculates the price of a product based the users input as a dollar decrease
	 * 	
	 */
	}
}
