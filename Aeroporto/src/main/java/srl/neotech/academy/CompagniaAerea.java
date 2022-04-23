package srl.neotech.academy;

import java.util.Random;

public enum CompagniaAerea {

	
	ITA,
	QATAR_AIRWAYS,
	RYNAIR,
	EMIRATES;
	
	
	
	public static CompagniaAerea generateRandomCompagniaAerea() {
		CompagniaAerea[]values=CompagniaAerea.values();
		 int length=values.length;
		 int randIndex=new Random().nextInt(length);
		 return values [randIndex];
		
		}
		
}
