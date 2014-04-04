
public class Clock {
	
	public static void main (String[] args)
	{
	
		int arrayA[] = new int[6];

		int arrayB[] = arrayA;

		arrayA[0] = 1;
		arrayA[1] = 2;
		arrayA[2] = 3;

		for (int i = 0; i < arrayA.length; i++){
			System.out.println(arrayB[i]);
			System.out.println(arrayA[i]);
		}
	}
}
