package com.apienm.config.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apienm.config.dao.ConfigDAO;
import com.apienm.config.entity.app_eri_bcg_nodo;

@Service
public class ConfigServiceImpl implements ConfigService{
	@Autowired
	private ConfigDAO configDAO;
	
	@Override
	public List<app_eri_bcg_nodo> findByPais(String Pais){
		List<app_eri_bcg_nodo> listNodos=configDAO.findByPais(Pais);
		return listNodos;
	}
}
