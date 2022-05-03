package srl.neotech.model;

import java.util.ArrayList;

//Singleton

public class BaseDatiBuster {
	
	private ArrayList <Video> listaNoleggio=new ArrayList <Video>();
	private ArrayList <Utente> listaAcquisto=new ArrayList <Utente>();
	
	//Instanza statica
	private static BaseDatiBuster instance;
	
	//Costruttore
	private BaseDatiBuster() {
		
	}
	
	public static BaseDatiBuster getInstance() {
		if(instance==null) instance=new BaseDatiBuster();
		return instance;
	}

	public ArrayList<Video> getListaNoleggio() {
		return listaNoleggio;
	}

	public void setListaNoleggio(ArrayList<Video> listaNoleggio) {
		this.listaNoleggio = listaNoleggio;
	}

	public ArrayList<Utente> getListaAcquisto() {
		return listaAcquisto;
	}

	public void setListaAcquisto(ArrayList<Utente> listaAcquisto) {
		this.listaAcquisto = listaAcquisto;
	}

}
