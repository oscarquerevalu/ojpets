package com.ojpets.services.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the mapa database table.
 * 
 */
@Entity
@NamedQuery(name="Mapa.findAll", query="SELECT m FROM Mapa m")
public class Mapa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idmapa;

	private BigDecimal latitud;

	private BigDecimal longitud;

	private String lugar;

	//bi-directional many-to-one association to Ubigeo
	@OneToMany(mappedBy="mapa")
	private List<Ubigeo> ubigeos;

	public Mapa() {
	}

	public long getIdmapa() {
		return idmapa;
	}


	public void setIdmapa(long idmapa) {
		this.idmapa = idmapa;
	}


	public BigDecimal getLatitud() {
		return this.latitud;
	}

	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
	}

	public BigDecimal getLongitud() {
		return this.longitud;
	}

	public void setLongitud(BigDecimal longitud) {
		this.longitud = longitud;
	}

	public String getLugar() {
		return this.lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public List<Ubigeo> getUbigeos() {
		return this.ubigeos;
	}

	public void setUbigeos(List<Ubigeo> ubigeos) {
		this.ubigeos = ubigeos;
	}

	public Ubigeo addUbigeo(Ubigeo ubigeo) {
		getUbigeos().add(ubigeo);
		ubigeo.setMapa(this);

		return ubigeo;
	}

	public Ubigeo removeUbigeo(Ubigeo ubigeo) {
		getUbigeos().remove(ubigeo);
		ubigeo.setMapa(null);

		return ubigeo;
	}

}