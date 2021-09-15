package modelo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String login;
	private String senha;
	private Boolean bloqueadoBoolean;
	@Enumerated(EnumType.STRING)
	private Status status = Status.INATIVO;
	private PerfilAcesso perfilAcesso;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Boolean getBloqueadoBoolean() {
		return bloqueadoBoolean;
	}
	public void setBloqueadoBoolean(Boolean bloqueadoBoolean) {
		this.bloqueadoBoolean = bloqueadoBoolean;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public PerfilAcesso getPerfilAcesso() {
		return perfilAcesso;
	}
	public void setPerfilAcesso(PerfilAcesso perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}
	
}