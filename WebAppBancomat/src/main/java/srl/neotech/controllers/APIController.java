package srl.neotech.controllers;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import srl.neotech.model.MovimentoBancomat;
import srl.neotech.model.SingletonMovimentoBancomat;
import srl.neotech.model.TipologiaMovimento;
import srl.neotech.requestresponse.RequestMovimento;
import srl.neotech.requestresponse.ResponseMovimento;


@RestController
public class APIController {

	

	
	
	@ResponseBody
	@PostMapping(value = "/api/movimento_add", produces = MediaType.APPLICATION_JSON_VALUE)
	public void add(@RequestBody RequestMovimento request) {
		
		LocalDateTime oggettoData= LocalDateTime.now();
	    DateTimeFormatter formattaOggetto=DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
	    String dataFormattata = oggettoData.format(formattaOggetto);
		
		request.getMovimentazione().setId(UUID.randomUUID().toString());
		request.getMovimentazione().setDataEora(dataFormattata);
	   
		
	    SingletonMovimentoBancomat.getInstance().getListaMovimenti().add(request.getMovimentazione());

	}
	
	@ResponseBody
	@GetMapping(value ="/api/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseMovimento delete (@PathVariable("id")String idMovimento) {
		ResponseMovimento response= new ResponseMovimento();
		
		
			SingletonMovimentoBancomat.getInstance().getListaMovimenti().removeIf(movimentazione->movimentazione.getId().equals(idMovimento));
			response.getMovimentiSearchResponse();
						
		
		
		return response;
	}
	
	
}
