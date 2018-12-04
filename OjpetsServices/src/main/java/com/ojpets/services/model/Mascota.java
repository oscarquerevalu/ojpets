package com.ojpets.services.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mascota database table.
 * 
 */
@Entity
@NamedQuery(name="Mascota.findAll", query="SELECT m FROM Mascota m")
public class Mascota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idmascota;

	private String genero;

	private String lugar;

	private String raza;

	private String tipo;
	
	private String detalles;
	
	@Lob
	@Column(name="CONTENT", length=512)
	private String imagen;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="mascota")
	private List<Usuario> usuarios;

	public Mascota() {
	}
	

	public Mascota(String genero, String lugar, String raza, String tipo, String detalles, String imagen) {
		super();
		this.genero = genero;
		this.lugar = lugar;
		this.raza = raza;
		this.tipo = tipo;
		this.detalles = detalles;
		this.imagen = imagen;
	}




	public long getIdmascota() {
		return idmascota;
	}

	public void setIdmascota(long idmascota) {
		this.idmascota = idmascota;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getLugar() {
		return this.lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getRaza() {
		return this.raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setMascota(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setMascota(null);

		return usuario;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
	
	
	
}