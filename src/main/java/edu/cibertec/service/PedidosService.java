package edu.cibertec.service;

import java.util.List;

import edu.cibertec.model.Pedido;

public interface PedidosService {
	
	public Pedido obtenerPedido(int idpedido);
	public List<Pedido>listPedido();
	public Pedido ingresarPedido(Pedido objPedido);
	public Pedido actualizarPedido(Pedido objPedido);
	public void eliminarPedido(Pedido objPedido);
}
