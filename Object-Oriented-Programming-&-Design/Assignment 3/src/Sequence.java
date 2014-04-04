
//This is the sequence class used in question 7.12 where sequence objects are arrays
public class Sequence {

	private int[] values;
	
	public Sequence (int size){
		values = new int[size];
	}

	public void set (int i, int n){
		values[i] = n;
	}
	
	
	public boolean isPermutationOf(Sequence other){
		int counts = 0;
		
		while (counts < values.length)
		{
			int i = values[counts];
			int countp = 0;
			
			while (countp < (other.values.length)){
				int k = other.values[countp];
				
				if (i == k){
					other.values[countp] = 0; 
					break;
				}
				else if (i != k && (countp == other.values.length - 1)){
					return false;
				}
				countp ++;
			}
			
			counts ++;		
		}
		
		return true;
	}
}

