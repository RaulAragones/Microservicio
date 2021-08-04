package com.webUsuario.Usuarios;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UsuariosExternos")
public class usuarioExterno {
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmpresaExtena() {
		return empresaExtena;
	}
	public void setEmpresaExtena(String empresaExtena) {
		this.empresaExtena = empresaExtena;
	}
	public String getTipoUsuarioExterno() {
		return tipoUsuarioExterno;
	}
	public void setTipoUsuarioExterno(String tipoUsuarioExterno) {
		this.tipoUsuarioExterno = tipoUsuarioExterno;
	}
	public String getAreaUsuarioExterno() {
		return areaUsuarioExterno;
	}
	public void setAreaUsuarioExterno(String areaUsuarioExterno) {
		this.areaUsuarioExterno = areaUsuarioExterno;
	}
	
	public usuarioExterno() {}
	public usuarioExterno(int id, String nombreUsuario, String apellidoUsuario, String empresaExtena,
			String tipoUsuarioExterno, String areaUsuarioExterno) {
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.empresaExtena = empresaExtena;
		this.tipoUsuarioExterno = tipoUsuarioExterno;
		this.areaUsuarioExterno = areaUsuarioExterno;
	}
	
	@Id
	public int 	id;
	public String nombreUsuario;
	public String apellidoUsuario;
	public String empresaExtena;
	public String tipoUsuarioExterno;	
	public String areaUsuarioExterno;
	
	
	
	
}
