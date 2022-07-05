package model;

import java.util.Date;

public class Palestra extends Submissao{
	
	private String descricao;
	private Date data;
	private Date hora;
	static int numeroPalestra;
	
	public Palestra() {
		super();
		incrementarNumeroPalestra();
	}
	
	public Palestra(String titulo, int situacao, Autor autor, Area area, String descricao, Date data, Date hora) {
		super(titulo, situacao, autor, area);
		this.descricao = descricao;
		this.data = data;
		this.hora = hora;
		incrementarNumeroPalestra();
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}


	private static void incrementarNumeroPalestra() {
		numeroPalestra++;
	}

}
