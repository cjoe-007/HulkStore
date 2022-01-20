package com.tienda.dao;

import java.util.List;

import com.tienda.model.Kardex;
import com.tienda.model.Producto;

public interface AccesoDao {

	List<Producto> devolverProductos();

	Kardex buscarUltimoKardex(int idProducto);

	List<Kardex> devolverKardex();

	void guardarKardex(Kardex kardex);
}
