/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.itecsa.configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

	Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    
    String url = "jdbc:mysql://localhost:3307/itecsa";
    String user = "root";
    String password = "";
    
    public Conexion(){
    	try {
    		try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}
    }
    public Connection getConexion(){
    	return  con;
    	
    }
    

}
