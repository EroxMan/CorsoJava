package srl.neotech.academy;

import java.util.List;

public class Aereo {
	
	private Integer idUnivoco;
	private Integer orario;
	private CompagniaAerea compagniaAerea;
	private ModelloAereo modello;
	private List<Passeggero> passeggeri;
	private Integer velocità;
	private Integer distanzaDallAeroporto;
	private StatoAereo stato;
	
	public Integer getIdUnivoco() {
		return idUnivoco;
	}
	public void setIdUnivoco(Integer idUnivoco) {
		this.idUnivoco = idUnivoco;
	}
	public Integer getOrario() {
		return orario;
	}
	public void setOrario(Integer orario) {
		this.orario = orario;
	}
	public ModelloAereo getModello() {
		return modello;
	}
	public void setModello(ModelloAereo modello) {
		this.modello = modello;
	}  
	public Integer getVelocità() {
		return velocità;
	}
	public void setVelocità(Integer velocità) {
		this.velocità = velocità;
	}
	public Integer getDistanzaDallAeroporto() {
		return distanzaDallAeroporto;
	}
	public void setDistanzaDallAeroporto(Integer distanzaDallAeroporto) {
		this.distanzaDallAeroporto = distanzaDallAeroporto;
	}
	public StatoAereo getStato() {
		return stato;
	}
	public void setStato(StatoAereo stato) {
		this.stato = stato;
	}
	public List<Passeggero> getPasseggeri() {
		return passeggeri;
	}
	public void setPasseggeri(List<Passeggero> passeggeri) {
		this.passeggeri = passeggeri;
	}
	public CompagniaAerea getCompagniaAerea() {
		return compagniaAerea;
	}
	public void setCompagniaAerea(CompagniaAerea compagniaAerea) {
		this.compagniaAerea = compagniaAerea;
	}
	

}
