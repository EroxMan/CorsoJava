package srl.neotech.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.requestresponse.RequestAddProdotto;
import srl.neotech.requestresponse.ResponseBase;

@RestController
public class ProdottoAPIController {


	@ResponseBody
	@PostMapping(value = "/api/addProdotto",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseBase addProdotto(@RequestBody RequestAddProdotto prodotto) {
		
		ResponseBase response=new ResponseBase();
		
		
		
		return response;
        }
}