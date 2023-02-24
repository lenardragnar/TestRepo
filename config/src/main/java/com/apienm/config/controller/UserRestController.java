package com.apienm.config.controller;
import java.util.List;
import com.apienm.config.entity.app_eri_bcg_nodo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apienm.config.service.ConfigService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
@RequestMapping("/api")
public class UserRestController {
	@Autowired
	private ConfigService configService;
	
	@GetMapping("/nodos/{Pais}")
	public List<app_eri_bcg_nodo> findByPais(@PathVariable String Pais){
		List<app_eri_bcg_nodo> nodos= configService.findByPais(Pais);
		if(nodos==null) {
			throw new RuntimeException("Lista de Nodos para "+Pais+" no existen.");
		}
		return nodos;
	}
}
