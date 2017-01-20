package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Basket;
import entities.User;

public class UserDaoImpl implements UserDao{
	
	@Override
	public void addUser(User user) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		factory.close();
		
	}

	@Override
	public void updateUser(User user) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.merge(user);
		em.getTransaction().commit();
		em.close();
		factory.close();
	}

	@Override
	public void deleteUser(User user) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.remove(user);
		em.getTransaction().commit();
		em.close();
		factory.close();
		
	}

	@Override
	public User findUserById(int id) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		User user = em.find(User.class, id);
		em.getTransaction().commit();
		em.close();
		factory.close();
		return user;
	}

	@Override
	public List<User> findAllUser() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		List<User> users = em.createQuery("from User").getResultList();
		em.close();
		factory.close();
		return users;
	}

	@Override
	public List<Basket> findBasketsByUserId(int id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		List<Basket> baskets = em.createQuery("select u from user u join u.basket b where b.id = :id", Basket.class)
				.setParameter("id", id)
				.getResultList();
		em.getTransaction().commit();
		em.close();
		factory.close();
		
		return baskets;
	}

	
}
