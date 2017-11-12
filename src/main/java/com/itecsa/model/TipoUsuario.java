package com.itecsa.model;

import java.util.Date;

public class TipoUsuario {

	private int idTipoUsuario;
	private String Nombre;
	private String Descripcion;
	private int Estatus;
	private Date FechaCreacion;
	public int getIdTipoUsuario() {
		return idTipoUsuario;
	}
	public void setIdTipoUsuario(int idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public int getEstatus() {
		return Estatus;
	}
	public void setEstatus(int estatus) {
		Estatus = estatus;
	}
	public Date getFechaCreacion() {
		return FechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}
	
	
	
}
