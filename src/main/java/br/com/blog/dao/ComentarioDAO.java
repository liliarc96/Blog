package br.com.blog.dao;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.blog.model.Comentario;
import br.com.blog.model.Postagem;

@Repository
public class ComentarioDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public ComentarioDAO() {
		
	}
	
	@Transactional(readOnly = false)
	public void salvar(Comentario comentario) {
		entityManager.persist(comentario);
		
	}	
	
		@Transactional(readOnly = true)
		public List <Comentario> getAll() {
			String jpql = "from Comentario u";
			TypedQuery<Comentario> consulta = entityManager.createQuery(jpql, Comentario.class);
			
			return consulta.getResultList();
		}
		
		public Comentario getId(Long id) {
			return entityManager.find(Comentario.class, id);
		
		}
		
		@Transactional(readOnly = false)
		public void excluir(Long id) {
			Comentario comentario = getId(id);
			entityManager.remove(comentario);
	}
		
		@Transactional(readOnly = false)
		public void editar(Comentario comentario) {
			entityManager.merge(comentario);	
		}
}
