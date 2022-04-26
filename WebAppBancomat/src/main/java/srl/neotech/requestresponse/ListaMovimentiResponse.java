package srl.neotech.requestresponse;
import java.util.ArrayList;
import srl.neotech.model.MovimentoBancomat;

public class ListaMovimentiResponse {



	ArrayList<MovimentoBancomat>listaMovimentiRestituiti=new ArrayList<MovimentoBancomat>();

	public ArrayList<MovimentoBancomat> getListaMovimentiRestituiti() {
		return listaMovimentiRestituiti;
	}

	public void setListaMovimentiRestituiti(ArrayList<MovimentoBancomat> listaMovimentiRestituiti) {
		this.listaMovimentiRestituiti = listaMovimentiRestituiti;
	}
}
