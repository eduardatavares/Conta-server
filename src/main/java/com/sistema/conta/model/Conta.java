package com.sistema.conta.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contas")
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;

	private Date dataVenc;
	private double valor;
	private boolean status;

	public Conta() {

	}

	public Conta(Integer id, String nome, Date dataVenc, double valor, boolean status) {
		this.id = id;
		this.nome = nome;
		this.dataVenc = dataVenc;
		this.valor = valor;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataVenc() {
		return dataVenc;
	}

	public void setDataVenc(Date dataVenc) {
		this.dataVenc = dataVenc;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
