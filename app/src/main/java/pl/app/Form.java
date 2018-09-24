package pl.app;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Repository;

@Repository
public class Form {

	@NotEmpty
	@Size(min = 3)
	private String imie;
	@NotEmpty
	@Email
	private String email;
	@Min(18)
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
