import java.util.ArrayList;

// This is the sequence class used in questions 7.21 and 7.22 where the sequence object is an array list

public class Sequence7_20 {

	private ArrayList<Integer> values;
	
	public Sequence7_20() {
		values = new ArrayList<Integer>();}
	
	public void add(int n) {
		values.add(n);}
	
	public String toString() {
		return values.toString();}
	
	public Sequence7_20 merge(Sequence7_20 other){
		Sequence7_20 merged = new Sequence7_20();
		int counter = 0;
		int a = 0;
		int b= 0;

		while(counter < (values.size()+other.values.size())){
		
		
			if (a<values.size()){
				merged.add(values.get(a));
				a++;
			}
			if (b<other.values.size()){
				merged.add(other.values.get(b));
				b++;
			}
			
			counter ++;
		}
		return merged;
	}
		public Sequence7_20 mergeSorted(Sequence7_20 other){
			Sequence7_20 merged = new Sequence7_20();
			int a = 0;
			int b= 0;
			int l1 = 0;
			int l2 = 0;
			int i = 0;
			
			//determining the acceptable range of the array based on whether or not it is currently sorted
			while((i<values.size()-1)&&values.get(i)<values.get(i+1)){
				l1++;
				i++;
			}
			i = 0; //reset the counter;
			while(i<other.values.size()-1&&other.values.get(i)<=other.values.get(i+1)){
				l2++;
				i++;
			}
		
			while(a != l1+1 || b != l2+1){
				if (a<l1+1){
					if (b<l2+1){
						if (values.get(a)<other.values.get(b)){
							merged.add(values.get(a));
							a++;
						}
						else{
							merged.add(other.values.get(b));
							b++;
						}
					}
					else {
							merged.add(values.get(a));
							a++;
					}
				}	
			}
			
			 
			return merged;
		}
	
	}
	
