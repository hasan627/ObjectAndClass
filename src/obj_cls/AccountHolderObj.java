package obj_cls;

public class AccountHolderObj {
	
	public static void main(String[] args) {
		
		AccountHolderInfo hasan = new AccountHolderInfo();
		AccountHolderInfo robin = new AccountHolderInfo();
		AccountHolderInfo ratul = new AccountHolderInfo();
		
		//Hasan Account Information
		hasan.firstname = "Hasan";
		hasan.lastname = "Rubel";
		hasan.age= 20;
		hasan.accountbal=10000;
		hasan.testElegibilityForCreditCard();
		System.out.println("Is Hasan Eligible for Credit Card "+hasan.elegibileforcreditcard);
		
		//Robin account info
		robin.firstname = "Robin";
		robin.lastname = "Mahmud";
		robin.age= 26;
		robin.accountbal=20000;
		robin.testElegibilityForCreditCard();
		System.out.println("Is Robin Eligible for Credit Card "+robin.elegibileforcreditcard);
		
		//Ratul account info
		ratul.firstname = "Ratul";
		ratul.lastname = "Hossain";
		ratul.age= 26;
		ratul.accountbal=21000;
		ratul.testElegibilityForCreditCard();
		System.out.println("Is Ratul Eligible for Credit Card "+ratul.elegibileforcreditcard);	
		
	}

}
