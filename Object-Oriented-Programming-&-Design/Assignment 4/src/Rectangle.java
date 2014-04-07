
public class Rectangle implements Measurable{

	private int len;
	private int wdth;
	private String refference;
	
	public Rectangle(String reff, int l, int w) {
		len = l;
		wdth = w;
		refference = reff;
	}
	
	public double getMeasure() {
		double perim = 2*len + 2*wdth;
		return perim;
	}
	
	public String getName() {
		return refference;
	}
	
	public String getLargest(Rectangle a) {
		if (a.getMeasure() < this.getMeasure())
		return (this.getName());
		else if (this.getMeasure() < a.getMeasure())
			return (a.getName());
		else
			return (a.getName()); // if they are the same, return one
	}
}
