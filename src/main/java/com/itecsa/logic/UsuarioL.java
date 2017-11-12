package com.itecsa.logic;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.itecsa.model.*;
import com.itecsa.configuracion.Conexion;

public class UsuarioL {
	Conexion conn = new Conexion();
	private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    String query="";
	public int insertUser(Usuario u){
	     query="INSERT INTO Usuario(UsuarioApp,Nombre,Apellido,Contrasena,IdTipoUsuario)"
				+ " VALUES(?,?,?,?,?)";
		int resultado=-1;
		try {
			preparedStatement =conn.getConexion().prepareStatement(query);
			preparedStatement.setString(1, u.getUsuarioApp());
			preparedStatement.setString(2, u.getNombreUsuario());
			preparedStatement.setString(3, u.getApellidoUsuario());
			preparedStatement.setString(4, u.getContrasena());
			preparedStatement.setInt(5, u.getIdTipoUsuario());
			resultado = preparedStatement.executeUpdate();
			if(resultado > 0){
				return 1;
			}else{
				return 0;
			}
		} catch (Exception e) {
			return -1;
		}finally{
			close();
		}
	}
	public void updateUser(){
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			close();
		}
	}
	public void deleteUser(){
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			close();
		}
	}
	
	public ArrayList<Usuario> getAllUsers(){
		query ="SELECT * FROM Usuario";
		ArrayList<Usuario> usuarios;
		TipoUsuarioL tipoUsuario = new TipoUsuarioL();
		Usuario u;
		try {
			usuarios = new ArrayList<Usuario>();
			statement = conn.getConexion().createStatement();
			 resultSet = statement
	                    .executeQuery(query);
			 while(resultSet.next()){
				 u = new Usuario();
				 u.setUsuarioApp(resultSet.getString("UsuarioApp"));
				 u.setNombreUsuario(resultSet.getString("Nombre"));
				 u.setApellidoUsuario(resultSet.getString("Apellido"));
				 u.setEstatusUsuario(resultSet.getInt("Estatus"));
				 u.setIdTipoUsuario(resultSet.getInt("IdTipoUsuario"));
				 u.setFechaCreacion(resultSet.getDate("fechaCreacion"));
				 u.setTipoUsuario(tipoUsuario.getTipoUsuarioById(u.getIdTipoUsuario()));
				 usuarios.add(u);
			 }
		} catch (Exception e) {
			return new ArrayList<Usuario>();
		}finally{
			close();
		}
		return usuarios;
	}
	public Usuario getUser(String user){
		Usuario u = null;
		TipoUsuarioL tipoUsuario = new TipoUsuarioL();
		try {
			
			query ="SELECT * FROM Usuario WHERE UsuarioApp='"+user+"'";
			statement = conn.getConexion().createStatement();
			resultSet = statement.executeQuery(query);
			 while(resultSet.next()){
				 u = new Usuario();
				 u.setUsuarioApp(resultSet.getString("UsuarioApp"));
				 u.setNombreUsuario(resultSet.getString("Nombre"));
				 u.setApellidoUsuario(resultSet.getString("Apellido"));
				 u.setEstatusUsuario(resultSet.getInt("Estatus"));
				 u.setIdTipoUsuario(resultSet.getInt("IdTipoUsuario"));
				 u.setFechaCreacion(resultSet.getDate("fechaCreacion"));
				 u.setTipoUsuario(tipoUsuario.getTipoUsuarioById(u.getIdTipoUsuario()));
			 }            
		} catch (Exception e) {
			return null;
		}finally{
			close();
		}
		return u;
	}
	private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (conn.getConexion() != null) {
            	conn.getConexion();
            }
        } catch (Exception e) {

        }
    }

}
