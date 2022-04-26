package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import srl.neotech.model.MovimentoBancomat;
import srl.neotech.model.SingletonMovimentoBancomat;
import srl.neotech.model.TipologiaMovimento;
import srl.neotech.requestresponse.RequestEliminaMovimento;
import srl.neotech.requestresponse.ListaMovimentiResponse;



@Controller
public class ViewController {

	@RequestMapping(value="/prova_ajax", method = RequestMethod.GET)
	public String ajax() {
		return "provaAjaxBancomat";
	}
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String bank() {
		return "home";
	}
	
	@RequestMapping(value="/vers", method = RequestMethod.GET)
	public String vers() {
		
		return "versamento";
	}
	
	@RequestMapping(value="/prel", method = RequestMethod.GET)
	public String prel() {
		return "prelievo";
	}

		

	
	@RequestMapping(value="/elimina-movimento", method = RequestMethod.GET)
	public String eliminaMovimento(@ModelAttribute RequestEliminaMovimento movimentoDaEliminare, Model model) {
		SingletonMovimentoBancomat.getInstance().getListaMovimenti().removeIf(movimento->movimento.getId().equals(movimentoDaEliminare.getId()));
		ListaMovimentiResponse response=new ListaMovimentiResponse();
		response.setListaMovimentiRestituiti(SingletonMovimentoBancomat.getInstance().getListaMovimenti());
		model.addAttribute("moveWay", response);
		return "lista_movimenti";
	}
	
	
	
	@RequestMapping(value="/listamovimenti", method = RequestMethod.GET)
	public String listamovimenti(Model model) {
		ListaMovimentiResponse response=new ListaMovimentiResponse();
		response.setListaMovimentiRestituiti(SingletonMovimentoBancomat.getInstance().getListaMovimenti());

		Integer valoreSaldo= new Integer(0);
		for(MovimentoBancomat mov: SingletonMovimentoBancomat.getInstance().getListaMovimenti()) {
			if(mov.getOperazione().equals(TipologiaMovimento.VERSAMENTO)) valoreSaldo=valoreSaldo+(mov.getQuantita()*mov.getTaglio());
			 if( mov.getOperazione().equals(TipologiaMovimento.PRELIEVO )) {
			    	if(mov.getAltroImporto().intValue()>0) {
			    		valoreSaldo=valoreSaldo-mov.getAltroImporto();
			    	}else {
			    	valoreSaldo=valoreSaldo-(mov.getQuantita()*mov.getTaglio());
			    	}
			    }
		}
		
		model.addAttribute("saldo", valoreSaldo);
		model.addAttribute("moveWay", response);
		return "lista_movimenti";
	}

}

