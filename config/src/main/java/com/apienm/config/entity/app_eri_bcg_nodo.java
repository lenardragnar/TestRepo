package com.apienm.config.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


import javax.persistence.Id;



@Entity
@Table(name="app_eri_bcg_nodo", schema = "smart")
public class app_eri_bcg_nodo {
	
	@Id
	@Column(name="nodo")
	private String nodo;
	
	@Column(name="pais")
	private String pais;

	@Column(name="rnc")
	private String rnc;

	@Column(name="netype")
	private String netype;

	@Column(name="iubid")
	private String iubid;

	@Column(name="modo4g")
	private String modo4g;
	
	public app_eri_bcg_nodo() {}

	public app_eri_bcg_nodo(String pais, String rnc, String nodo, String netype, String iubid, String modo4g) {
		super();
		this.pais = pais;
		this.rnc = rnc;
		this.nodo = nodo;
		this.netype = netype;
		this.iubid = iubid;
		this.modo4g = modo4g;
	}


	public String getPais() {
		return pais;
	}

	public String getRnc() {
		return rnc;
	}

	public String getNodo() {
		return nodo;
	}

	public String getNetype() {
		return netype;
	}

	public String getIubid() {
		return iubid;
	}

	public String getModo4g() {
		return modo4g;
	}

	@Override
	public String toString() {
		return "NodoRn4 [pais=" + pais + ", rnc=" + rnc + ", nodo=" + nodo + ", netype=" + netype + ", iubid=" + iubid
				+ ", modo4g=" + modo4g + "]";
	}

}
