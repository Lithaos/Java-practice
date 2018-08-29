package pl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KotyController {
	@Autowired
	private KotDAO kotDao;

	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String home() {
		return "glowny";
	}
	@RequestMapping(value = "/", method = RequestMethod.POST)
		public String welcome(@RequestParam String nazwisko, ModelMap model) {
		model.put("nazwisko", nazwisko);
			return "welcome";
	}	
}