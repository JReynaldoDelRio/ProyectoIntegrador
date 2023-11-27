package edu.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tb_proveedor")
@Data
public class Proveedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idproveedor;
	String nomprove;
	String apeprove;
	int dniprove;
	int rucprove;
	int telefono;
	String email;
	String direccion;
	
}
