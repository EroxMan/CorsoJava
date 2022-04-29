package srl.neotech.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.neotech.dao.ProdottoDAO;
import srl.neotech.model.Prodotto;


@Service
public class ProdottoService {

	@Autowired
	ProdottoDAO prodottoDAO;
	
	
	//Aggiungi prodotto ai dati
	public void addProdotto(Prodotto prodotto) {
		
		
		prodottoDAO.addProdotto(prodotto);
	}
	
}
