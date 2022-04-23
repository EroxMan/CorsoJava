package srl.neotech.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.Aereo;
import srl.neotech.requestresponse.RequestSearchAereo;
import srl.neotech.requestresponse.ResponseSearchAereo;

@RestController
public class APIController {

	
	@RequestMapping(value = "/api/hello")
	public String hello() {
		return "Ciaoooo!";
	}
	
	
	@ResponseBody
	@PostMapping(value = "/api/search",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseSearchAereo search(@RequestBody RequestSearchAereo request) {
		
		ResponseSearchAereo result = new ResponseSearchAereo();
		Aereo aereo=new Aereo();
		aereo.setId("alpha01");
		aereo.setNome("Boing747");
		result.getAerei().add(aereo);
		return result;
	
	}
	
}
