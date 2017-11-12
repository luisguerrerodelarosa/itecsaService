package com.itecsa.logic;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.itecsa.configuracion.Conexion;
import com.itecsa.model.TipoUsuario;
import com.itecsa.model.Usuario;


public class TipoUsuarioL {
	Conexion conn = new Conexion();
	private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    String query="";
    
    
    public void insertTipoUsuario(TipoUsuario t){
	     query="INSERT INTO TipoUsuario(Nombre,Descripcion)"
				+ " VALUES(?,?)";
		int resultado=-1;
		try {
			preparedStatement =conn.getConexion().prepareStatement(query);
			preparedStatement.setString(1, t.getNombre());
			preparedStatement.setString(2, t.getDescripcion());
			resultado = preparedStatement.executeUpdate();
			if(resultado > 0){
				
			}
		} catch (Exception e) {
			
		}finally{
			close();
		}
	}
    public ArrayList<TipoUsuario> getAllTipoUsuario(){
    	query ="SELECT * FROM TipoUsuario";
		ArrayList<TipoUsuario> tipoUsuario;
		TipoUsuario t;
		try {
			tipoUsuario = new ArrayList<TipoUsuario>();
			statement = conn.getConexion().createStatement();
			 resultSet = statement
	                    .executeQuery(query);
			 while(resultSet.next()){
				 t = new TipoUsuario();
				 t.setIdTipoUsuario(resultSet.getInt("idTipoUsuario"));
				 t.setNombre(resultSet.getString("Nombre"));
				 t.setDescripcion(resultSet.getString("Descripcion"));
				 t.setEstatus(resultSet.getInt("Estatus"));
				 t.setFechaCreacion(resultSet.getDate("FechaCreacion"));
				 tipoUsuario.add(t);
			 }
		} catch (Exception e) {
			return new ArrayList<TipoUsuario>();
		}finally{
			close();
		}
		return tipoUsuario;
    }
    public TipoUsuario getTipoUsuarioById(int idTipoUsuario){
    	TipoUsuario t;
    	query ="SELECT * FROM TipoUsuario WHERE idTipoUsuario =";
    	try {
    		t = new TipoUsuario();
    		statement = conn.getConexion().createStatement();
			 resultSet = statement
	                    .executeQuery(query);
			 while(resultSet.next()){
				 t.setIdTipoUsuario(resultSet.getInt("idTipoUsuario"));
				 t.setNombre(resultSet.getString("Nombre"));
				 t.setDescripcion(resultSet.getString("Descripcion"));
				 t.setEstatus(resultSet.getInt("Estatus"));
				 t.setFechaCreacion(resultSet.getDate("FechaCreacion"));
			 }
		} catch (Exception e) {
			return null;
		}finally{
			close();
		}
    	return t;
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
