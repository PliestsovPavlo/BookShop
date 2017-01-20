package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Basket;

public class BasketDaoImpl implements BasketDao{

	@Override
	public void addBasket(Basket basket) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(basket);
		em.getTransaction().commit();
		em.close();
		factory.close();		
	}

	@Override
	public void updateBasket(Basket basket) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.merge(basket);
		em.getTransaction().commit();
		em.close();
		factory.close();		
	}

	@Override
	public void deleteBasket(Basket basket) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.remove(basket);
		em.getTransaction().commit();
		em.close();
		factory.close();		
	}

	@Override
	public Basket findBasketById(int id) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
			Basket basket = em.find(Basket.class, id);
		em.getTransaction().commit();
		em.close();
		factory.close();		
		return basket;
	}

	@Override
	public List<Basket> findAllBaskets() {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
			List<Basket> baskets = em.createQuery("from Basket").getResultList();
		em.getTransaction().commit();
		em.close();
		factory.close();
		
		return baskets;
	}

}
