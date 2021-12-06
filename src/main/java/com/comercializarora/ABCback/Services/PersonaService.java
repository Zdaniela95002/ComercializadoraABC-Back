package com.comercializarora.ABCback.Services;

import java.util.ArrayList;
import java.util.Optional;
import com.comercializarora.ABCback.Repositories.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.comercializarora.ABCback.Entities.Persona;

@Service
public class PersonaService 
{
	@Autowired
	PersonaRepositorio personaRepositorio;
	
	public ArrayList<Persona> obtenerPersonas()
	{
		return (ArrayList<Persona>) personaRepositorio.findAll();
	}
	
	public Persona guardarPersona(Persona persona)
	{
		return personaRepositorio.save(persona);
	}
	
	public Optional<Persona> obtenerporId(int id)
	{
		return personaRepositorio.findById(id);
	}

	public boolean eliminarPersona(int id) 
	{
		try
		{
			personaRepositorio.deleteById(id);
			return true;
		}
		catch (Exception err) {
			return false;
		}

	}
	
}
