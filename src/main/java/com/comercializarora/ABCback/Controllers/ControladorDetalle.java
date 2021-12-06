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

import com.comercializarora.ABCback.Entities.Detalle;
import com.comercializarora.ABCback.Services.DetalleService;

@RestController
@RequestMapping({"/detalle"})
public class ControladorDetalle
{
	@Autowired
	DetalleService service;
	
	@GetMapping()
	public ArrayList<Detalle>listar()
	{
		return service.obtenerDetalles();
	}
	
	@PostMapping()
	public Detalle agregarDetalle(@RequestBody Detalle p) 
	{
		return service.guardarDetalle(p);
	}
	
	@GetMapping(path= "/{codDetalle}")
	public Optional<Detalle>ObtenerUsuarioPorId(@PathVariable("codDetalle") int codDetalle)
	{
		return this.service.obtenerporId(codDetalle);
	}
		
	@DeleteMapping(path= "/{codDetalle}")
	public String eliminarporId(@PathVariable("codDetalle") int codDetalle) 
	{
		boolean ok= this.service.eliminarDetalles(codDetalle);
		if (ok)
		{
			return "Se eliminó el registro " +codDetalle;
		}
		else
		{
			return "No se eliminó el registro " +codDetalle;
		}
			
	}

}
