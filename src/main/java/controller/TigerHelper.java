package controller;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Tiger;
public class TigerHelper {
	EntityManagerFactory factory =
		Persistence.createEntityManagerFactory("TigerExample");
public void persist(Tiger model) {
	EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(model);
		manager.getTransaction().commit();
		manager.close();
			}
public void delete(Tiger model) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.remove(manager.find(Tiger.class, model.getRowId()));
		manager.getTransaction().commit();
		manager.close();
	}
			@SuppressWarnings("unchecked")
public List<Tiger> showAllTrains() {
	EntityManager manager = factory.createEntityManager();
	List<Tiger> allItems = manager.createQuery("SELECT i FROM TigerExample i").getResultList();
	manager.close();
	return allItems;
}
public void update(Tiger model) {
	EntityManager manager = factory.createEntityManager();
	Tiger dbEntity = manager.find(Tiger.class, model.getRowId());
	manager.getTransaction().begin();
	dbEntity.setColor(model.getColor());
	dbEntity.setAge(model.getAge());
	manager.getTransaction().commit();
	manager.close();
}
public void go() {
	// TODO Auto-generated method stub
	
}
}
