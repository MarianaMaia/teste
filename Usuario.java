package Projeto2;

import java.util.List;



public class Usuario {
	String nome;
	String end;
	String instituicao;
	
	GerenteArtigo ger = new GerenteArtigo();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}	
	
	public void adicionarArtigo(Artigo art) {
		ger.adicionarArtigo(art);
	}
	

	public void removerArtigo(Artigo artigo) {
		ger.removerArtigo(artigo);
	}
	
	public List<Artigo> pesquisarPorAutor(String autor) {
		return ger.pesquisarPorAutor(autor);
	}

	public List<Artigo> pesquisarArtigoPorPalavra(String palavra) {
		return ger.pesquisarArtigoPorPalavra(palavra);
	}

	public List<Artigo> pesquisarArtigoPorTitulo(String titulo) {
		return ger.pesquisarArtigoPorTitulo(titulo);
	}
	
	}
