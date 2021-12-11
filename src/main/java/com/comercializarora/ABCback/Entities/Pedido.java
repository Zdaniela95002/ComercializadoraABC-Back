package com.comercializarora.ABCback.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pedido")

public class Pedido 
{
	@Id
	@Column() 
	int CodPedido;
	@Column() 
	int identificacionCliente;
	@Column() 
	String fechaPedido;
	
	public Pedido() {}
	
	public int getIdentificacionCliente() {
		return identificacionCliente;
	}
	public void setIdentificacionCliente(int identificacionCliente) {
		this.identificacionCliente = identificacionCliente;
	}
	
	public String getfechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public int getCodPedido() {
		return CodPedido;
	}
	public void setCodPedido(int CodPedido) {
		this.CodPedido = CodPedido;
	}



	
	
}
