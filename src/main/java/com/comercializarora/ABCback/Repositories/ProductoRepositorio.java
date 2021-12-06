package com.comercializarora.ABCback.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.comercializarora.ABCback.Entities.Producto;

@Repository
public interface ProductoRepositorio extends CrudRepository<Producto,Integer>
{

}
