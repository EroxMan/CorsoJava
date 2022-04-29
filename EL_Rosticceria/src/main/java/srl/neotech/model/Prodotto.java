package srl.neotech.model;

public class Prodotto {
	
	private String id;
	private Tipologia tipologia;
	private String nome;
	private Double prezzoUnitario;
	private Integer minutiPreparazione;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Tipologia getTipologia() {
		return tipologia;
	}
	public void setTipologia(Tipologia tipologia) {
		this.tipologia = tipologia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPrezzoUnitario() {
		return prezzoUnitario;
	}
	public void setPrezzoUnitario(Double prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
	}
	public Integer getMinutiPreparazione() {
		return minutiPreparazione;
	}
	public void setMinutiPreparazione(Integer minutiPreparazione) {
		this.minutiPreparazione = minutiPreparazione;
	}
	

}
