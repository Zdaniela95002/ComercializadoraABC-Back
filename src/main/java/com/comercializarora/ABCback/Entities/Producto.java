package com.comercializarora.ABCback.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")

public class Producto
{
	@Id
	@Column() 
	int codproducto;
	@Column 
	String nombre;
	@Column 
	int codPrecio;
	@Column 
	int stock;
	
	public Producto() {}

	public int getcodProducto() {
		return codproducto;
	}
	public void setcodProducto (int codproducto) {
		this.codproducto = codproducto;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public int getcodPrecio() {
		return codPrecio;
	}
	public void setcodPrecio (int codPrecio) {
		this.codPrecio = codPrecio;
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock (int stock) {
		this.stock = stock;
	}
	

}
