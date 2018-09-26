package form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;


public class FormDTO {

	@NotEmpty
	@Size(min = 3)
	private String imie;
	
	@NotEmpty
	@Email
	private String email;
	@Min(18)
	private Integer wiek;
}
