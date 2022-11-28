package com.mycompany.agendamata55.classes;


import java.util.Calendar;

public class Telefone {
	private String numero;
	private String tipo;

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Telefone(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}

	public String getTelefone() {
		return numero + " " + tipo;

	}
}