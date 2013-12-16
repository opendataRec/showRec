package opendata.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import opendata.persistence.DaoMeuBairro;
import opendata.util.BusinessExcption;

@Component
public class ControllerMeuBairro {
   private @Autowired DaoMeuBairro dao;
	public List<Integer> pegaNum(List<Integer> numCategorias,String bairro) {
	   try{
		  return this.dao.pegaNum(numCategorias,bairro);
	   }catch(BusinessExcption e){
		   throw e;
	   }
		
	}
	public List<String> getBairros() {
		
		return this.dao.getBairros();
	}

}
