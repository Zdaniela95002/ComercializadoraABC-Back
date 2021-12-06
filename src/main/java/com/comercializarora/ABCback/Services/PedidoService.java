package com.comercializarora.ABCback.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.comercializarora.ABCback.Entities.Pedido;
import com.comercializarora.ABCback.Repositories.PedidoRepositorio;

@Service
public class PedidoService 
{
	@Autowired
	PedidoRepositorio pedidoRepositorio;
	
	public ArrayList<Pedido> obtenerPersonas()
	{
		return (ArrayList<Pedido>) pedidoRepositorio.findAll();
	}
	
	public Pedido guardarPedido(Pedido Pedido)
	{
		return pedidoRepositorio.save(Pedido);
	}
	
	public Optional<Pedido> obtenerporId(int cod)
	{
		return pedidoRepositorio.findById(cod);
	}

	public boolean eliminarPedido(int cod) 
	{
		try
		{
			pedidoRepositorio.deleteById(cod);
			return true;
		}
		catch (Exception err) {
			return false;
		}

	}

}
