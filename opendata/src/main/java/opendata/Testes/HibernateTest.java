package opendata.Testes;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HibernateTest {
	public static void main(String[] args) {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("opendata");
			
			EntityManager manager = factory.createEntityManager();
			try {			
				EntityTransaction transaction = manager.getTransaction();
				transaction.begin();
			/*	try {
					Blog blog = manager.find(Blog.class, 1);
					Post post = new Post();
					post.setTitle("Post Fabuloso");
					post.setBody("Post Fabuloso");
					post.setCreationDate(new Date());
					
					blog.getPosts().add(post);
					
					manager.persist(post);
					manager.merge(blog);				
					transaction.commit();
				} catch (RuntimeException e) {
					try {
						transaction.rollback();
					} catch (RuntimeException nestedException) {}
					throw e;
				}		
			} finally {
				try {
					manager.close();
				} catch (RuntimeException e) {
					e.printStackTrace();
				}
			}	*/	
		}catch(RuntimeException e){throw e;}
	}

}
