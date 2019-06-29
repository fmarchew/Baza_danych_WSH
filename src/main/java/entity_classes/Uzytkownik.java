package entity_classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
@Table(name="uzytkownik")
public class Uzytkownik {

	@Id
	@GeneratedValue
	private int id;
	private String user;
	private String password;
	
	@OneToOne
	private Address address;
	@OneToOne
	private Rent_books rent_books;

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Rent_books getRent_books() {
		return rent_books;
	}

	public void setRent_books(Rent_books rent_books) {
		this.rent_books = rent_books;
	}

	@Override
	public String toString() {
		return "Uzytkownik [id=" + id + ", user=" + user + ", password=" + password + ", address=" + address
				+ ", rent_books=" + rent_books + "]";
	}



	
	
}
