package Metoda;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entity_classes.Uzytkownik;

public class Searching {

	public static void main(String[] args) {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BazaDanych");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	Scanner input = new Scanner(System.in);
	System.out.println("Kogo szukasz?: ");
	String name = input.nextLine();
	
	entityManager.getTransaction().begin();
	
	
	TypedQuery<Uzytkownik> query = entityManager.createQuery("select e from Uzytkownik e where e.user = :imie ", Uzytkownik.class)
			.setParameter("imie", name);
	Uzytkownik uzytkownik = query.getSingleResult();
	//System.out.println("user id:" + uzytkownik.getId());
    //System.out.println("user name:" + uzytkownik.getUser());
	//System.out.println("password:" + uzytkownik.getPassword());
	
	System.out.println();
	System.out.println(uzytkownik.getUser() + " wypo¿yczy³ takie ksi¹¿ki: " + uzytkownik.getRent_books());
	System.out.println();
	
	
	entityManager.getTransaction().commit();
	
	entityManager.close();
	
	
	entityManagerFactory.close();
	
	
	}
}