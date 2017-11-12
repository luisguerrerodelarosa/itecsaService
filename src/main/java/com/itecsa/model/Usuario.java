package com.itecsa.model;

import java.util.Date;

public class Usuario {

	private int idUsuario;
	private String usuarioApp;
	private String nombreUsuario;
	private String apellidoUsuario;
	private String contrasena;
	private int estatusUsuario;
	private int idTipoUsuario;
	private Date fechaCreacion;
	private TipoUsuario tipoUsuario;
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsuarioApp() {
		return usuarioApp;
	}
	public void setUsuarioApp(String usuarioApp) {
		this.usuarioApp = usuarioApp;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getApellidoUsuario() {
		return apellidoUsuario;
	}
	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public int getEstatusUsuario() {
		return estatusUsuario;
	}
	public void setEstatusUsuario(int estatusUsuario) {
		this.estatusUsuario = estatusUsuario;
	}
	public int getIdTipoUsuario() {
		return idTipoUsuario;
	}
	public void setIdTipoUsuario(int idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	
}
