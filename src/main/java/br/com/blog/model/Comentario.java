package br.com.blog.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "comentarios")
public class Comentario implements Serializable {
	
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false,length=100)
	private String nome;
	@Column(nullable=false,length=1000)
	private String coment;
	
	public Comentario() {
		super();
	}
	public Comentario(Long id, String nome, String coment) {
		super();
		this.id = id;
		this.nome = nome;
		this.coment = coment;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getComent() {
		return coment;
	}
	public void setComent(String coment) {
		this.coment = coment;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comentario other = (Comentario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	

}
