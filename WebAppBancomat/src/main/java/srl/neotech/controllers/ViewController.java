package srl.neotech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {

	
	@RequestMapping(value="/ajax", method = RequestMethod.GET)
	public String ajax() {
		return "ajax";
	}
	
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String bank() {
		return "home";
	}
	
	@RequestMapping(value="/versamento", method = RequestMethod.GET)
	public String vers() {
		return "versamento";
	}
	
	@RequestMapping(value="/prelievo", method = RequestMethod.GET)
	public String prel() {
		return "prelievo";
	}

	@RequestMapping(value="/listamovimenti", method = RequestMethod.GET)
	public String list() {
		return "listamovimenti";
	}
}

