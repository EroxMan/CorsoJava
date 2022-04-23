package srl.neotech.academy;
import java.util.Random;

public enum TipologiaMovimenti {

	PRELIEVO,
	VERSAMENTO;
	
	
	public static TipologiaMovimenti generateRandomOperazione() {
		TipologiaMovimenti[]values=TipologiaMovimenti.values();
		 int length=values.length;
		 int randIndex=new Random().nextInt(length);
		 return values [randIndex];
		
		}

}
