// testing the merge Sorted and Sorted methods in the Sequence 7.20;
public class Sequence7_20Tester {

	public static void main(String [] args){
		
		Sequence7_20 A = new Sequence7_20();
		Sequence7_20 B = new Sequence7_20();
		int[] a = {1,4,9,16};
		int[] b = {9,7,4,9,11};
		for (int count = 0; count < 4; count ++){
			A.add(a[count]);
		}
		for (int countr = 0; countr < 5; countr++){
			B.add(b[countr]);
		}
		
		System.out.println(A.mergeSorted(B).toString());
		System.out.println(A.merge(B).toString());
	}
}
