package edu.cibertec.service;

import java.util.List;

import edu.cibertec.model.DetallePedido;


public interface DetallesPedidoService {
	
	public DetallePedido obtenerDetalle(int idpedido);
	public List<DetallePedido>listaDetalle();
	public DetallePedido ingresarDetalle(DetallePedido objDetalle);
	public DetallePedido actualizarDetalle(DetallePedido objDetalle);
	public void eliminarDetalle(DetallePedido objDetalle);
}
