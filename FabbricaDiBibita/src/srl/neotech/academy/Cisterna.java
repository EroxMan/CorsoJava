package srl.neotech.academy;

public class Cisterna {

	private Integer thresold;
	private Integer content;
	private Integer evapDay;
	private Tipologia tipologia;   

	
	public Cisterna() {
		thresold=30;
	}
	public Integer getThresold() {
		return thresold;
	}

	public void setThresold(Integer thresold) {
		this.thresold = thresold;
	}

	public Integer getContent() {
		return content;
	}

	public void setContent(Integer content) {
		this.content = content;
	}

	public Integer getEvapDay() {
		return evapDay;
	}

	public void setEvapDay(Integer evapDay) {
		this.evapDay = evapDay;
	}
	public Tipologia getTipologia() {
		return tipologia;
	}
	public void setTipologia(Tipologia tipologia) {
		this.tipologia = tipologia;
	}



	@Override
	public String toString() {
		return this.getTipologia()+"--"+this.getContent()+"--"+this.getEvapDay()+"--"+this.getThresold();
	}
}
