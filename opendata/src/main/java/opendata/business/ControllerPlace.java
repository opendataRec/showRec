package opendata.business;



import java.util.List;

import opendata.persistence.DaoPlace;
import opendata.util.BusinessExcption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControllerPlace<T> {
	private @Autowired DaoPlace dao;

	public T loadPlace(String nome, Class<T> classe) {
		try{
		return dao.loadPlace(nome,classe);
		}catch(BusinessExcption e){
			throw e;
		}
	}

	public List<CtmgranderecifeLinhaparadatrajetoDado> loadTrajeto(String bairro) {
		try{
			return dao.loadTrajeto(bairro);
		}catch(BusinessExcption e){
			throw e;
		}
	}
		public List<CtmgranderecifeTarifalinhaempresaDado> loadTarifa() {
			try{
				return dao.loadTarifa();
			}catch(BusinessExcption e){
				throw e;
			}
		
	}

		public List<AgrAgremiacoescarn> getCarnaval(String bairro) {
			return this.dao.getCarnaval(bairro);
		}

		public List<BarBaresrecife> getBares(String bairro) {
			return this.dao.getBares(bairro);
		}

}
