package srl.neotech.academy;

import java.util.ArrayList;


public class Aeroporto {

	private ArrayList <Aereo> listaAerei;
	private ArrayList <Passeggero> listaPasseggeri;
	private Integer raggioDiAzione;
	
	
	public Aereo decollo(Aereo aereo) {
		for(int i = 0; i < this.listaAerei.size(); i++){
			if(aereo.getIdUnivoco().equals(listaAerei.get(i).getIdUnivoco())) {
				listaAerei.get(i).setStato(StatoAereo.DECOLLATO);
				return listaAerei.get(i);
			}
		}
		return aereo;
	}
	
	public Aereo atterraggio(Aereo aereo){
		for (int i=0; i < listaAerei.size(); i++) {
			if (aereo.getIdUnivoco().equals(listaAerei.get(i).getIdUnivoco())) {
				listaAerei.get(i).setStato(StatoAereo.ATTERRATO);
				return listaAerei.get(i);
			}
		}return aereo;
	}
	
	public Passeggero checkin(Passeggero passeggero)  {
		for (int i=0; i<listaPasseggeri.size(); i++) {
			if (passeggero.getIdUnivoco().equals(listaPasseggeri.get(i).getIdUnivoco())) {
		    	listaPasseggeri.get(i).setStatoPasseggero(StatoPasseggero.IN_CHECKIN);
			    return listaPasseggeri.get(i);
			}
		}return passeggero;
	}
	
	public Passeggero checkout(Passeggero passeggero){
		for (int i=0; i< listaPasseggeri.size();i++) {
			if (passeggero.getIdUnivoco().equals(listaPasseggeri.get(i).getIdUnivoco())) {
				listaPasseggeri.get(i).setStatoPasseggero(StatoPasseggero.CHECKOUT);
				return listaPasseggeri.get(i);
			}
		}return passeggero;
	}

	public ArrayList<Aereo> getListaAerei() {
		return listaAerei;
	}

	public void setListaAerei(ArrayList<Aereo> listaAerei) {
		this.listaAerei = listaAerei;
	}

	public ArrayList<Passeggero> getListaPasseggeri() {
		return listaPasseggeri;
	}

	public void setListaPasseggeri(ArrayList<Passeggero> listaPasseggeri) {
		this.listaPasseggeri = listaPasseggeri;
	}

	public Integer getRaggioDiAzione() {
		return raggioDiAzione;
	}

	public void setRaggioDiAzione(Integer raggioDiAzione) {
		this.raggioDiAzione = raggioDiAzione;
	}

	}

