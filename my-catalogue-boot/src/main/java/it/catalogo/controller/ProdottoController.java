package it.catalogo.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.catalogo.model.Prodotto;
import it.catalogo.repository.ProdottiRepository;

@Controller
@RequestMapping("/")
public class ProdottoController {
	@Autowired
	private ProdottiRepository repo;
	
	//visualizza tutto
		@GetMapping("/")
		public ModelAndView  index() {
			Iterable<Prodotto> 	elenco =  repo.findAll();
			return new ModelAndView("index","listaProdotti",elenco);
		}
	
	
}
