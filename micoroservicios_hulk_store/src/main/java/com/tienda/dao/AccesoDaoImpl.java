package com.tienda.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tienda.model.Kardex;
import com.tienda.model.Producto;

@Repository
public class AccesoDaoImpl implements AccesoDao {

	@Autowired
	AccesoJpaSpring acceso;

	@Autowired
	KardexJpaSpring accesoKardex;

	@Override
	public List<Producto> devolverProductos() {
		return acceso.findAll();
	}

	@Override
	public Kardex buscarUltimoKardex(int idProducto) {
		return accesoKardex.buscarUltimoKardex(idProducto);
	}

	@Override
	public List<Kardex> devolverKardex() {
		return accesoKardex.findAll();
	}
	
	@Override
	public void guardarKardex(Kardex kardex) {
		accesoKardex.save(kardex);
	}

}
