public class App {
	public static void main(String[] args) {
		
		// #2
		boolean isHotOutside = false;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = false;
	
		// #3 
	
		double costOfMilk = 2.69;
		double moneyInWallet = 20.00;
		int thirstLevel = 3;
	
		// #4
	
		boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		boolean willBuyMilk = isHotOutside && (thirstLevel > 3) && (moneyInWallet > (2 * costOfMilk));	
	}
}