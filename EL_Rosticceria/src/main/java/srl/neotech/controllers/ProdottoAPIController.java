package srl.neotech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.requestresponse.RequestAddProdotto;
import srl.neotech.requestresponse.ResponseBase;
import srl.neotech.services.ProdottoService;

@RestController
public class ProdottoAPIController {

	@Autowired
	ProdottoService prodottoService;

	@ResponseBody
	@PostMapping(value = "/api/addProdotto",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase addProdotto(@RequestBody RequestAddProdotto prodotto) {
		
		ResponseBase response=new ResponseBase();
		
		try {
			prodottoService.addProdotto(request.getProdotto());
			response.setCode("OK");
		} catch (Exception e) {
		  response.setCode("OK");
		  response.setDescr(e.getMessage());
		}
		
		
		return response;
        }
}