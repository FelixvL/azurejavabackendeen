package nl.cf.azurepogingeen.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KamerController {
	@GetMapping("/maakkamer")
	public String maakkamer() {
		return "maakkamer";
	}
	@GetMapping("/allekamers")
	public String zieAlleKamers() {
		return "allekamers";
	}
}
