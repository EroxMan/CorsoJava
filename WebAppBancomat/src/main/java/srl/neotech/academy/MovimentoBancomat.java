package srl.neotech.academy;

public class MovimentoBancomat {
		
		private String nome;
		private String id;
		private String dataEora;
		private TipologiaMovimenti operazione;
		private Integer taglio;
		private Integer quantita;
		private Integer totale;
		private Integer altroImporto;
		private Integer conto;
		private Integer saldo;
		
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		
		
		
		public String getDataEora() {
			return dataEora;
		}
		public void setDataEora(String dataEora) {
			this.dataEora = dataEora;
		}
		
		
		
		
		public Integer getSaldo() {
			return saldo;
		}
		public void setSaldo(Integer saldo) {
			this.saldo = saldo;
		}
		public Integer getConto() {
			return conto;
		}
		public void setConto(Integer conto) {
			this.conto = conto;
		}

		public TipologiaMovimenti getOperazione() {
			return operazione;
		}
		public void setOperazione(TipologiaMovimenti operazione) {
			this.operazione = operazione;
		}
		public String getNome() {
			return nome;
		}
		public void setNominativo(String nome) {
			this.nome = nome;
		}
		public Integer getTaglio() {
			return taglio;
		}
		public void setTaglio(Integer taglio) {
			this.taglio = taglio;
		}
		public Integer getQuantita() {
			return quantita;
		}
		public void setQuantita(Integer quantita) {
			this.quantita = quantita;
		}
		public Integer getTotale() {
			return totale;
		}
		public void setTotale(Integer totale) {
			this.totale = totale;
		}
		public Integer getAltroImporto() {
			return altroImporto;
		}
		public void setAltroImporto(Integer altroImporto) {
			this.altroImporto = altroImporto;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
        public boolean equals(MovimentoBancomat obj) {
    	if(obj == null) return false;
	    if(obj == this) return true;
     	if(!(obj instanceof MovimentoBancomat)) return false;
    	MovimentoBancomat o =(MovimentoBancomat) obj;
    	return o.id == this.id;
	
}
		

	}

