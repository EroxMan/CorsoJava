package srl.neotech.academy;

import java.util.Scanner;

public class StartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Astronave astronaveTest= new Astronave();
		System.out.println("Inserire la velocità di decollo:");
		Scanner inputVelocità = new Scanner(System.in);
		int velocitàDecollo = inputVelocità.nextInt();
		astronaveTest.decolla(velocitàDecollo);
		
		System.out.println("Quante manovre vuoi fare?");
		Scanner inputManovre = new Scanner(System.in);
		int manovre = inputManovre.nextInt();
		
		for (int i=0;  i<manovre; i++) {
			System.out.println("Premere 1 per Accellerare o Premere 0 per decellerare");
		    Scanner inputAzione = new Scanner(System.in);
		    int azione = inputAzione.nextInt();
		    
		    System.out.println("Quale velocità vuoi impostare?");
		    Scanner inputCambioVelocità = new Scanner(System.in);
		    int cambioVelocità = inputCambioVelocità.nextInt();
		    
		    if (cambioVelocità > 0) {
		    	if (azione == 1) {
		    		astronaveTest.Accellera(cambioVelocità);
		    	}else if (azione == 0) {
		    		astronaveTest.Decellera(cambioVelocità);
		    	}
		    }
		}
		System.out.println("La velocità finale è:"+ astronaveTest.getVelocitàIniziale());
	}

}
