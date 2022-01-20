package com.tienda.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * The persistent class for the Producto database table.
 * 
 */
@Entity
@Table(name = "producto")
@NamedQuery(name = "Producto.findAll", query = "SELECT c FROM Producto c")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id 
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Getter
	@Setter
	private int id;
	
	@Getter
	@Setter
	private String nombre;

	@Getter
	@Setter
	private String descripcion;

	@Getter
	@Setter
	private String estado;

	public Producto() {
	}

}