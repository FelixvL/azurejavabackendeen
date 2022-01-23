package nl.cf.azurepogingeen.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import nl.cf.azurepogingeen.domein.Kamer;

@RestController
public class KamerController {
	@Autowired
	private KamerRepository kr;
	
	
	@GetMapping("/maakkamer")
	public String maakkamer() {
		return "maakkamerupdate";
	}
	@GetMapping("/allekamers")
	public String zieAlleKamers() {
		return "allekamersupdate";
	}
	@GetMapping("/maakkamerreal/{naam}/{prijs}/{omschrijving}")
	public String maakkamerreal(@PathVariable String naam, @PathVariable int prijs, @PathVariable String omschrijving) {
		Kamer k = new Kamer();
		k.setNaam(naam);
		k.setPrijs(prijs);
		k.setOpmerking(omschrijving);
		kr.save(k);
		return "maakkamer";
	}
	@GetMapping("/allekamersreal")
	public Iterable<Kamer> zieAlleKamersReal() {
		return kr.findAll();
	}
}
