package opendata.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import opendata.business.AgrAgremiacoescarn;
import opendata.business.AuxBus;
import opendata.business.BarBaresrecife;
import opendata.business.CtmgranderecifeLinhaparadatrajetoDado;
import opendata.business.CtmgranderecifeTarifalinhaempresaDado;
import opendata.business.MusMuseus;

import org.springframework.stereotype.Component;

@Component
public class DaoPlace {
	private @PersistenceUnit EntityManagerFactory factory;
	private @PersistenceContext EntityManager manager;
	
	public  <T>  T loadPlace(String nome, Class<T> classe) {
		System.out.println(nome);
		if("Mercado de S√£o Jos√©".equals(nome)){
			nome = "Mercado de S„o JosÈ";
		}
		if("Museu de Arte Moderna Alo√≠sio Magalh√£es (Mamam)".equals(nome)){
			nome = "Museu de Arte Moderna AloÌsio Magalh„es";
		}
		String consult = "select m from "+classe.getName()+" m where m.id.nome like :para";
		TypedQuery<T> query = manager.createQuery(consult, classe);
		query.setParameter("para", "%"+nome+"%");
		List<T> result = query.getResultList();
	    return result.get(0);
	}

	public List<CtmgranderecifeLinhaparadatrajetoDado> loadTrajeto(String bairro) {
		String consult = " select c from "+CtmgranderecifeLinhaparadatrajetoDado.class.getName()+" c where c.id.codigoParada = :bairro";
		TypedQuery<CtmgranderecifeLinhaparadatrajetoDado> query = manager.createQuery(consult,CtmgranderecifeLinhaparadatrajetoDado.class );
		query.setParameter("bairro", bairro);
		return query.getResultList();
	}

	public List<CtmgranderecifeTarifalinhaempresaDado> loadTarifa() {
		String consult = " select l from "+CtmgranderecifeTarifalinhaempresaDado.class.getName()+" l";
		TypedQuery<CtmgranderecifeTarifalinhaempresaDado> query = manager.createQuery(consult,CtmgranderecifeTarifalinhaempresaDado.class );

		return query.getResultList();
	}

	public List<AgrAgremiacoescarn> getCarnaval(String bairro) {
		String consult = " select a from "+AgrAgremiacoescarn.class.getName()+" a where a.id.bairro = :bairro";
		TypedQuery<AgrAgremiacoescarn> query = manager.createQuery(consult,AgrAgremiacoescarn.class );
		query.setParameter("bairro",bairro);

		return query.getResultList();
	}

	public List<BarBaresrecife> getBares(String bairro) {
		String consult = " select a from "+BarBaresrecife.class.getName()+" a where a.id.endereco like :bairro";
		TypedQuery<BarBaresrecife> query = manager.createQuery(consult,BarBaresrecife.class );
		query.setParameter("bairro","%"+bairro+"%");

		return query.getResultList();
	}
	
}
