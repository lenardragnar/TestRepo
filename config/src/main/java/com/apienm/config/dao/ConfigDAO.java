package com.apienm.config.dao;
import java.util.List;
import com.apienm.config.entity.app_eri_bcg_nodo;

public interface ConfigDAO {
	public List<app_eri_bcg_nodo> findByPais(String Pais);

}
