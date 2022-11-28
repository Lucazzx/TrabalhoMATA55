package com.mycompany.agendamata55.classes;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Contato extends ContatoBasico {

	protected Calendar dataNascimento;

	public Contato(String nome, Calendar dataNascimento) {
		super(nome);
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String getDados() {
		return super.getDados() + "Nascido em " + dataNascimento.get(Calendar.DATE) + "/"
				+ dataNascimento.get(Calendar.MONTH) + "/" + dataNascimento.get(Calendar.YEAR) + "\nIdade: ";
	}

	public int getIdade() {
		Calendar hoje = new GregorianCalendar();
		int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
		hoje.set(Calendar.YEAR, dataNascimento.get(Calendar.YEAR));
		if (hoje.before(dataNascimento))
			idade--;
		return idade;

	}


	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public Contato() {
		// TODO Auto-generated constructor stub
	}

	

}
