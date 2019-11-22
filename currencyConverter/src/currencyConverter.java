import java.util.Scanner;	//allows user input

public class currencyConverter {

	//currency values
	static double euro;
	static double dollar;
	static double pound;
	static double yen;
	static double canadianDollar;
	static double baht;
	static String userCurrency = null;

	
	
	static Scanner in = new Scanner(System.in);		//user input
	
	public static void main(String[] args) {		
		introMessage();
		getUserCurrency();
	}

	private static void introMessage() {
		System.out.print("\nWelcome!" );
		System.out.print("\n\n======================================================");
		System.out.print("\n\nCurrency Converter:\n");
		System.out.print("\n\n This program changes currencys into euro\n");
		System.out.print("\nEnter in a currency type (e.g dollar,pound..)");
		System.out.print("\nCurrencies that can be entered are,");
		System.out.print("\ndollar, pound, yen, canadianDollar and baht.");
		System.out.print("\nType x to exit the application.");	
		System.out.print("\n\n======================================================\n");	
	}
	
	private static void getUserCurrency() {
		do {
			try{
				userCurrency = in.next();
				if(userCurrency.toLowerCase().equals("x"))
					{ 
					  break;
					}
				System.out.println("\nEnter euro amount:");			//display input message
				euro = in.nextDouble();
				
				switch(userCurrency) {
				case "dollar":
					dollar = euro*1.14;
					System.out.println("$ : " + dollar);
					clearValues();
					break;
				case "pound":
					pound = euro*0.80;
					System.out.println("£ : " + pound);
					clearValues();
					break;
				case "yen":
					yen = euro*127.17;
					System.out.println("¥ : " + yen);
					clearValues();
					break;
				case "canadian dollar":
					canadianDollar = euro*1.48;
					System.out.println("CAD : " + canadianDollar);
					clearValues();
					break;
				case "baht":
					baht = euro*40.06;
					System.out.println("THB : " + baht);
					clearValues();
					break;
				default:
					System.out.println("\nThis is not a valid currency, please type dollar, pound or yen.");	//error message
					clearValues();
					break;
				}
			}
			catch (Exception err) 
				{																//catch any error, e.g string price in price
				System.out.print("\nError has occured during input. Please try again \n");
				}
		}	while(userCurrency.toLowerCase() != "x");	//converts upper case to lower case, if user types 'X' instead of 'x'
			System.out.print("\nThank you for using the currency converter, close when finished.\n");		//displays outro message
		}

	private static void clearValues() {
		userCurrency = "";	//set user currency to blank
		euro = 0;	//set euro to 0
	}

}
	

