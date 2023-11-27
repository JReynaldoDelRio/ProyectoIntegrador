package edu.cibertec.service;

import java.util.List;

import edu.cibertec.model.Proveedor;

public interface ProveedorService {
	
	public Proveedor obtenerProveedor(int idproveedor);
	public List<Proveedor>listaProveedor();
	public Proveedor ingresarProveedor(Proveedor objProveedor);
	public Proveedor actualizarProveedor(Proveedor objProveedor);
	public void eliminarProveedor(Proveedor objProveedor);
	
}
