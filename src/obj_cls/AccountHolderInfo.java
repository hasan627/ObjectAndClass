package obj_cls;

public class AccountHolderInfo {
	
	String firstname;
	String lastname;
	int age;
	float accountbal;
	boolean elegibileforcreditcard;
	
	public void testElegibilityForCreditCard(){
		if (age>25 && accountbal>=20000){
			elegibileforcreditcard=true;
		}
			
	}

}
