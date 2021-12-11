package com.comercializarora.ABCback.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.comercializarora.ABCback.Entities.Persona;
import com.comercializarora.ABCback.Services.PersonaService;
import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping({"/ABCback/persona"})

public class ControladorPersona 
{

	@Autowired
	PersonaService service;
	
	@GetMapping()
	public ArrayList<Persona>listar()
	{
		return service.obtenerPersonas();
	}
	
	@PostMapping()
	public Persona agregarPersona(@RequestBody Persona p) 
	{
		return service.guardarPersona(p);
	}
	
	@GetMapping(path= "/{identificacion}")
	public Optional<Persona>ObtenerUsuarioPorId(@PathVariable("identificacion") int identificacion)
	{
		return this.service.obtenerporId(identificacion);
	}
	
	//@GetMapping("/query")
//	public ArrayList<Persona>ObtenerUsuarioPorPrioridad(@RequestParam("prioridad") int prioridad)
//	{
//		return this.service.obtenerporPrioridad(prioridad);
//	}
	
	@DeleteMapping(path= "/{id}")
	public String eliminarporId(@PathVariable("id") int id) 
	{
		boolean ok= this.service.eliminarPersona(id);
		if (ok)
		{
			return "Se eliminó el registro " +id;
		}
		else
		{
			return "No se eliminó el registro " +id;
		}
			
	}

}
