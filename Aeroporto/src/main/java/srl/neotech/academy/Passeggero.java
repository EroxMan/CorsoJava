package srl.neotech.academy;

public class Passeggero {
	
	private Integer idUnivocoPasseggero;
	private Sesso sesso;
	private Integer età;
	private ClasseViaggiatore classeViaggiatore;
	private StatoPasseggero statoPasseggero;
	private Boolean haFiore;
	private Boolean haChampagne;
	private Boolean haGiornale;
	private Boolean haBagagli;
	
	public Integer getIdUnivoco() {
		return idUnivocoPasseggero;
	}
	public void setIdUnivoco(Integer idUnivoco) {
		this.idUnivocoPasseggero = idUnivoco;
	}
	public Sesso getSesso() {
		return sesso;
	}
	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}
	public Integer getEtà() {
		return età;
	}
	public void setEtà(Integer età) {
		this.età = età;
	}
	public ClasseViaggiatore getClasseViaggiatore() {
		return classeViaggiatore;
	}
	public void setClasseViaggiatore(ClasseViaggiatore classeViaggiatore) {
		this.classeViaggiatore = classeViaggiatore;
	}
	public StatoPasseggero getStatoPasseggero() {
		return statoPasseggero;
	}
	public void setStatoPasseggero(StatoPasseggero statoPasseggero) {
		this.statoPasseggero = statoPasseggero;
	}
	public Boolean getHaFiore() {
		return haFiore;
	}
	public void setHaFiore(Boolean haFiore) {
		this.haFiore = haFiore;
	}
	public Boolean getHaChampagne() {
		return haChampagne;
	}
	public void setHaChampagne(Boolean haChampagne) {
		this.haChampagne = haChampagne;
	}
	public Boolean getHaGiornale() {
		return haGiornale;
	}
	public void setHaGiornale(Boolean haGiornale) {
		this.haGiornale = haGiornale;
	}
	public Boolean getHaBagagli() {
		return haBagagli;
	}
	public void setHaBagagli(Boolean haBagagli) {
		this.haBagagli = haBagagli;
	}
	@Override
	public String toString(){
	return "[ID]:"+this.getIdUnivoco()+"[SESSO PASSEGGERO]:"+this.getSesso()+"[ETÀ]:"+this.getEtà()+"[CLASSE PASSEGGERO]:"+
	this.getClasseViaggiatore()+"[HA BAGAGLI (T/F)]:"+this.getHaBagagli()+"[HA CHAMPAGNE (T/F)]:"+this.getHaChampagne()+"[HA FIORE (T/F)]:"
	+this.getHaFiore()+"[HA GIORNALE (T/F)]:"+this.getHaGiornale()+"[STATO PASSEGGERO]:"+this.getStatoPasseggero();
	}
	
}
