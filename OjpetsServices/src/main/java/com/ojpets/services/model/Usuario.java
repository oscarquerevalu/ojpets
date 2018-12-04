package com.ojpets.services.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the idusuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idusuario;

	private String apematerno;

	private String apepaterno;

	private String direccion;

	private String nombre;

	private String password;

	private String sexo;
	
	private String usuario;
	
	private String numero;

	//bi-directional many-to-one association to Mascota
	@ManyToOne
	private Mascota mascota;

	//bi-directional many-to-one association to Perfil
	@ManyToOne
	private Perfil perfil;

	//bi-directional many-to-one association to Ubigeo
	@ManyToOne
	private Ubigeo ubigeo;

	public Usuario() {
	}
	
	
	
	public Usuario(String usuario, String apematerno, String apepaterno, String direccion, String nombre,
			String password, String sexo) {
		super();
		this.usuario = usuario;
		this.apematerno = apematerno;
		this.apepaterno = apepaterno;
		this.direccion = direccion;
		this.nombre = nombre;
		this.password = password;
		this.sexo = sexo;
	}



	public String getUsuario() {
		return usuario;
	}



	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public long getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(long idusuario) {
		this.idusuario = idusuario;
	}



	public String getApematerno() {
		return this.apematerno;
	}

	public void setApematerno(String apematerno) {
		this.apematerno = apematerno;
	}

	public String getApepaterno() {
		return this.apepaterno;
	}

	public void setApepaterno(String apepaterno) {
		this.apepaterno = apepaterno;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Mascota getMascota() {
		return this.mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public Perfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Ubigeo getUbigeo() {
		return this.ubigeo;
	}

	public void setUbigeo(Ubigeo ubigeo) {
		this.ubigeo = ubigeo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	

}