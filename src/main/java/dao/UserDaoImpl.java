package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
		Query query = em.createQuery("DELETE FROM User u where u.id=:id").setParameter("id", user.getId());
		query.executeUpdate();
		em.getTransaction().commit();
		em.close();
		factory.close();
		System.out.println("sucess");
		
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
	public List<Basket> findBasketsByUserId(User user) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		List<Basket> baskets = em.createQuery("select b from User u join u.basket b where u.id = :id", Basket.class)
				.setParameter("id", user.getId())
				.getResultList();
//		em.getTransaction().commit();
		em.close();
		factory.close();
		
		return baskets;
	}

	
}
