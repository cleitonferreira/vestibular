package br.com.nuvemapp.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.nuvemapp.model.Usuario;


@Controller
public class FormularioController {

	private static final Logger logger = LoggerFactory.getLogger(FormularioController.class);
	
	/*
	  	@RequestMapping("/test/formulario")
		public String novo(Model model) {
			model.addAttribute(new Usuario());
			return "/test/formulario";
		}
	*/
		
		@RequestMapping("/test/formulario")
		public String novo(Usuario usuario) {
			return "test/formulario";
		}

		
		@RequestMapping(value = "/test/formulario", method = RequestMethod.POST)
		public String cadastrar(@Valid Usuario usuario, BindingResult result, Model model, RedirectAttributes attributes) {
			
			if (result.hasErrors()) {
				model.addAttribute("mensagem", "Erro no formulário");
				model.addAttribute(usuario);
				return "test/formulario";
			} else {
				
				logger.info("O usuário foi cadastrado com sucesso!");
				
				System.out.println(">>> Nome: " + usuario.getNome());
				System.out.println(">>> E-mail: " + usuario.getEmail());
				System.out.println(">>> Senha: " + usuario.getSenha());
			}
			
			// Salvar no banco de dados...
			attributes.addFlashAttribute("mensagem", "Formulário salvo com sucesso!");
			return "redirect:/test/formulario";
			
		}
		
	}
