package com.tienda.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;


/**
 * The persistent class for the kardex database table.
 * 
 */
@Entity
@Table(name = "kardex")
@NamedQuery(name="Kardex.findAll", query="SELECT k FROM Kardex k")
public class Kardex implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String detalle;

	@Column(name="ent_catidad")
	private Integer entCatidad;

	@Column(name="ent_valor_total")
	private BigDecimal entValorTotal;

	@Column(name="ent_valor_unitario")
	private BigDecimal entValorUnitario;

	@Column(name="exi_catidad")
	private Integer exiCatidad;

	@Column(name="exi_valor_total")
	private BigDecimal exiValorTotal;

	@Column(name="exi_valor_unitario")
	private BigDecimal exiValorUnitario;

	private Timestamp fecha;

	@Column(name="id_catologo")
	private Integer idCatologo;

	@Column(name="sal_catidad")
	private Integer salCatidad;

	@Column(name="sal_valor_total")
	private BigDecimal salValorTotal;

	@Column(name="sal_valor_unitario")
	private BigDecimal salValorUnitario;

	@Column(name="stock_minimo")
	private Integer stockMinimo;

	@Transient
	@Getter
	@Setter
	private String tipoKardex;
	
	public Kardex() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDetalle() {
		return this.detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Integer getEntCatidad() {
		return this.entCatidad;
	}

	public void setEntCatidad(Integer entCatidad) {
		this.entCatidad = entCatidad;
	}

	public BigDecimal getEntValorTotal() {
		return this.entValorTotal;
	}

	public void setEntValorTotal(BigDecimal entValorTotal) {
		this.entValorTotal = entValorTotal;
	}

	public BigDecimal getEntValorUnitario() {
		return this.entValorUnitario;
	}

	public void setEntValorUnitario(BigDecimal entValorUnitario) {
		this.entValorUnitario = entValorUnitario;
	}

	public Integer getExiCatidad() {
		return this.exiCatidad;
	}

	public void setExiCatidad(Integer exiCatidad) {
		this.exiCatidad = exiCatidad;
	}

	public BigDecimal getExiValorTotal() {
		return this.exiValorTotal;
	}

	public void setExiValorTotal(BigDecimal exiValorTotal) {
		this.exiValorTotal = exiValorTotal;
	}

	public BigDecimal getExiValorUnitario() {
		return this.exiValorUnitario;
	}

	public void setExiValorUnitario(BigDecimal exiValorUnitario) {
		this.exiValorUnitario = exiValorUnitario;
	}

	public Timestamp getFecha() {
		return this.fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public Integer getIdCatologo() {
		return this.idCatologo;
	}

	public void setIdCatologo(Integer idCatologo) {
		this.idCatologo = idCatologo;
	}

	public Integer getSalCatidad() {
		return this.salCatidad;
	}

	public void setSalCatidad(Integer salCatidad) {
		this.salCatidad = salCatidad;
	}

	public BigDecimal getSalValorTotal() {
		return this.salValorTotal;
	}

	public void setSalValorTotal(BigDecimal salValorTotal) {
		this.salValorTotal = salValorTotal;
	}

	public BigDecimal getSalValorUnitario() {
		return this.salValorUnitario;
	}

	public void setSalValorUnitario(BigDecimal salValorUnitario) {
		this.salValorUnitario = salValorUnitario;
	}

	public Integer getStockMinimo() {
		return this.stockMinimo;
	}

	public void setStockMinimo(Integer stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

}