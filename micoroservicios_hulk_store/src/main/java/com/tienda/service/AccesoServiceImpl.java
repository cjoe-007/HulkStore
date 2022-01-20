package com.tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.dao.AccesoDao;
import com.tienda.model.Kardex;
import com.tienda.model.Producto;

@Service
public class AccesoServiceImpl implements AccesoService {

	@Autowired
	AccesoDao dao;

	@Override
	public List<Producto> recuperarProductos() {
		return dao.devolverProductos();
	}

	@Override
	public Kardex buscarUltimoKardex(int idProducto) {
		return dao.buscarUltimoKardex(idProducto);
	}

	@Override
	public List<Kardex> devolverKardex() {
		return dao.devolverKardex();
	}

	public void guardarKardex(Kardex kardex){
		dao.guardarKardex(kardex);
	}
}
