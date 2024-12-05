package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	ArrayList<Gioco> listaG = new ArrayList<>();
	ArrayList<GiochiA> listaGA = new ArrayList<>();
	ArrayList<GiocoSub> listaSub = new ArrayList<>();

	@GetMapping("/")
	public String getForm(Model model) {
		listaG.clear();
		Gioco g1 = new Gioco("Elden Ring", "From Software", "25/02/2022", 59.99,
				"https://m.media-amazon.com/images/I/81h2WhI4dtL._AC_SL1500_.jpg");
		Gioco g2 = new Gioco("God of War: Ragnarok", "Santa Monica Studio", "09/11/2022", 69.99,
				"https://m.media-amazon.com/images/I/81Pagnfx1DL._AC_SL1500_.jpg");
		Gioco g3 = new Gioco("Demon's Souls", "Bluepoint Games", "12/11/2020", 39.99,
				"https://m.media-amazon.com/images/I/81bPaMegD8L._AC_SL1500_.jpg");
		listaG.add(g1);
		listaG.add(g2);
		listaG.add(g3);
		model.addAttribute("listaG", listaG);
		return "index";
	}

	@PostMapping("/buy")
	public String recap(@RequestParam("selected") ArrayList<Integer> selected, Model model) {
		listaSub.clear();
		double somma = 0;
		listaGA.clear();
		for (int i = 0; i < listaG.size(); i++) {
			double prezzo = Math.round(listaG.get(i).getPrezzo() * 100.0) / 100.0;
			double prezzoSub = Math.round(prezzo * selected.get(i) * 100.0) / 100.0;
			if (selected.get(i) > 0) {
				somma += selected.get(i) * prezzo;
				GiocoSub gs1 = new GiocoSub(listaG.get(i).getNome(), listaG.get(i).getCasaPr(),
						listaG.get(i).getDataRilascio(), listaG.get(i).getPrezzo(), listaG.get(i).getUrl(),
						selected.get(i), prezzoSub);
				listaSub.add(gs1);

			}
		}
		somma = Math.round(somma * 100.0) / 100.0;
		model.addAttribute("somma", somma);
		model.addAttribute("listasub", listaSub);
		return "recap";
	}
}
