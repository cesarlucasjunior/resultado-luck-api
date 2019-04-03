package com.cesarjunior.resultadoluck.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class ResultadoObtido implements Serializable {
	private static final long serialVersionUID = 645488296398802836L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(unique=true)
	private Date dataInicioMeta;
	@Column(unique=true)
	private Date dataFimMeta;
	private Double meta1;
	private Double meta2;
	private Double meta3;
	private Double comissao;
	private Double bonificacao;

	@JoinColumn(name = "resultadoObtido")
	private Funcionaria funcionaria;

	public ResultadoObtido() {
		super();
	}

	public ResultadoObtido(Date dtInicioMeta, Date dtFimMeta, Double meta1, Double meta2, Double meta3) {
		super();
		this.dataInicioMeta = dtInicioMeta;
		this.dataFimMeta = dtFimMeta;
		this.meta1 = meta1;
		this.meta2 = meta2;
		this.meta3 = meta3;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataInicioMeta() {
		return dataInicioMeta;
	}

	public void setDataInicioMeta(Date dataInicioMeta) {
		this.dataInicioMeta = dataInicioMeta;
	}

	public Date getDataFimMeta() {
		return dataFimMeta;
	}

	public void setDataFimMeta(Date dataFimMeta) {
		this.dataFimMeta = dataFimMeta;
	}

	public Double getMeta1() {
		return meta1;
	}

	public void setMeta1(Double meta1) {
		this.meta1 = meta1;
	}

	public Double getMeta2() {
		return meta2;
	}

	public void setMeta2(Double meta2) {
		this.meta2 = meta2;
	}

	public Double getMeta3() {
		return meta3;
	}

	public void setMeta3(Double meta3) {
		this.meta3 = meta3;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(Double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public Funcionaria getFuncionaria() {
		return funcionaria;
	}

	public void setFuncionaria(Funcionaria funcionaria) {
		this.funcionaria = funcionaria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataFimMeta == null) ? 0 : dataFimMeta.hashCode());
		result = prime * result + ((dataInicioMeta == null) ? 0 : dataInicioMeta.hashCode());
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
		ResultadoObtido other = (ResultadoObtido) obj;
		if (dataFimMeta == null) {
			if (other.dataFimMeta != null)
				return false;
		} else if (!dataFimMeta.equals(other.dataFimMeta))
			return false;
		if (dataInicioMeta == null) {
			if (other.dataInicioMeta != null)
				return false;
		} else if (!dataInicioMeta.equals(other.dataInicioMeta))
			return false;
		return true;
	}

}
