package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Category;

public class CategoryDaoImpl implements CategoryDao{

	@Override
	public void addCategory(Category category) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(category);
		em.getTransaction().commit();
		em.close();
		factory.close();		
	}

	@Override
	public void updateCategory(Category category) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.merge(category);
		em.getTransaction().commit();
		em.close();
		factory.close();			
	}

	@Override
	public void deleteCategory(Category category) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.remove(category);
		em.getTransaction().commit();
		em.close();
		factory.close();			
	}

	@Override
	public Category findCategoryById(int id) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Category category = em.find(Category.class, id);
		em.getTransaction().commit();
		em.close();
		factory.close();	
		
		return category;
	}

	@Override
	public List<Category> findAllCategories() {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		List<Category>categories = em.createQuery("from Category").getResultList();
		em.getTransaction().commit();
		em.close();
		factory.close();	
		return categories;
	}

}
