package com.apienm.config.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.apienm.config.entity.app_eri_bcg_nodo;

@Repository
public class ConfigDAOImpl implements ConfigDAO {
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<app_eri_bcg_nodo> findByPais(String Pais){
		Session currentSession = entityManager.unwrap(Session.class);
		Query<app_eri_bcg_nodo> SqlNodos = currentSession.createQuery(" from app_eri_bcg_nodo where pais=:Pais and rnc='ESV_LTE'",app_eri_bcg_nodo.class).setParameter("Pais", Pais);
		List<app_eri_bcg_nodo> nodos=SqlNodos.getResultList();
		return nodos;		
	}

}
