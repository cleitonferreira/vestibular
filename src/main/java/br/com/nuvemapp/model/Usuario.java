package br.com.nuvemapp.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Usuario {

	private Long codigo;
	@NotBlank(message = "Nome é obrigatório")
	private String nome;
	@NotBlank(message = "E-mail é obrigatório")
	private String email;
	@NotBlank(message = "Senha é obrigatório")
	@Size(min = 1, max = 10, message = "A senha deve estar entre 1 e 10 caracteres")
	private String senha;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}