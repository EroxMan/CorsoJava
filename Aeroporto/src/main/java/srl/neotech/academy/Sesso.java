package srl.neotech.academy;

import java.util.Random;

public enum Sesso {
	
	MASCHIO,
	FEMMINA;

	public static Sesso generateRandomSesso() {
        Sesso[] values = Sesso.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
	}
}