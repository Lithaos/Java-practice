package pl.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Application {

	@Autowired
	Form form;

	@RequestMapping("/main")
	public String main() {
		return "index";
	}

}
