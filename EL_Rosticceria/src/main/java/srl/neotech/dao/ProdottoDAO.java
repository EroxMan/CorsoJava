package srl.neotech.dao;

import org.springframework.stereotype.Component;

import srl.neotech.model.DatiRosticceria;
import srl.neotech.model.Prodotto;

@Component
	public class prodottoDAO {
		
		public void addProdotto(Prodotto prodotto) {
			
		DatiRosticceria.getInstance().getListino().add(prodotto);
		}
	}
	

