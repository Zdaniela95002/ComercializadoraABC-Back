package com.comercializarora.ABCback.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comercializarora.ABCback.Entities.Detalle;
import com.comercializarora.ABCback.Repositories.DetalleRepositorio;

@Service
public class DetalleService
{
	@Autowired
	DetalleRepositorio detalleRepositorio;
	
	public ArrayList<Detalle> obtenerDetalles()
	{
		return (ArrayList<Detalle>) detalleRepositorio.findAll();
	}
	
	public Detalle guardarDetalle(Detalle detalle)
	{
		return detalleRepositorio.save(detalle);
	}
	
	public Optional<Detalle> obtenerporId(int cod)
	{
		return detalleRepositorio.findById(cod);
	}

	public boolean eliminarDetalles(int cod) 
	{
		try
		{
			detalleRepositorio.deleteById(cod);
			return true;
		}
		catch (Exception err) {
			return false;
		}

	}

}
