package model;

public class Autor {
	
	private String nome;
	private String email;
	private long celular;
	
	public Autor() {
		
	}
	
	public Autor(String nome, String email, long celular) {
		this.nome = nome;
		this.email = email;
		this.celular = celular;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getCelular() {
		return celular;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}

}
