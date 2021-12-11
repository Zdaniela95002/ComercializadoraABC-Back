package com.comercializarora.ABCback.Repositories;


import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.comercializarora.ABCback.Entities.Detalle;

@Repository
public interface DetalleRepositorio extends CrudRepository<Detalle,Integer>{

	//public abstract ArrayList<Detalle> findByPedido(int pedido);
}
