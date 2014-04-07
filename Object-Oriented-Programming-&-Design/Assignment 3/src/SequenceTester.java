//Testing Sequence method used in 7.12

public class SequenceTester {
	public static void main(String [] args){
		
		Sequence A = new Sequence(9);
		Sequence B = new Sequence(9);
		
		// hard coding the example arrays
		
		A.set(0, 1);
		A.set(1,4);
		A.set(2, 9);
		A.set(3, 16);
		A.set(4, 9);
		A.set(5, 7);
		A.set(6, 4);
		A.set (7, 9);
		A.set(8, 11);
		
		B.set(0,11);
		B.set(1,1);
		B.set(2,4);
		B.set(3,9);
		B.set(4,16);
		B.set(5, 9);
		B.set(6, 7);
		B.set(7, 4);
		B.set(8,9);
		
		if (A.isPermutationOf(B) == true){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}
