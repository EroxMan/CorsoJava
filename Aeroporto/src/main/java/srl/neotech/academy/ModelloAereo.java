package srl.neotech.academy;

public class ModelloAereo {
	
	private String costruttore;
	private Integer codiceModello;
	private Integer capienzaNumPasseggeri;
	
	public String getCostruttore() {
		return costruttore;
	}
	public void setCostruttore(String costruttore) {
		this.costruttore = costruttore;
	}
	public Integer getCapienzaNumPasseggeri() {
		return capienzaNumPasseggeri;
	}
	public void setCapienzaNumPasseggeri(Integer capienzaNumPasseggeri) {
		this.capienzaNumPasseggeri = capienzaNumPasseggeri;
	}
	public Integer getCodiceModello() {
		return codiceModello;
	}
	public void setCodiceModello(Integer codiceModello) {
		this.codiceModello = codiceModello;
	}

}
