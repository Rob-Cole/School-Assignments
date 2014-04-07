// Part of Question 3.12

public class Bug {
	private int position;
	private int turn;
		
	public Bug(int initialPosition) {
	position = initialPosition;}
	
	/** defining the initial position of the bug
	 * @param the position of the bug
	 */
	public void move() {
		if (turn == 1) {
			position = position - 1;}
		else {
			position = position + 1;}
		/** increases or decreases the position of the bug based on the status of the turn **/	
	}
	
	public void turn() {
		if (turn == 1) {
			turn = 0;}
		else {
			turn = 1;}
	/** sets the bug to go left (-1) or go right (+1). If turn is 1, then the bug goes left, and if turn is 0, it goes right **/
	}
	
	public int getPosition() {
		return position;
	/** returns the position of the bug **/
	}
}
