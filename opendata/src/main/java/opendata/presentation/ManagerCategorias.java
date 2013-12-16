package opendata.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.context.FacesContext;


import opendata.business.ControllerCategorias;
import opendata.business.FeiFeiraslivres;
import opendata.business.Hoteis;
import opendata.business.MerMercadospublicos;
import opendata.business.MusMuseus;
import opendata.business.PonPontes;
import opendata.business.ShoShopping;
import opendata.business.TeaTeatros;


import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;


@Component
@Scope(WebApplicationContext.SCOPE_SESSION)
public class ManagerCategorias {
	private @Autowired ControllerCategorias controller;
	private List<Object> datas;
	String categoria;
	Boolean showMap;
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Boolean getShowMap() {
		return showMap;
	}
	public void setShowMap(Boolean showMap) {
		this.showMap = showMap;
	}
	public List<Object> getDatas() {
		return datas;
	}
	public void setDatas(List<Object> datas) {
		this.datas = datas;
	}
	private boolean showCount;
	private  Integer countTela;
	 public Integer getCountTela() {
		return countTela;
	}
	public void setCountTela(Integer countTela) {
		this.countTela = countTela;
	}
	public boolean isShowCount() {
		return showCount;
	}
	public void setShowCount(boolean showCount) {
		this.showCount = showCount;
	}
	
	public MapModel getSimpleModel() {
		return simpleModel;
	}
	public void setSimpleModel(MapModel simpleModel) {
		this.simpleModel = simpleModel;
	}
	private MapModel simpleModel;
	
	public Marker getMaker() {
		return maker;
	}
	public void setMaker(Marker maker) {
		this.maker = maker;
	}
	public Marker maker;
	
	public ManagerCategorias(){
		
		this.datas = new ArrayList<>();
		String categoria = new String();
		this.showMap = new Boolean(false);
	}
	public void loadDatas(Class classe){
	    this.datas =	controller.loadDatas(classe);
	    
	    
	    }
	
	
	public void geo(){
		
	}
	
	public void markerOnMap(String categoria){
		this.showCount=true;
		this.setCountTela(0);
		this.categoria = categoria;
		
		if("Museus".equals(categoria)){
			
			this.loadDatas(MusMuseus.class);
			this.simpleModel = new DefaultMapModel();
			for(Object museu1 : this.datas){
				if(museu1 != null){
					this.countTela++;
				   LatLng coord1 = new LatLng(Double.parseDouble(((MusMuseus) museu1).getId().getLatitude().replace(",", ".")),Double.parseDouble(((MusMuseus) museu1).getId().getLongitude().replace(",", ".")));
				  this.simpleModel.addOverlay(new Marker(coord1, ((MusMuseus) museu1).getId().getNome()));
				}
		  }
		}
		
        if("Teatros".equals(categoria)){
        	this.loadDatas(TeaTeatros.class);
			this.simpleModel = new DefaultMapModel();
			for(Object data :  this.datas){
				if(data != null){
					this.countTela++;
				   LatLng coord1 = new LatLng(Double.parseDouble(((TeaTeatros) data).getId().getLatitude().replace(",", ".")),Double.parseDouble(((TeaTeatros) data).getId().getLongitude().replace(",", ".")));
				  this.simpleModel.addOverlay(new Marker(coord1, ((TeaTeatros) data).getId().getNome()));
				}
		  }
        }
        if("Shopping".equals(categoria)){
        	this.loadDatas(ShoShopping.class);
			this.simpleModel = new DefaultMapModel();
			for(Object museu1 : this.datas){
				if(museu1 != null){
					this.countTela++;
				   LatLng coord1 = new LatLng(Double.parseDouble(((ShoShopping) museu1).getId().getLatitude().replace(",", ".")),Double.parseDouble(((ShoShopping) museu1).getId().getLongitude().replace(",", ".")));
				  this.simpleModel.addOverlay(new Marker(coord1, ((ShoShopping) museu1).getId().getNome()));
				}
		  }
			
		}
        
        if("Mercados".equals(categoria)){
        	this.loadDatas(MerMercadospublicos.class);
			this.simpleModel = new DefaultMapModel();
			for(Object museu1 : this.datas){
				if(museu1 != null){
					this.countTela++;
				   LatLng coord1 = new LatLng(Double.parseDouble(((MerMercadospublicos) museu1).getId().getLatitude().replace(",", ".")),Double.parseDouble(((MerMercadospublicos) museu1).getId().getLongitude().replace(",", ".")));
				  this.simpleModel.addOverlay(new Marker(coord1, ((MerMercadospublicos) museu1).getId().getNome()));
				}
		  }
		}
       if("Feiras".equals(categoria)){
    	   this.loadDatas(FeiFeiraslivres.class);
			this.simpleModel = new DefaultMapModel();
			for(Object museu1 : this.datas){
				if(museu1 != null){
					this.countTela++;
				   LatLng coord1 = new LatLng(Double.parseDouble(((FeiFeiraslivres) museu1).getId().getLatitude().replace(",", ".")),Double.parseDouble(((FeiFeiraslivres) museu1).getId().getLongitude().replace(",", ".")));
				  this.simpleModel.addOverlay(new Marker(coord1, ((FeiFeiraslivres) museu1).getId().getNome()));
				}
		  }
		}
       if("Hoteis".equals(categoria)){
    	   System.out.println("Entrou");
    	   this.loadDatas(Hoteis.class);
    	   System.out.println("Entrou 1");
			this.simpleModel = new DefaultMapModel();
			System.out.println("Entrou 2");
			for(Object museu1 : this.datas){
				if(museu1 != null){
					this.countTela++;
					
						LatLng coord1 = new LatLng(Double.parseDouble(((Hoteis) museu1).getId().getLatitude().replace(",", ".")),Double.parseDouble(((Hoteis) museu1).getId().getLongitude().replace(",", ".")));
						  this.simpleModel.addOverlay(new Marker(coord1, ((Hoteis) museu1).getId().getNome()));
					
				   
				}
		  }
		}
       if("Pontes".equals(categoria)){
    	  
    	   this.loadDatas(PonPontes.class);
			this.simpleModel = new DefaultMapModel();
			for(Object museu1 : this.datas){
				if(museu1 != null){
					this.countTela++;
				   LatLng coord1 = new LatLng(Double.parseDouble(((PonPontes) museu1).getId().getLatitude().replace(",", ".")),Double.parseDouble(((PonPontes) museu1).getId().getLongitude().replace(",", ".")));
				  this.simpleModel.addOverlay(new Marker(coord1, ((PonPontes) museu1).getId().getNome()));
				}
		  }
		}
     }
	
	public String onMakerSelected(OverlaySelectEvent event){
		Marker	marker = (Marker) event.getOverlay(); 
		try {  
            try {
				FacesContext.getCurrentInstance().getExternalContext().redirect("/opendata/faces/opendata/util/place.xhtml?categoria="+this.categoria+"&nome="+marker.getTitle());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		
		
	}catch(RuntimeException e){
		
	}
	
		return "";
  }
	public String callBairro(){
		return "place";
	}
	
	public void location(){
		
	}
	public void chanceMap(){
		this.setShowMap(!this.showMap);
		}
	
	
}
