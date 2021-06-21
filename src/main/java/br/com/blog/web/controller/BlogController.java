package br.com.blog.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import br.com.blog.dao.ComentarioDAO;
import br.com.blog.dao.PostagemDAO;
import br.com.blog.model.Comentario;
import br.com.blog.model.Postagem;

@Controller
public class BlogController {
	
	@Autowired
	private PostagemDAO daoPostagem;
	@Autowired
	private ComentarioDAO daoComentario;
	
	public BlogController() {
		daoPostagem = new PostagemDAO();
		daoComentario = new ComentarioDAO();
	}
	
	@RequestMapping(value="/inicio", method=RequestMethod.GET)
	public String paginaInicial(){
		return "paginaInicial";
	}
	
//--------------------------Formulário do posts
	@RequestMapping(value="/novoPost", method=RequestMethod.GET)
	public ModelAndView novoPost(Model model){
		model.addAttribute("postagem", new Postagem());
		return new ModelAndView("novoPost");
	}
	@RequestMapping(value="/novoPost", method=RequestMethod.POST)
	public ModelAndView exibirPost(@ModelAttribute Postagem postagem){
		ModelAndView view = new ModelAndView("novoPost");
		return view;
	}
	
	@PostMapping(value="/criarPost")
	public ModelAndView criarPost(@ModelAttribute Postagem postagem) {
		daoPostagem.salvar(postagem);
		ModelAndView view = new ModelAndView("novoPost");
		view.addObject("postagens", daoPostagem.getAll());
		return view;
	}
	
	@GetMapping(value="/criarPost")
	public ModelAndView postAposExcluir(@ModelAttribute Postagem postagem) {
		ModelAndView view = new ModelAndView("novoPost");
		view.addObject("postagens", daoPostagem.getAll());
		return view;
	}
	
	@GetMapping(value="/excluirPost/{id}")
	public String excluirPost(@PathVariable ("id") Long id, Model model) {
		daoPostagem.excluir(id);
		return "redirect:../criarPost";
	}
	
	@GetMapping(value="/editarPost/{id}")
	public ModelAndView editarPost(@PathVariable ("id") Long id, Model model) {
		ModelAndView view = new ModelAndView("editarPost");
		model.addAttribute("postagem", daoPostagem.getId(id));
		return view;
	}
	@PostMapping(value="/updatePost/{id}")
	public String updatePost(@ModelAttribute Postagem postagem) {
		daoPostagem.editar(postagem);
		return "redirect:../criarPost";
	}
//--------------------------
	
//--------------------------Formulário de comentário
	@RequestMapping(value="/novoComentario", method=RequestMethod.GET)
	public ModelAndView novoComentario(Model model){
		model.addAttribute("comentario", new Comentario());
		return new ModelAndView("novoComentario");
	}
	
	@RequestMapping(value="/novoComentario", method=RequestMethod.POST)
	public ModelAndView exibirComentario(@ModelAttribute Comentario comentario){
		ModelAndView view = new ModelAndView("novoComentario");
		return view;
	}
	
	@PostMapping(value="/criarComentario")
	public ModelAndView criarComentario(@ModelAttribute Comentario comentario) {
		daoComentario.salvar(comentario);
		ModelAndView view = new ModelAndView("novoComentario");
		view.addObject("comentarios", daoComentario.getAll());
		return view;
	}
	
	@GetMapping(value="/criarComentario")
	public ModelAndView comentarioAposExcluir(@ModelAttribute Comentario comentario) {
		ModelAndView view = new ModelAndView("novoComentario");
		view.addObject("comentarios", daoComentario.getAll());
		return view;
	}
	
	@GetMapping(value="/excluirComentario/{id}")
	public String excluirComentario(@PathVariable ("id") Long id, Model model) {
		daoComentario.excluir(id);
		return "redirect:../criarComentario";
	}
	
	@GetMapping(value="/editarComentario/{id}")
	public ModelAndView editarComentario(@PathVariable ("id") Long id, Model model) {
		ModelAndView view = new ModelAndView("editarComentario");
		model.addAttribute("comentario", daoComentario.getId(id));
		return view;
	}
	@PostMapping(value="/updateComentario/{id}")
	public String updateComentario(@ModelAttribute Comentario comentario) {
		daoComentario.editar(comentario);
		return "redirect:../criarComentario";
	}
//---------------------------
}
