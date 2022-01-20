package com.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tienda.model.Kardex;

public interface KardexJpaSpring extends JpaRepository<Kardex, Integer> {

	@Query(nativeQuery = true, value = "SELECT * FROM Kardex k where k.id_Catologo=?1 and k.fecha = (SELECT max(k.fecha) FROM Kardex k) ORDER BY id DESC limit 1")
	Kardex buscarUltimoKardex(int idProducto);
}
