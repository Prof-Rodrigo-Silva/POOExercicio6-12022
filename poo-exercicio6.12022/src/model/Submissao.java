package model;

public abstract class Submissao {
	
	protected String titulo;
	protected int situacao;
	protected static int total;
	protected Autor autor;
	protected Area area;
	
	protected final static int APROVADO = 0;
	protected final static int REPROVADO = 1;
	protected final static int ALTERACOES = 3;
	
	public Submissao() {
		incrementarTotal();
		
	}
	public Submissao(String titulo, int situacao, Autor autor, Area area) {
		this.titulo = titulo;
		this.situacao = situacao;
		this.autor = autor;
		this.area = area;
		incrementarTotal();
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	
	public static int getTotal() {
		return total;
	}
	
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	
	public String avaliar(int situacao) {
		
		String retorno = " ";
		if(situacao == APROVADO) {
			retorno = "Aprovado";
		}else if(situacao == REPROVADO){
			retorno = "Reprovado";
		
		}else {
			retorno = "Alterações";
		}
		return retorno;
	}
	
	private static void incrementarTotal() {
		total++;
	}
	

}
