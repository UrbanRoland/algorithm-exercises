
public class TowerOfHanoi {

	public static void main(String[] args) {
		int n=6;
		towerOfhanoi(n,'A','C','B');
	}
	/**
	 * 
	 * @param n number disk to be moved
	 * @param start rod where disk is present
	 * @param end rod where the disk is to be moved
	 * @param temp auxilliary rod
	 */
	public static void towerOfhanoi(int n, char start, char end, char temp) {
		
		if(n==1) {
			System.out.println("Move disk 1 from rod " +  start + " to rod " + end);
			return;
		}
		towerOfhanoi(n-1, start, temp, end); 
		System.out.println("Move disk " + n + " from rod " +  start + " to rod " + end); 
		towerOfhanoi(n-1, temp, end, start); 
		
	}
	
	
}
