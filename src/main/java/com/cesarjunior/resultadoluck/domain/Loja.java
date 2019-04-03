package com.cesarjunior.resultadoluck.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Loja implements Serializable {
	private static final long serialVersionUID = -5785802130213106705L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nomeLoja;
	private Date dataAbertura;
	private String telefone;

	@OneToMany(mappedBy = "loja")
	private List<Funcionaria> funcionarias;

	@OneToMany(mappedBy = "loja")
	private List<ResultadoEsperado> resultadoEsperado;

	public Loja() {
	}

	public Loja(String nomeLoja, Date dataAbertura, String telefone) {
		super();
		this.nomeLoja = nomeLoja;
		this.dataAbertura = dataAbertura;
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<ResultadoEsperado> getResultadoEsperado() {
		return resultadoEsperado;
	}

	public void setResultadoEsperado(List<ResultadoEsperado> resultadoEsperado) {
		this.resultadoEsperado = resultadoEsperado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeLoja == null) ? 0 : nomeLoja.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loja other = (Loja) obj;
		if (nomeLoja == null) {
			if (other.nomeLoja != null)
				return false;
		} else if (!nomeLoja.equals(other.nomeLoja))
			return false;
		return true;
	}

	public List<Funcionaria> getFuncionarias() {
		return funcionarias;
	}

	public void setFuncionarias(List<Funcionaria> funcionarias) {
		this.funcionarias = funcionarias;
	}

}
