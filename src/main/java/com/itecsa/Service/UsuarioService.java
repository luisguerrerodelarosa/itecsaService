package com.itecsa.Service;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itecsa.configuracion.Utils;
import com.itecsa.logic.UsuarioL;
import com.itecsa.model.Usuario;

@RestController
public class UsuarioService {

	Utils utils = new Utils();
	UsuarioL userL = new UsuarioL();
	@RequestMapping(value="/Usuario/insert/", method = RequestMethod.POST)
	public String insert(@RequestBody Usuario user) {//REST Endpoint.
		int resultado;
		try {
			resultado = userL.insertUser(user);
			switch(resultado){
				case 1: break;
				case 0: break;
				default: break;
			}
		} catch (Exception e) {
			return null;
		}
		return "";
	}
	@RequestMapping(value="/Usuario/update/", method = RequestMethod.POST)
	public String update(@RequestBody Usuario user) {//REST Endpoint.
		
		return null;
	}
	@RequestMapping("/Usuario/getAll")
	public String getAll() {//REST Endpoint.
		ArrayList<Usuario> usuarios;
		try {
			usuarios = userL.getAllUsers();
			if(usuarios == null){
				
			}else{
				if(usuarios.isEmpty()){
					
				}else{
					
				}
			}
		} catch (Exception e) {
			return null;
		}
		return null;
	}
	
	@RequestMapping(value="/Usuario/getUser/", method = RequestMethod.POST)
	public String getId(@RequestBody Usuario user) {//REST Endpoint.
		Usuario u;
		try {
			u = userL.getUser(user.getUsuarioApp());
			if(u == null){
				if(u.getContrasena().trim().equals(user.getContrasena().trim())){
					
				}else{
					
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
