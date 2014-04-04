
public class RectangleInnerMeasureTester {

		public static void main(String[] args)
		{
			RectangleInnerMeasure small = new RectangleInnerMeasure("a",5,5);
			RectangleInnerMeasure large = new RectangleInnerMeasure("b",10,10);
			
			System.out.println("Expected: b");
			System.out.println("Results: " + small.getLargest(large));
		}

}
