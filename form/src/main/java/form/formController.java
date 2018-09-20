package form;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class formController {

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String form() {
		return "index";
	}

	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String formControl(HttpServletRequest request, @ModelAttribute("form") @Valid FormDTO form, BindingResult result) {
		if (request.getMethod().equalsIgnoreCase("get") || result.hasErrors()) 
		{
			return "index";
		} 
		else 
		{ 	
			return "index"; 
		}
		
	}
}
