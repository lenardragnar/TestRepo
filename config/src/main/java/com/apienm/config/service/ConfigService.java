package com.apienm.config.service;

import java.util.List;

import com.apienm.config.entity.app_eri_bcg_nodo;

public interface ConfigService {
	public List<app_eri_bcg_nodo> findByPais(String Pais);

}
