package br.com.nuvemapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VestibularController {

	@RequestMapping("/")
	public String principal() {
		return "index";
	}
	
	@RequestMapping("/page-blank")
	public String pageBlank() {
		return "page-blank";
	}
	
	@RequestMapping("/page-404")
	public String page_404() {
		return "page-404";
	}
	
	@RequestMapping("/page-500")
	public String page_500() {
		return "page-500";
	}
	
	@RequestMapping("/page-contact")
	public String page_contact() {
		return "page-contact";
	}
	
	@RequestMapping("/page-todo")
	public String page_todo() {
		return "page-todo";
	}
	
}
