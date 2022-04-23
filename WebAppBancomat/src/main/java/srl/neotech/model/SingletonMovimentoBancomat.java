package srl.neotech.model;

	import java.util.ArrayList;

	import org.apache.logging.log4j.CloseableThreadContext.Instance;

import srl.neotech.academy.MovimentoBancomat;

	public class SingletonMovimentoBancomat {

		
		private static SingletonMovimentoBancomat instance=null;
		
		ArrayList<MovimentoBancomat>listaMovimenti=new ArrayList<MovimentoBancomat>();

		public ArrayList<MovimentoBancomat> getListaMovimenti() {
			return listaMovimenti;
		}

		public void setListaMovimenti(ArrayList<MovimentoBancomat> listaMovimenti) {
			this.listaMovimenti = listaMovimenti;
		}
		
		
		public static SingletonMovimentoBancomat getInstance() {
			if(instance == null) {
				instance = new SingletonMovimentoBancomat();
			}
			return instance;
		}
			
	}

