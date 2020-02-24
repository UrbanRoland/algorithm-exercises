
public class CoinMinimum {

	public static void main(String[] args) {
		int[] coins= {1,2};
		int totalAmount=7;
		System.out.println(calculateMinCombo(coins,totalAmount,0));
	}
	
	public static  int calculateMinCombo(int[] coins, int amount, int currentIndex) {
		
		if(amount==0) {
			return 1;
		}
		
		int result=Integer.MAX_VALUE;
				
		for(int i=currentIndex;i<coins.length;i++) {
			if(coins[i]<=amount) {
				int subResult=calculateMinCombo(coins, amount-coins[i],i);
			
				if(subResult!=Integer.MAX_VALUE && (subResult+1)<result)
					result=subResult +1;
				
			}
		
		}
		return result;
		
	
	}
	
}
