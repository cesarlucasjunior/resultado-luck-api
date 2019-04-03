package com.cesarjunior.resultadoluck.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Funcionaria implements Serializable {
	private static final long serialVersionUID = -644766567477410543L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nomeCompleto;
	private Date dataNascimento;
	private Date dataEntrada;
	private Date dataSaida;
	private String status;

	@JoinColumn(name = "funcionarias")
	private Loja loja;

	@OneToMany(mappedBy = "funcionaria")
	private List<ResultadoObtido> resultadoObtido;

	public Funcionaria() {

	}

	public Funcionaria(String nomeCompleto, Date dataNascimento, Date dataEntrada, String status, Loja loja) {
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.dataEntrada = dataEntrada;
		this.status = status;
		this.loja = loja;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public Date getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public List<ResultadoObtido> getResultadoObtido() {
		return resultadoObtido;
	}

	public void setResultadoObtido(List<ResultadoObtido> resultadoObtido) {
		this.resultadoObtido = resultadoObtido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeCompleto == null) ? 0 : nomeCompleto.hashCode());
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
		Funcionaria other = (Funcionaria) obj;
		if (nomeCompleto == null) {
			if (other.nomeCompleto != null)
				return false;
		} else if (!nomeCompleto.equals(other.nomeCompleto))
			return false;
		return true;
	}

}
