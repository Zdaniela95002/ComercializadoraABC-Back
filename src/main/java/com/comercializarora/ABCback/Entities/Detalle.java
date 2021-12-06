package com.comercializarora.ABCback.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detallepedido")
public class Detalle 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column() 
	int codDetalle;
	@Column() 
	int codPedido;
	@Column() 
	int codProducto;
	@Column() 
	int cantidad;
	@Column() 
	int precio;
	
	public Detalle() {}

	public int getCodDetalle() {
		return codDetalle;
	}
	public void setCodDetalle(int codDetalle) {
		this.codDetalle = codDetalle;
	}
	
	public int getCodPedido() {
		return codPedido;
	}
	public void setCodPedido(int codPedido) {
		this.codPedido = codPedido;
	}

	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
