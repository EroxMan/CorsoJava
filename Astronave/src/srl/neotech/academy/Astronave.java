package srl.neotech.academy;

public class Astronave {

	int  velocitàIniziale=0;
	
	
	public String decolla(int velocità) {
		this.velocitàIniziale=velocità;
		String risultato= "Ho impostato la velocità iniziale" + velocità;
		return risultato;
	}
	
	public String Accellera(int velocità) {
		this.velocitàIniziale=this.velocitàIniziale+velocità;
		String risultato= "Ho accellerato di:"+ velocità;
		return risultato;
	}
	
	
	public String Decellera(int velocità) {
		this.velocitàIniziale=this.velocitàIniziale-velocità;
		String risultato= "Ho decellerato di:"+ velocità;
		return risultato;
	}

	public int getVelocitàIniziale() {
		return velocitàIniziale;
	}

	public void setVelocitàIniziale(int velocitàIniziale) {
		this.velocitàIniziale = velocitàIniziale;
	}
	
}
