package opendata.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import opendata.business.MusMuseus;
import opendata.business.TeaTeatros;

import org.springframework.stereotype.Component;

@Component
public class DaoCategorias {
	private @PersistenceUnit EntityManagerFactory factory;
	private @PersistenceContext EntityManager manager;
	
	
   public <T> List<T> loadData(Class<T> classe){
	   String consult = "select m from "+classe.getName()+" m";
		TypedQuery<T> query = manager.createQuery(consult,classe);
		
		return query.getResultList();
	
	   }
	
	

	

}
