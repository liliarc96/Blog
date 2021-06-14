package br.com.blog.model;

public class Comentario {
	
	private String usuario;
	private String conteudo;
	
	
	public Comentario() {
		super();
	}
	public Comentario(String usuario, String conteudo) {
		super();
		this.usuario = usuario;
		this.conteudo = conteudo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	

}
