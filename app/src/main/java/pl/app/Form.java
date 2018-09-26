package pl.app;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Repository;

@Repository
public class Form {

	@NotEmpty(message="Musisz podać imię!")
	@Size(min = 3, max=20, message="Imie musi być dłuższe niż 3 i krótsze niż 20")
	private String imie;
	@NotEmpty(message = "Musisz podać email")
	@Email(message="Niepoprawny format")
	private String email;
	@Min(value = 18, message="Musisz mieć 18 lat!")
	private Integer wiek;

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getWiek() {
		return wiek;
	}

	public void setWiek(Integer wiek) {
		this.wiek = wiek;
	}
}
