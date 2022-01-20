package com.tienda.controller;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.enums.TipoKardex;
import com.tienda.model.Kardex;
import com.tienda.model.Producto;
import com.tienda.service.AccesoService;

@CrossOrigin(origins = "*")
@RestController
public class DatosController {
	
	Logger logger = LoggerFactory.getLogger(DatosController.class);
	
	@Autowired
	AccesoService service;

	@GetMapping(value = "productos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> recuperarProductos() {
		return service.recuperarProductos();
	}

	@GetMapping(value = "kardex/{idProducto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Kardex buscarUltimoKardex(@PathVariable("idProducto") int idProducto) {
		return service.buscarUltimoKardex(idProducto);
	}

	@GetMapping(value = "kardex", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Kardex> devolverKardex() {
		return service.devolverKardex();
	}

	@PostMapping(value = "guardarKardex", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void generarReserva(@RequestBody Kardex kardex) {
		try {
			kardex.setFecha(new Timestamp(System.currentTimeMillis()));
			Kardex ultimoKardex = service.buscarUltimoKardex(kardex.getIdCatologo());
			if (kardex.getTipoKardex().equals(TipoKardex.Entrada.name())) {
				kardex.setExiCatidad(ultimoKardex.getExiCatidad() + kardex.getEntCatidad());
				kardex.setExiValorUnitario(kardex.getEntValorUnitario());
				kardex.setExiValorTotal(BigDecimal.valueOf(kardex.getExiCatidad()).multiply(kardex.getExiValorUnitario()));
			} else {
				kardex.setExiCatidad(ultimoKardex.getExiCatidad() - kardex.getSalCatidad());
				kardex.setExiValorUnitario(kardex.getSalValorUnitario());
				kardex.setExiValorTotal(BigDecimal.valueOf(kardex.getExiCatidad()).multiply(kardex.getExiValorUnitario()));
			}
			service.guardarKardex(kardex);
		} catch (Exception e) {
			System.out.println(e);
			logger.error(e.getMessage());
		}
		
	}
}
