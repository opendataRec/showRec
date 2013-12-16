package opendata.business;

import java.util.List;

import opendata.persistence.DaoCategorias;
import opendata.util.BusinessExcption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControllerCategorias {
private @Autowired DaoCategorias dao;
public ControllerCategorias(DaoCategorias dao){
	this.dao = dao;
}
public ControllerCategorias(){
	}
public <T> List<T> loadDatas(Class<T> classe){
	try{
	    return dao.loadData(classe);
	}catch(BusinessExcption e){
		throw e;
	}
  }
}
