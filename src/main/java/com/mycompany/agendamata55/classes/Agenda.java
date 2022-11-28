/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendamata55.classes;

/**
 *
 * @author CaiS2Lai
 */


import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Agenda {
	private ArrayList<ContatoBasico> contatos;
        
        private String nome;
	private GregorianCalendar calendario;
	private ArrayList<GregorianCalendar> agenda;
	private ArrayList<String> descricao;
	
	public Agenda(String nome_a) {
		this.nome = nome_a;
		agenda = new ArrayList<GregorianCalendar>(365);
		descricao = new ArrayList<String>(365);
	}
	
	public void adicionar(int ano_a,int mes_a,int dia_a, String descricao_a) {
		calendario = new GregorianCalendar(ano_a,mes_a,dia_a);
		agenda.add(calendario);
		descricao.add(descricao_a);
	}
	
	public GregorianCalendar getCalendario() {
		return calendario;
	}
	
	public void exibeCalendario() {
		for(int i = 0; i < agenda.size(); i++) {
			int mes_calendario = agenda.get(i).get(Calendar.MONTH) + 1;
			System.out.println("Data: " + agenda.get(i).get(Calendar.DAY_OF_MONTH) + "/" + mes_calendario  + "/" + agenda.get(i).get(Calendar.YEAR));
			System.out.println("Descrição: " + descricao.get(i));
		}
	}
	
	public String getNome() {
		return nome;
	}
        
	public Agenda() {
		contatos = new ArrayList<ContatoBasico>();
	}
        
        
	public void inserir(ContatoBasico c) {
		contatos.add(c);
	}

	public ContatoBasico buscar(String nome) {
		for (int i = 0; i < contatos.size(); i++) {
			ContatoBasico c = contatos.get(i);
			if (c.getNome().equalsIgnoreCase(nome))
				return contatos.get(i);
		}
		return null;
	}

	public ContatoBasico buscar(int posicao) {
		if (posicao >= 0 && posicao < contatos.size()) {
			return contatos.get(posicao);
		}
		return null;
	}

	public EContato buscarEmail(String email) {
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i) instanceof EContato) {
				EContato c = (EContato) contatos.get(i);
				if (c.getEmail().equalsIgnoreCase(email))
					return (EContato) contatos.get(i);
			}
		}
		return null;
	}

	public Contato[]

			buscarGeral(String palavraChave) {
		ArrayList<ContatoBasico> todos = new ArrayList<ContatoBasico>();
		for (int i = 0; i < contatos.size(); i++) {
			ContatoBasico c = contatos.get(i);
			if (c.getDados().contains(palavraChave))
				todos.add(c);
		}
		Contato[] vet = new Contato[todos.size()];

		return (todos.toArray(vet));
	}

	public Contato[]

			buscarTodos() {
		Contato[] vet = new Contato[contatos.size()];

		return (contatos.toArray(vet));
	}

	public int getQuantidade() {
		return contatos.size();
	}
}
