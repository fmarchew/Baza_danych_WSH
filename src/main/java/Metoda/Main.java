package Metoda;

import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import entity_classes.Address;
import entity_classes.Uzytkownik;
import entity_classes.Rent_books;


public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BazaDanych");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
// Tworzenie nowego adresu	
	/*	
		Address address = new Address();
//		address.setId(1);
		address.setKod_pocztowy("97-400");
		address.setMiasto("Be³chatów");
		address.setUlica("Wojska Polskiego");
		address.setNumer_domu("12/23");
		
		Address address2 = new Address();
		address2.setKod_pocztowy("54-018");
		address2.setMiasto("Wroclaw");
		address2.setUlica("Brzezinska");
		address2.setNumer_domu("69/2");
		
		Address address3 = new Address();
		address3.setKod_pocztowy("54-118");
		address3.setMiasto("Brzeg");
		address3.setUlica("Ruska");
		address3.setNumer_domu("2");
		
		Rent_books rent_books = new Rent_books();
		rent_books.setBook_name("ogniem i mieczem");
		rent_books.setData_od("24.05.2019");
		rent_books.setData_do("24.05.2020");
		
		Uzytkownik uzytkownik = new Uzytkownik();
		uzytkownik.setUser("Filip");
		uzytkownik.setPassword("kupa123");
		uzytkownik.setAddress(address3);
		uzytkownik.setRent_books(rent_books);
	*/
// otwarcie transakcji
		
		entityManager.getTransaction().begin();
// zapis do bazy danych		
	/*
		entityManager.persist(address);
		entityManager.persist(address2);
		entityManager.persist(address3);
		entityManager.persist(uzytkownik);
		entityManager.persist(rent_books);
	*/	
//zamkniecie transakcji
		
		
		entityManager.getTransaction().commit();
		
		
		TypedQuery<Uzytkownik> query = entityManager.createQuery("select e from Uzytkownik e where e.user = :imie ", Uzytkownik.class)
				.setParameter("imie", "Filip");
		Uzytkownik uzytkownik = query.getSingleResult();
		System.out.println("user id:" + uzytkownik.getId());
		System.out.println("user name:" + uzytkownik.getUser());
		System.out.println("password:" + uzytkownik.getPassword());
		
		TypedQuery<Uzytkownik> query2 = entityManager.createQuery("select e from Uzytkownik e where e.address = 3 ", Uzytkownik.class);
			
		List<Uzytkownik> uzytkownik2 = query2.getResultList();
		for(Uzytkownik user : uzytkownik2) {
			
			System.out.println(user.toString());
			
			}
		
		//Query Query = entityManager
				//.createQuery("select count(e) from Uzytkownik e");
		  //Long result = (Object[]) Query.getSingleResult();
		  //System.out.println("W bazie danych jest " + result[0] + " uzytkownikow");
				  
		
		  
		  
		  entityManagerFactory.close();
		
		
		
		 
		
	}

}
