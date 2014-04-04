public class e2_14 {
		public static void main(String[] args) {
			
					 Day today = new Day();
					 Day future = today.addDays(10); // adds 10 days more to the current date
					 int daysDiff = future.daysFrom(today); //determines the difference in days between the future and today
					 System.out.println("Expected: 10 ");
					 System.out.println("Results: " + daysDiff); // displays 10 days to be the difference
		}
}
