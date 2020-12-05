
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#3 in homework
				// a item price
				double itemAPrice = 3.50;
				double itemBPrice = 12.95;
				
				// b amount of money in wallet
				double moneyInActualWallet = 25.00;
				double moneyInDecoyWallet = 5.55;
				
				// c Number of friends
				int numberOfRealFriends = 7;
				int numberOfFacebookFriends = 174;
				
				// d age in years
				int myActualAge = 30;
				int ageITellOthers = 29;
				
				// e first name
				String myRealFirstName = "Kathryn";
				String myFakeFirstName = "Katy";
				
				// f Last name
				String myRealLastName = "Sundquist";
				String myFakeLastName = "Medina";
				
				// g middle initial
				char myMiddleInitial = 'R';
				char notMyMiddleInitial = 'G';
				
			// #4 in homework
				// a. New amount of money after buying
				double newMoney = moneyInActualWallet - itemAPrice;
				
				// b. Number of friends you've made each year
				int friendsPerYear = numberOfFacebookFriends / myActualAge;
				
				// c. full name
				
				String  myFullName = myRealFirstName + " " + myMiddleInitial + " " + myRealLastName;
				
				System.out.println("The price of item A is " + itemAPrice);
				System.out.println("The price of item B is " + itemBPrice);
				System.out.println("The amount of money in my wallet is " + moneyInActualWallet);
				System.out.println("The amount of money in my decoy wallet is " + moneyInDecoyWallet);
				System.out.println("The number of real friends I have is " + numberOfRealFriends);
				System.out.println("The number of facebook friends I have is " + numberOfFacebookFriends);
				System.out.println("I am actually " + myActualAge);
				System.out.println("But I am tempted to tell people I'm " + ageITellOthers);
				System.out.println("My real first name is " + myRealFirstName);
				System.out.println("But my in-laws sometimes call me " + myFakeFirstName);
				System.out.println("My last name is " + myRealLastName);
				System.out.println("But if I had taken my husband's last name it would be " + myFakeLastName);
				System.out.println("My middle initial is " + myMiddleInitial);
				System.out.println("My middle initial is not " + notMyMiddleInitial);
				System.out.println("If I bought item A using money in my wallet, I would have " + newMoney);
				System.out.println("I have made " + friendsPerYear + " friends per year.");
				System.out.println("My full name is " + myFullName);
				
	}

}
