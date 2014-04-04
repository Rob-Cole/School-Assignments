
public class RectangleInnerMeasure {


	private int len;
	private int wdth;
	private String refference;
	
	public RectangleInnerMeasure(String reff, int l, int w)
	{
		len = l;
		wdth = w;
		refference = reff;
	}
	
	public class Measure
	{
		private double prim;
		public Measure(RectangleInnerMeasure R)
		{
			prim = 2*R.len+2*R.wdth;
		}
		public double getMeasure(){
			return prim;
		}
	}
	
	
	public String getName(){
		return refference;
	}
	
	public String getLargest(RectangleInnerMeasure a)
	{
		Measure ths = new Measure(this);
		Measure A = new Measure(a);
		
		if (ths.getMeasure()< A.getMeasure()){
			return a.getName();}
			else if (A.getMeasure()<ths.getMeasure()){
				return this.getName();}
				else{
					return this.getName();}
		
		
	}
}

