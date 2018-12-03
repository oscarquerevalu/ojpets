package com.ojpets.services.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ubigeo database table.
 * 
 */
@Entity
@NamedQuery(name="Ubigeo.findAll", query="SELECT u FROM Ubigeo u")
public class Ubigeo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idubigeo;

	private String departamento;

	private String distrito;

	private String provincia;

	//bi-directional many-to-one association to Mapa
	@ManyToOne
	@JoinColumn(name="IDMAPA")
	private Mapa mapa;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="ubigeo")
	private List<Usuario> usuarios;

	public Ubigeo() {
	}
	
	

	public Ubigeo(String departamento, String distrito, String provincia) {
		super();
		this.departamento = departamento;
		this.distrito = distrito;
		this.provincia = provincia;
	}



	public int getIdubigeo() {
		return this.idubigeo;
	}

	public void setIdubigeo(int idubigeo) {
		this.idubigeo = idubigeo;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDistrito() {
		return this.distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Mapa getMapa() {
		return this.mapa;
	}

	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setUbigeo(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setUbigeo(null);

		return usuario;
	}

}