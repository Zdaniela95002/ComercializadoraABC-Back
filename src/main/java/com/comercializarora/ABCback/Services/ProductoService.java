package com.comercializarora.ABCback.Services;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.comercializarora.ABCback.Entities.Producto;
import com.comercializarora.ABCback.Repositories.ProductoRepositorio;

@Service
public class ProductoService
{
	@Autowired
	ProductoRepositorio productoRepositorio;
	
	public ArrayList<Producto> obtenerProductos()
	{
		return (ArrayList<Producto>) productoRepositorio.findAll();
	}
	
	public Producto guardarProducto(Producto producto)
	{
		return productoRepositorio.save(producto);
	}
	
	public Optional<Producto> obtenerporCod(int cod)
	{
		return productoRepositorio.findById(cod);
	}

	public boolean eliminarProducto(int cod) 
	{
		try
		{
			productoRepositorio.deleteById(cod);
			return true;
		}
		catch (Exception err) {
			return false;
		}

	}

}
