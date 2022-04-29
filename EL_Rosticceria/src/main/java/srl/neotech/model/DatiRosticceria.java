package srl.neotech.model;

import java.util.ArrayList;

public class DatiRosticceria {
	
	private static DatiRosticceria instance;
	
	
	// Dati
	private ArrayList <Ordine> ordini=new ArrayList <Ordine>();
	private ArrayList <Prodotto> listino=new ArrayList<Prodotto>();
 	
	private DatiRosticceria () {
		
	}

	public static DatiRosticceria getInstance() {
		if (instance==null)  instance=new DatiRosticceria();
		return instance;
		}

	public ArrayList<Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(ArrayList<Ordine> ordini) {
		this.ordini = ordini;
	}

	public ArrayList<Prodotto> getListino() {
		return listino;
	}

	public void setListino(ArrayList<Prodotto> listino) {
		this.listino = listino;
	}
	
}
// Singleton