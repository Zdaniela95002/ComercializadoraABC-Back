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
	int codProducto;
	@Column 
	String nombre;
	@Column 
	int precio;
	@Column 
	int stock;
	
	public Producto() {}

	public int getcodProducto() {
		return codProducto;
	}
	public void setcodProducto (int codProducto) {
		this.codProducto = codProducto;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public int getcodPrecio() {
		return precio;
	}
	public void setPrecio (int precio) {
		this.precio = precio;
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock (int stock) {
		this.stock = stock;
	}
	

}
