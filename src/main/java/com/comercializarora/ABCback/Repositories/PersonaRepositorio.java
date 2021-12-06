package com.comercializarora.ABCback.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.comercializarora.ABCback.Entities.Persona;

@Repository
public interface PersonaRepositorio extends CrudRepository<Persona,Integer>
 {
	//public abstract ArrayList<Persona> findByPrioridad(Integer prioridad);
}
 