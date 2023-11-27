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
@Table(name="tb_pedido")
@Data
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int idpedido;
	 int idtienda;
	 int idalmacenero;
	 int cantidadproductos;
	 double montototal;
	 Date fechapedido;
	 int estado;
	 
	 @ManyToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name = "idtienda", insertable = false, updatable = false)
	 private Tienda objTienda;
	 
	 @ManyToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name="idalmacenero", insertable= false, updatable = false)
	 private Almacenero objAlma;
	 

}
