package com.mycompany.agendamata55.classes;


import java.util.ArrayList;

abstract public class ContatoBasico {
	protected String nome;
	protected ArrayList<Telefone> telefones;

	public ContatoBasico() {
		nome = "";
		telefones = new ArrayList<Telefone>();
	}

	public ContatoBasico(String nome) {
		this.nome = nome;
		telefones = new ArrayList<Telefone>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(Telefone tel) {
		telefones.add(tel);
	}

	public String getDados() {
		String dado = nome + "\n";

		for (Telefone tel : telefones) {
			dado += tel.getTelefone() + "\n";
		}
		return dado;
	}
}
