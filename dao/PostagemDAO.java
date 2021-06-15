package br.com.blog.dao;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.blog.model.Postagem;

@Repository
public class PostagemDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public PostagemDAO() {
		
	}
	
	@Transactional(readOnly = false)
	public void salvar(Postagem postagem) {
		entityManager.persist(postagem);
		
	}	
	
		@Transactional(readOnly = true)
		public List <Postagem> getAll() {
			String jpql = "from Postagem u";
			TypedQuery<Postagem> consulta = entityManager.createQuery(jpql, Postagem.class);
			
			return consulta.getResultList();
		}
		
		public Postagem getId(Long id) {
			return entityManager.find(Postagem.class, id);
		
		}
		
		@Transactional(readOnly = false)
		public void excluir(Long id) {
			Postagem postagem = getId(id);
			entityManager.remove(postagem);
	}
		
		@Transactional(readOnly = false)
		public void editar(Postagem postagem) {
			entityManager.merge(postagem)	;	
		}
}

