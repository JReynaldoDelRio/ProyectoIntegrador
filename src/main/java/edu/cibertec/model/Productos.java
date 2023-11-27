package edu.cibertec.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="tb_productos")
@Data
public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codprod;
	String descripcion;
	int stock;
	double preciocompra;
	double precioventa;
	int idproveedor;
	Date fechaingreso;
	
	 @ManyToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name = "idproveedor", insertable = false, updatable = false)
	 private Proveedor objProve;
}
