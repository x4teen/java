package com.mnrnyc.job;
import java.util.Date;

//class names are singular nouns in upper CamelCase
public class CreditCard {
	
	
//constants are declared in upper case letters
	public final int VISA = 5001;
	
// variable names are short meaningful nouns in lower camelCase
	public String accountName;
	public String cardNumber;
	public Date expDate;


//methods names are verbs in lower cameCase
	public double getCharges() {
		return 0.0;
	}
	
	public void disputeCharge(String chargeId, float amount) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
