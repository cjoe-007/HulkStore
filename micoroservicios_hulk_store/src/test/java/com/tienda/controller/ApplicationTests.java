package com.tienda.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import inicio.Application;

@AutoConfigureMockMvc
@SpringBootTest(classes = Application.class)
@TestMethodOrder(OrderAnnotation.class)
class ApplicationTests {

	@Autowired
	MockMvc mock;

	@Test
	@Order(0)
	void testRecuperarProductos() throws Exception {
		mock.perform(get("/productos")).andDo(print());
	}

	@Test
	@Order(1)
	void testBuscarUltimoKardex() throws Exception {
		mock.perform(get("/kardex/1")).andDo(print());
	}

	@Test
	@Order(2)
	void testDevolverkardex() throws Exception {
		mock.perform(get("/kardex")).andDo(print());
	}
	
	@Test
	@Order(3)
	void guardarKardex() throws Exception{
		mock.perform(post("/guardarKardex")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"idCatologo\":\"1\",\"detalle\":\"Prueba\",\"tipoKardex\":\"Entrada\",\"entCatidad\":\"10\",\"entValorUnitario\":\"2\",\"entValorTotal\":\"20\"}")
				).andDo(print());
	}
	
	@Test
	@Order(4)
	void guardarKardexSalida() throws Exception{
		mock.perform(post("/guardarKardex")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"idCatologo\":\"1\",\"detalle\":\"Prueba\",\"tipoKardex\":\"Salida\",\"salCatidad\":\"10\",\"salValorUnitario\":\"2\",\"salValorTotal\":\"20\"}")
				).andDo(print());
	}
}
