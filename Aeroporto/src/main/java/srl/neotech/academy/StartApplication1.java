package srl.neotech.academy;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class StartApplication1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Aeroporto aeroporto=new Aeroporto();
		Aereo aereo=new Aereo();
		Passeggero passeggero=new Passeggero();


		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=0; i<301; i++) {
			list.add(i);
		}
        for(int orarioPartenza=1;orarioPartenza<=100;orarioPartenza++) {
			Collections.shuffle(list);
			aereo=new Aereo();
			aereo.setStato(StatoAereo.IN_PARTENZA);
			aereo.setIdUnivoco(orarioPartenza );
			aereo.setCompagniaAerea(CompagniaAerea.generateRandomCompagniaAerea());

			if(aereo.getCompagniaAerea().equals(CompagniaAerea.ITA)) {
				aereo.getModello().setCostruttore("Boeing");
				aereo.getModello().setCodiceModello(65657);
				aereo.getModello().setCapienzaNumPasseggeri(170);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.EMIRATES)) {
				aereo.getModello().setCostruttore("Airbus");
				aereo.getModello().setCodiceModello(12456);
				aereo.getModello().setCapienzaNumPasseggeri(340);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.QATAR_AIRWAYS)) {
				aereo.getModello().setCostruttore("Boeing");
				aereo.getModello().setCodiceModello(9966);
				aereo.getModello().setCapienzaNumPasseggeri(400);
			}
			if(aereo.getCompagniaAerea().equals(CompagniaAerea.RYNAIR)) {
				aereo.getModello().setCostruttore("Antonov");
				aereo.getModello().setCodiceModello(5123);
				aereo.getModello().setCapienzaNumPasseggeri(152);
			}
		
			aereo.setOrario(list.get(0));
			list.remove(0);
			aereo.setVelocità(ThreadLocalRandom.current().nextInt(1, 10 + 1));
			aereo.setDistanzaDallAeroporto(0);
			aeroporto.getListaAerei().add(aereo);
	}
			
			for(int orarioArrivo=1;orarioArrivo<=200;orarioArrivo++) {
				Collections.shuffle(list);
				aereo=new Aereo();
				aereo.setStato(StatoAereo.IN_AVVICINAMENTO);
				aereo.setIdUnivoco(orarioArrivo);
				aereo.setOrario(list.get(0));
				list.remove(0);
				aereo.setCompagniaAerea(CompagniaAerea.generateRandomCompagniaAerea());
				
				if(aereo.getCompagniaAerea().equals(CompagniaAerea.EMIRATES)) {
					aereo.getModello().setCostruttore("Boeing");
					aereo.getModello().setCodiceModello(74790);
					aereo.getModello().setCapienzaNumPasseggeri(360);
				}
				if(aereo.getCompagniaAerea().equals(CompagniaAerea.ITA)) {
					aereo.getModello().setCostruttore("Antonov");
					aereo.getModello().setCodiceModello(320);
					aereo.getModello().setCapienzaNumPasseggeri(195);
				}
				if(aereo.getCompagniaAerea().equals(CompagniaAerea.QATAR_AIRWAYS)) {
					aereo.getModello().setCostruttore("Boeing");
					aereo.getModello().setCodiceModello(737-800);
					aereo.getModello().setCapienzaNumPasseggeri(189);
				}
				if(aereo.getCompagniaAerea().equals(CompagniaAerea.QATAR_AIRWAYS)) {
					aereo.getModello().setCostruttore("Airbus");
					aereo.getModello().setCodiceModello(318-100);
					aereo.getModello().setCapienzaNumPasseggeri(132);
				}
	
				aereo.setVelocità(ThreadLocalRandom.current().nextInt(1, 10 + 1));
				aereo.setDistanzaDallAeroporto(null);
				aeroporto.getListaAerei().add(aereo);
			} 
			
			for(int j=1;j<1000;j++) {
				passeggero=new Passeggero();
				passeggero.setIdUnivoco(j);
				passeggero.setStatoPasseggero(StatoPasseggero.IN_CHECKIN);
				passeggero.setClasseViaggiatore(ClasseViaggiatore.generateRandomClasseViaggiatore());
				if(passeggero.getClasseViaggiatore().equals(ClasseViaggiatore.EXCELSIOR)) {
					passeggero.setHaChampagne(true);
				}if(passeggero.getClasseViaggiatore().equals(ClasseViaggiatore.BUSINESS)) {
					passeggero.setHaGiornale(true);
				}if(passeggero.getClasseViaggiatore().equals(ClasseViaggiatore.BUSINESS)) {
					passeggero.setHaBagagli(true);
				}
				passeggero.setEtà((ThreadLocalRandom.current().nextInt(1, 80 + 1)));
				passeggero.setSesso(Sesso.generateRandomSesso());
				if(passeggero.getSesso().equals(Sesso.FEMMINA)) {
					passeggero.setHaFiore(true);
				}
				aeroporto.getListaPasseggeri().add(passeggero);
        }	
	
			ArrayList<Aereo> aereiInPartenza=new ArrayList<Aereo>();
			ArrayList<Aereo> aereiInArrivo=new ArrayList<Aereo>();
			
			for(Aereo aereoDaSmistare:aeroporto.getListaAerei()) {
				if(aereoDaSmistare.getStato().equals(StatoAereo.IN_PARTENZA)) {
					aereiInPartenza.add(aereoDaSmistare);
				}else {
					
					aereiInArrivo.add(aereoDaSmistare);
				}
			}
			Collections.sort(aereiInPartenza,new Comparator<Aereo>() {
				public int compare(Aereo o1, Aereo o2){
			         if(o1.getOrario() == o2.getOrario())
			             return 0;
			         return o1.getOrario() < o2.getOrario() ? -1 : 1;
			     }
			});
			
			
			//Ordinare aereiInArrivo
					Collections.sort(aereiInArrivo,new Comparator<Aereo>() {
						public int compare(Aereo o1, Aereo o2){
					         if(o1.getOrario() == o2.getOrario())
					             return 0;
					         return o1.getOrario() < o2.getOrario() ? -1 : 1;
					     }
					});
			System.out.println("----- IN PARTENZA--------");
			for(Aereo aereoInPartenza: aereiInPartenza) {
				System.out.println(aereoInPartenza);
			}
			System.out.println("----- IN ARRIVO--------");
			for(Aereo aereoInArrivo: aereiInArrivo) {
				System.out.println(aereoInArrivo);
			}
		
	
}
}
