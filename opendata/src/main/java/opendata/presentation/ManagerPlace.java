package opendata.presentation;

import java.util.ArrayList;
import java.util.List;

import opendata.business.AgrAgremiacoescarn;
import opendata.business.AuxBus;
import opendata.business.BarBaresrecife;
import opendata.business.ControllerCategorias;
import opendata.business.ControllerPlace;
import opendata.business.CtmgranderecifeLinhaparadatrajetoDado;
import opendata.business.CtmgranderecifeRuasparadasonibusDado;
import opendata.business.CtmgranderecifeTarifalinhaempresaDado;
import opendata.business.Hoteis;
import opendata.business.MerMercadospublicos;
import opendata.business.MusMuseus;
import opendata.business.PonPontes;
import opendata.business.ShoShopping;
import opendata.business.TeaTeatros;
import opendata.util.BusinessExcption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(WebApplicationContext.SCOPE_SESSION)
public class ManagerPlace {
	private @Autowired ControllerPlace controller;
	Object dados;
	Boolean showTarifaOnibus;
	CtmgranderecifeLinhaparadatrajetoDado trajeto;
	List<AgrAgremiacoescarn> agremiacoes;
	public List<AgrAgremiacoescarn> getAgremiacoes() {
		return agremiacoes;
	}
	public void setAgremiacoes(List<AgrAgremiacoescarn> agremiacoes) {
		this.agremiacoes = agremiacoes;
	}
	public List<BarBaresrecife> getBares() {
		return bares;
	}
	public void setBares(List<BarBaresrecife> bares) {
		this.bares = bares;
	}


	List<BarBaresrecife> bares;
	public CtmgranderecifeLinhaparadatrajetoDado getTrajeto() {
		return trajeto;
	}
	public void setTrajeto(CtmgranderecifeLinhaparadatrajetoDado trajeto) {
		this.trajeto = trajeto;
	}
	public CtmgranderecifeTarifalinhaempresaDado getTarifa() {
		return tarifa;
	}
	public void setTarifa(CtmgranderecifeTarifalinhaempresaDado tarifa) {
		this.tarifa = tarifa;
	}
	
	
	CtmgranderecifeTarifalinhaempresaDado tarifa;
	public List<AuxBus> getInfoBus() {
		return infoBus;
	}
	public void setInfoBus(List<AuxBus> infoBus) {
		this.infoBus = infoBus;
	}


	List<AuxBus> infoBus;
	public Boolean getShowTarifaOnibus() {
		return showTarifaOnibus;
	}
	public void setShowTarifaOnibus(Boolean showTarifaOnibus) {
		this.showTarifaOnibus = showTarifaOnibus;
	}
	public Object getDados() {
		return dados;
	}
	public void setDados(Object dados) {
		this.dados = dados;
	}
	String categoria;
	
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	String nome;
	
	public ManagerPlace(){
		this.showTarifaOnibus = new Boolean(false);
		this.infoBus = new ArrayList<>();
		this.tarifa = new CtmgranderecifeTarifalinhaempresaDado();
		this.trajeto = new CtmgranderecifeLinhaparadatrajetoDado();
	}
	public void infPlace(String nome,String categoria){
		if("Museus".equals(categoria)){
			this.dados = new MusMuseus();
			 dados = controller.loadPlace(nome,MusMuseus.class);
		}
		if("Teatros".equals(categoria)){
			this.dados = new TeaTeatros();
			 dados = controller.loadPlace(nome,TeaTeatros.class);
		}
		if("Shopping".equals(categoria)){
			this.dados = new ShoShopping();
			 dados = controller.loadPlace(nome,ShoShopping.class);
		}
		if("Mercados".equals(categoria)){
			this.dados = new MerMercadospublicos();
			 dados = controller.loadPlace(nome,MerMercadospublicos.class);
		}
		if("Hoteis".equals(categoria)){
			this.dados = new Hoteis();
			 dados = controller.loadPlace(nome,Hoteis.class);
		}
		if("Pontes".equals(categoria)){
			this.dados = new PonPontes();
			 dados = controller.loadPlace(nome,PonPontes.class);
		}
		
	}
	public  void inicializa(){
		this.infPlace(this.nome, this.categoria);
	} 
	
	public void showOnibus(){
	
		if(this.showTarifaOnibus){
			this.setShowTarifaOnibus(false);}
			else
				this.setShowTarifaOnibus(true); 
		
	}
	public void selectLinhaParada(String bairro){
		try{
			List<CtmgranderecifeLinhaparadatrajetoDado> trajetos = new ArrayList<>();
			List<CtmgranderecifeTarifalinhaempresaDado> tarifas = new ArrayList<>();
			trajetos = controller.loadTrajeto(bairro);
			tarifas = controller.loadTarifa();
			for(CtmgranderecifeLinhaparadatrajetoDado tra : trajetos){
				for(CtmgranderecifeTarifalinhaempresaDado tar: tarifas){
					if(tra.getId().getLatitude().equals(tar.getId().getNomeLinha())){
						AuxBus bus = new AuxBus();
						bus.setTarifa(tar);
						bus.setTrajeto(tra);
						this.infoBus.add(bus);
					}
					
				}
			}
		}catch(BusinessExcption e){
			throw e;
			
		}
	}
	public double getDistancia(double latitude, double longitude, double latitudePto, double longitudePto){  
        double dlon, dlat, a, distancia;  
        dlon = longitudePto - longitude;  
        dlat = latitudePto - latitude;  
        a = Math.pow(Math.sin(dlat/2),2) + Math.cos(latitude) * Math.cos(latitudePto) * Math.pow(Math.sin(dlon/2),2);  
        distancia = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));  
        return 6378140 * distancia; /* 6378140 is the radius of the Earth in meters*/  
    } 
	
	public void distanciaPoutros(){
		
	}
	public  void getCarnaval(String bairro){
		this.agremiacoes = controller.getCarnaval(bairro);
	}
	public void gerBares(String bairro){
		this.bares = controller.getBares(bairro);
	}

}
