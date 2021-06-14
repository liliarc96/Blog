package br.com.blog.model;

public class Postagem {
	
	private String titulo;
	private String post;
	
	
	
	public Postagem() {
		super();
	}
	public Postagem(String titulo, String post) {
		super();
		this.titulo = titulo;
		this.post = post;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getPost() {
		return post;
	}
	public void setTexto(String post) {
		this.post = post;
	}

}
