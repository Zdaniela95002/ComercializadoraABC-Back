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

import com.comercializarora.ABCback.Entities.Producto;
import com.comercializarora.ABCback.Services.ProductoService;

@RestController
@RequestMapping({"/producto"})
public class ControladorProducto
{
	@Autowired
	ProductoService service;
	
	@GetMapping()
	public ArrayList<Producto>listar()
	{
		return service.obtenerProductos();
	}
	
	@PostMapping()
	public Producto agregarProducto(@RequestBody Producto p) 
	{
		return service.guardarProducto(p);
	}
	
	@GetMapping(path= "/{codProducto}")
	public Optional<Producto>ObtenerUsuarioPorId(@PathVariable("codProducto") int codigo)
	{
		return this.service.obtenerporCod(codigo);
	}
	
	
	@DeleteMapping(path= "/{codProducto}")
	public String eliminarporId(@PathVariable("codProducto") int codigo) 
	{
		boolean ok= this.service.eliminarProducto(codigo);
		if (ok)
		{
			return "Se eliminó el registro " +codigo;
		}
		else
		{
			return "No se eliminó el registro " +codigo;
		}
			
	}

}
