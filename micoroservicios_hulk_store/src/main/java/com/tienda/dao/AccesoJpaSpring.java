package com.tienda.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.tienda.model.Producto;

public interface AccesoJpaSpring extends JpaRepository<Producto, Integer> {
	Producto findByNombre(String nombre);

	@Transactional
	@Modifying
	@Query("Delete from Producto c Where c.nombre=?1")
	void eliminarProducto(String nombre);
}
