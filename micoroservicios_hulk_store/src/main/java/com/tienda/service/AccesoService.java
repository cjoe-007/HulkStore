package com.tienda.service;

import java.util.List;

import com.tienda.model.Kardex;
import com.tienda.model.Producto;

public interface AccesoService {
	List<Producto> recuperarProductos();

	Kardex buscarUltimoKardex(int idProducto);

	List<Kardex> devolverKardex();

	void guardarKardex(Kardex kardex);
}
