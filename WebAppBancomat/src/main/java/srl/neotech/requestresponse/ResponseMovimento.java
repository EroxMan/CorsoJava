package srl.neotech.requestresponse;

import java.util.ArrayList;

import srl.neotech.model.MovimentoBancomat;

import com.fasterxml.jackson.annotation.JsonView;

public class ResponseMovimento {
	

	private ArrayList<MovimentoBancomat>movimentiSearchResponse=new ArrayList<MovimentoBancomat>();
	private Integer saldo;
	
	public ArrayList<MovimentoBancomat> getMovimentiSearchResponse() {
		return movimentiSearchResponse;
	}
	public void setMovimentiSearchResponse(ArrayList<MovimentoBancomat> movimentiSearchResponse) {
		this.movimentiSearchResponse = movimentiSearchResponse;
	}
	public Integer getSaldo() {
		return saldo;
	}
	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}


}
