package opendata.presentation;

import java.util.ArrayList;
import java.util.List;

import opendata.business.ControllerMeuBairro;

import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(WebApplicationContext.SCOPE_SESSION)
public class ManagerMeuBairro {
	private List<String> bairros;
	public List<String> getBairros() {
		return bairros;
	}
	public void setBairros(List<String> bairros) {
		this.bairros = bairros;
	}
	private String bairro;
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	private @Autowired ControllerMeuBairro controller;
	private List<String> categorias;
	public List<String> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<String> categorias) {
		this.categorias = categorias;
	}
	public List<Integer> getNumCategorias() {
		return numCategorias;
	}
	public void setNumCategorias(List<Integer> numCategorias) {
		this.numCategorias = numCategorias;
	}
	private List<Integer> numCategorias;
	 private CartesianChartModel modelo;
	 private ChartSeries serieGrafico;
	public CartesianChartModel getModelo() {
		return modelo;
	}
	public void setModelo(CartesianChartModel modelo) {
		this.modelo = modelo;
	}
	public ChartSeries getSerieGrafico() {
		return serieGrafico;
	}
	public void setSerieGrafico(ChartSeries serieGrafico) {
		this.serieGrafico = serieGrafico;
	}
	public void montaMapa(List<String> cat, List<Integer> catN){
		this.modelo = new CartesianChartModel();
		this.serieGrafico = new ChartSeries("Abertura");
		 for(int i= 0; i< cat.size(); ++i){
			 for(int j=0; j< catN.size(); ++j){
				 serieGrafico.set(cat.get(i), catN.get(j));
			 }
		 }
	    
	   this.modelo.addSeries(serieGrafico);
	}
	public void pegaBairro(){
		this.categorias = new ArrayList<>();
		this.categorias.add("Mercados Públicos");
		this.categorias.add("Teatros");
		this.categorias.add("Feiras Livres");
		this.categorias.add("Shoppings");
		this.categorias.add("Hoteis");
		this.categorias.add("Museus");
		this.categorias.add("Pontes");
		
		this.numCategorias = new ArrayList<>();
		
	this.numCategorias = this.controller.pegaNum(numCategorias,this.bairro);
	}
	
	public void initializeBairro(){
		this.bairros = new ArrayList<>();
		
		this.bairros = this.controller.getBairros();
	}
}
