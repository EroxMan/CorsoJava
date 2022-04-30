package srl.neotech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.OrdineDAO;
import srl.neotech.model.Ordine;

@Service
public class OrdineService {
	
	@Autowired
	OrdineDAO ordineDAO;
	
	
	//Aggiungi prodotto ai dati
	public void addProdotto(Ordine ordine) {
		
		
		ordineDAO.addOrdine(ordine);
	}
	

}
