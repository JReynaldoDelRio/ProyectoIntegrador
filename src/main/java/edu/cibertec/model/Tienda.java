package edu.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Table(name="tb_tienda")
@Entity
@Data
public class Tienda {
	@Id
	int idtienda;
	String nomtienda;
	String direccion;
	int telefono;
}
