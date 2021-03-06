package com.projet.stock.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name = "LconsSonede")
public class LconsSonede {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  private int numero;
	  private int annee;
	  private int mois;
	  private int code_residence;
	  private String lib_residence;
	  private int qte;
	  @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	  @JsonBackReference
	  private ConsSonede consSonede;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	public int getCode_residence() {
		return code_residence;
	}
	public void setCode_residence(int code_residence) {
		this.code_residence = code_residence;
	}
	public String getLib_residence() {
		return lib_residence;
	}
	public void setLib_residence(String lib_residence) {
		this.lib_residence = lib_residence;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public ConsSonede getConsSonede() {
		return consSonede;
	}
	public void setConsSonede(ConsSonede consSonede) {
		this.consSonede = consSonede;
	}
	public LconsSonede(long id, int numero, int annee, int mois, int code_residence, String lib_residence, int qte,
			ConsSonede consSonede) {
		super();
		this.id = id;
		this.numero = numero;
		this.annee = annee;
		this.mois = mois;
		this.code_residence = code_residence;
		this.lib_residence = lib_residence;
		this.qte = qte;
		this.consSonede = consSonede;
	}
	public LconsSonede() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LconsSonede [id=" + id + ", numero=" + numero + ", annee=" + annee + ", mois=" + mois
				+ ", code_residence=" + code_residence + ", lib_residence=" + lib_residence + ", qte=" + qte
				+ ", consSonede=" + consSonede + "]";
	}

}
