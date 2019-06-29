package entity_classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
@Entity
@Table(name="address")
public class Address {

	@Id
	@GeneratedValue
	private int id;
	private String ulica;
	private String numer_domu;
	private String miasto;
	private String kod_pocztowy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getNumer_domu() {
		return numer_domu;
	}

	public void setNumer_domu(String numer_domu) {
		this.numer_domu = numer_domu;
	}

	public String getMiasto() {
		return miasto;
	}

	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}

	public String getKod_pocztowy() {
		return kod_pocztowy;
	}

	public void setKod_pocztowy(String kod_pocztowy) {
		this.kod_pocztowy = kod_pocztowy;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", ulica=" + ulica + ", numer_domu=" + numer_domu + ", miasto=" + miasto
				+ ", kod_pocztowy=" + kod_pocztowy + "]";
	}

	
}


