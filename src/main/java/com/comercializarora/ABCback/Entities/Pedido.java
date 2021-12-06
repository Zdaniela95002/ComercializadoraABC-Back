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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column() 
	int CodPedido;
	@Column() 
	int idCliente;
	@Column() 
	String fechaPedido;
	
	public Pedido() {}

	public int getCodPedido() {
		return CodPedido;
	}
	public void setCodPedido(int CodPedido) {
		this.CodPedido = CodPedido;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public String getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	
}
