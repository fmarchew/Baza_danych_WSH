package entity_classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="rent_books")

public class Rent_books {
	
	@Id
	@GeneratedValue
	private int id;
	private String book_name;
	private String data_od;
	private String data_do;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getData_od() {
		return data_od;
	}

	public void setData_od(String data_od) {
		this.data_od = data_od;
	}

	public String getData_do() {
		return data_do;
	}

	public void setData_do(String data_do) {
		this.data_do = data_do;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	@Override
	public String toString() {
		return "[id " + id + " " + book_name + " - wypoo¿yczone od " + data_od + " do " + data_do
				+ "]";
	}

}
