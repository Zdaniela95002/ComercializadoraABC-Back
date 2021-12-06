package com.comercializarora.ABCback.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comercializarora.ABCback.Entities.Pedido;
import com.comercializarora.ABCback.Services.PedidoService;

@RestController
@RequestMapping({"/pedido"})
public class ControladorPedido 
{
	@Autowired
	PedidoService service;
	
	@GetMapping()
	public ArrayList<Pedido>listar()
	{
		return service.obtenerPersonas();
	}
	
	@PostMapping()
	public Pedido agregarPersona(@RequestBody Pedido p) 
	{
		return service.guardarPedido(p);
	}
	
	@GetMapping(path= "/{codPedido}")
	public Optional<Pedido>ObtenerUsuarioPorId(@PathVariable("codPedido") int codPedido)
	{
		return this.service.obtenerporId(codPedido);
	}
	
	@DeleteMapping(path= "/{id}")
	public String eliminarporId(@PathVariable("codPedido") int codPedido) 
	{
		boolean ok= this.service.eliminarPedido(codPedido);
		if (ok)
		{
			return "Se eliminó el registro " +codPedido;
		}
		else
		{
			return "No se eliminó el registro " +codPedido;
		}
			
	}


}
