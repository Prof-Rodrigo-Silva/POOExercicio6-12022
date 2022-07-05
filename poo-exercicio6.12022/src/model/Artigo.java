package model;

import interfaces.TaxaPublicacao;

public class Artigo extends Submissao implements TaxaPublicacao{
	
	private String resumo;
	static int numeroArtigos;
	private boolean pagTaxa;
	
	public Artigo() {
		super();
		incrementarNumeroArtigos();
	}
	
	public Artigo(String titulo, int situacao, Autor autor, Area area, String resumo) {
		super(titulo, situacao, autor, area);
		this.resumo = resumo;
		incrementarNumeroArtigos();
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
	private static void incrementarNumeroArtigos() {
		numeroArtigos++;
	}

	@Override
	public float getTaxaSubmissao() {
		aplicarTaxa();
		return 21.50f;
	}

	@Override
	public boolean aplicarTaxa() {
		return pagTaxa = true;
	}

	
}
