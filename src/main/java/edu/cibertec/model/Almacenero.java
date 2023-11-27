package edu.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="tb_almacenero")
public class Almacenero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int idalmacenero;
	private  String clave;
	private String nomalmacenero;
	private String apealmacenero;
	private int dnialmacenero;
	private String direccionalmacenero;
	private int telefono;
	private String email;
	
	public Almacenero() {
		super();
	}

	public Almacenero(int idalmacenero, String clave, String nomalmacenero, String apealmacenero, int dnialmacenero,
			String direccionalmacenero, int telefono, String email) {
		super();
		this.idalmacenero = idalmacenero;
		this.clave = clave;
		this.nomalmacenero = nomalmacenero;
		this.apealmacenero = apealmacenero;
		this.dnialmacenero = dnialmacenero;
		this.direccionalmacenero = direccionalmacenero;
		this.telefono = telefono;
		this.email = email;
	}
	
	public int getIdalmacenero() {
		return idalmacenero;
	}
	public void setIdalmacenero(int idalmacenero) {
		this.idalmacenero = idalmacenero;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNomalmacenero() {
		return nomalmacenero;
	}
	public void setNomalmacenero(String nomalmacenero) {
		this.nomalmacenero = nomalmacenero;
	}
	public String getApealmacenero() {
		return apealmacenero;
	}
	public void setApealmacenero(String apealmacenero) {
		this.apealmacenero = apealmacenero;
	}
	public int getDnialmacenero() {
		return dnialmacenero;
	}
	public void setDnialmacenero(int dnialmacenero) {
		this.dnialmacenero = dnialmacenero;
	}
	public String getDireccionalmacenero() {
		return direccionalmacenero;
	}
	public void setDireccionalmacenero(String direccionalmacenero) {
		this.direccionalmacenero = direccionalmacenero;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
