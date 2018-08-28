package pl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KotyController {
	@Autowired
	private KotDAO kotDao;

	@RequestMapping("/metoda")
	public String metoda() {
		return "glowny";
	}
}