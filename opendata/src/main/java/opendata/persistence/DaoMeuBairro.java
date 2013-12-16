package opendata.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import opendata.business.AgrAgremiacoescarn;
import opendata.business.FeiFeiraslivres;
import opendata.business.Hoteis;
import opendata.business.MerMercadospublicos;
import opendata.business.MusMuseus;
import opendata.business.PonPontes;
import opendata.business.ShoShopping;
import opendata.business.TeaTeatros;

import org.springframework.stereotype.Component;

@Component
public class DaoMeuBairro {
    
	private @PersistenceUnit EntityManagerFactory factory;
	private @PersistenceContext EntityManager manager;
	public List<Integer> pegaNum(List<Integer> numCategorias, String bairro) {
		String consult = " select count(a) from "+MerMercadospublicos.class.getName()+" a where a.id.bairro = :bairro";
		TypedQuery<Integer> query = manager.createQuery(consult,Integer.class);
		query.setParameter("bairro",bairro);

		numCategorias.add(query.getFirstResult()); 
		
		String consult1 = " select count(a) from "+TeaTeatros.class.getName()+" a where a.id.bairro = :bairro";
		TypedQuery<Integer> query1 = manager.createQuery(consult1,Integer.class);
		query1.setParameter("bairro",bairro);

		numCategorias.add(query1.getFirstResult());
		
		String consult2 = " select count(a) from "+FeiFeiraslivres.class.getName()+" a where a.id.bairro = :bairro";
		TypedQuery<Integer> query2 = manager.createQuery(consult2,Integer.class);
		query2.setParameter("bairro",bairro);

		numCategorias.add(query2.getFirstResult());
		
		String consult3 = " select count(a) from "+ShoShopping.class.getName()+" a where a.id.bairro = :bairro";
		TypedQuery<Integer> query3 = manager.createQuery(consult3,Integer.class);
		query3.setParameter("bairro",bairro);

		numCategorias.add(query3.getFirstResult());
		
		String consult4 = " select count(a) from "+Hoteis.class.getName()+" a where a.id.bairro = :bairro";
		TypedQuery<Integer> query4 = manager.createQuery(consult4,Integer.class);
		query3.setParameter("bairro",bairro);

		numCategorias.add(query4.getFirstResult());
		
		String consult5 = " select count(a) from "+MusMuseus.class.getName()+" a where a.id.bairro = :bairro";
		TypedQuery<Integer> query5 = manager.createQuery(consult5,Integer.class);
		query3.setParameter("bairro",bairro);

		numCategorias.add(query5.getFirstResult());
		
		String consult6 = " select count(a) from "+PonPontes.class.getName()+" a where a.id.bairro = :bairro";
		TypedQuery<Integer> query6 = manager.createQuery(consult6,Integer.class);
		query6.setParameter("bairro",bairro);

		numCategorias.add(query6.getFirstResult());
		
		return numCategorias;
		
	}
	public List<String> getBairros() {
		String consult = " select distinct(a.id.bairro from) "+PonPontes.class.getName()+" a where a.id.bairro = :bairro";
		TypedQuery<String> query = manager.createQuery(consult,String.class);
		
         return null;
		//query.getFirstResult());
	}

}
