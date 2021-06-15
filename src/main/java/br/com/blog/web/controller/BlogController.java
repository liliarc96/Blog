package br.com.blog.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String welcome() {
		return "blog";
	}
	@RequestMapping(value = "/criar-postagem", method = RequestMethod.GET)
	public ModelAndView novaPostagem() {
		ModelAndView view = new ModelAndView("criar-postagem");
		return view;
	}
	@RequestMapping(value = "/criar-postagem", method = RequestMethod.POST)
	public ModelAndView novaPostagemPost(@RequestParam String titulo, @RequestParam String post) {
		ModelAndView view = new ModelAndView("criar-postagem");
		return view;
	}

	@RequestMapping(value = "/criar-comentario", method = RequestMethod.GET)
	public ModelAndView novoComentario() {
		ModelAndView view = new ModelAndView("criar-comentario");
		return view;
	}
	@RequestMapping(value = "/criar-comentario", method = RequestMethod.POST)
	public ModelAndView novoComentarioPost(@RequestParam String nome, @RequestParam String comentario) {
		ModelAndView view = new ModelAndView("criar-comentario");
		return view;
	}
}
