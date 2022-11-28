package com.mycompany.agendamata55.classes;


import java.util.Calendar;

public class EContato extends Contato {
	protected String email, homepage;
	
	public EContato() {
		
		
	}

	public EContato(String nome, Calendar dtnasc, String email, String homepage) {
		super(nome, dtnasc);
		this.email = email;
		this.homepage = homepage;
	}

	@Override
	public String getDados() {
		return super.getDados() + "email: " + email + "\nhomepage:" + homepage + "\nIdade: ";
	}

	public String getEmail() {
		return email;
	}

	public String getHomepage() {
		return homepage;
	}
}