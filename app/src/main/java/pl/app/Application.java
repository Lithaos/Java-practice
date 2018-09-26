package pl.app;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Application {
	@RequestMapping(value = "/formularz", method = RequestMethod.GET)
	public String formularz(@ModelAttribute("form") Form form) {
		return "formularz";
	}

	@RequestMapping(value = "/formularz", method = RequestMethod.POST)
	public String obsluzFormularz(HttpServletRequest request,@ModelAttribute("form") @Valid Form form, BindingResult result) {
		if (request.getMethod().equalsIgnoreCase("get") || result.hasErrors()) { 
			return "formularz"; } 
		else {
				return "wynik"; }
	}
} 