package srl.neotech.requestresponse;
import java.util.ArrayList;

import srl.neotech.model.Video;

public class ListaVideoResponse extends ResponseBase{
	
	ArrayList <Video> listaVideo=new ArrayList<Video>();

	public ArrayList<Video> getListaVideo() {
		return listaVideo;
	}

	public void setListaVideo(ArrayList<Video> listaVideo) {
		this.listaVideo = listaVideo;
	}
	

}
