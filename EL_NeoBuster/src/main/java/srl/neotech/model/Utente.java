package srl.neotech.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Utente {
	
	private String id;
	private StatoUtente stato;
	private String nominativo;
	private LocalDate dataNascita;
	private LocalDate dataRegistrazione;
	private ArrayList <Video> listaNoleggio=new ArrayList <Video>();
	private ArrayList <Video> listaAcquisto=new ArrayList <Video>();
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public StatoUtente getStato() {
		return stato;
	}
	public void setStato(StatoUtente stato) {
		this.stato = stato;
	}
	public String getNominativo() {
		return nominativo;
	}
	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}
	public LocalDate getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}
	public LocalDate getDataRegistrazione() {
		return dataRegistrazione;
	}
	public void setDataRegistrazione(LocalDate dataRegistrazione) {
		this.dataRegistrazione = dataRegistrazione;
	}
	public ArrayList<Video> getListaNoleggio() {
		return listaNoleggio;
	}
	public void setListaNoleggio(ArrayList<Video> listaNoleggio) {
		this.listaNoleggio = listaNoleggio;
	}
	public ArrayList<Video> getListaAcquisto() {
		return listaAcquisto;
	}
	public void setListaAcquisto(ArrayList<Video> listaAcquisto) {
		this.listaAcquisto = listaAcquisto;
	}

	
}
