package edu.cibertec.service;

import java.util.List;

import edu.cibertec.model.Productos;

public interface ProductosService {
	
	public Productos obtenerProductos(int idpedido);
	public List<Productos>listaProductos();
	public Productos ingresarProductos(Productos objProductos);
	public Productos actualizarProductos(Productos objProductos);
	public void eliminarProductos(Productos objProductos);
}
