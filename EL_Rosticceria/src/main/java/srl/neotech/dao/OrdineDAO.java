package srl.neotech.dao;

import org.springframework.stereotype.Component;

import srl.neotech.model.DatiRosticceria;
import srl.neotech.model.Ordine;

@Component
public class OrdineDAO {
	
	public void addOrdine(Ordine ordine) {
		
		DatiRosticceria.getInstance().getOrdini().add(ordine);
		}

}
