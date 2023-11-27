package edu.cibertec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tb_detalle_pedido")
@Data
public class DetallePedido {
	@Id
	int idpedido;
	int codprod;
	int cantidad;
	double precioventa;
	double montototal;
	
	 @ManyToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name = "codprod", insertable = false, updatable = false)
	 private Productos objProdu;
	 
	 @ManyToOne(fetch = FetchType.EAGER)
	 @JoinColumn(name = "idpedido", insertable = false, updatable = false)
	 private Pedido objPedi;
}
