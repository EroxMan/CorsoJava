package srl.neotech.requestresponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonView;

import srl.neotech.model.Aereo;

public class ResponseSearchAereo {


	private ArrayList<Aereo> aerei=new ArrayList<Aereo>();

	private String msg;
	
	private String code;
	
	
	public ArrayList<Aereo> getAerei() {
		return aerei;
	}

	public void setAerei(ArrayList<Aereo> aerei) {
		this.aerei = aerei;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	
	
	
	
}
