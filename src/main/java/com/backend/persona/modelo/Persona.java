package com.backend.persona.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="persona")
@Entity

public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo_persona")
	private long Codigo_Persona;
	@Column(name = "cedula")
	private String Cedula;
	
	@Column(name = "nombres")
	private String Nombre;
	@Column(name = "apellidos")
	private String Apellidos;
	@Column(name = "estatura")
	private int Estatura;
	
	public long getCodigo_Persona() {
		return Codigo_Persona;
	}
	public void setCodigo_Persona(long codigo_Persona) {
		Codigo_Persona = codigo_Persona;
	}
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public int getEstatura() {
		return Estatura;
	}
	public void setEstatura(int estatura) {
		Estatura = estatura;
	}
	
	


}
