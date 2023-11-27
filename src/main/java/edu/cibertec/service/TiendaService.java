package edu.cibertec.service;

import java.util.List;
import edu.cibertec.model.Tienda;

public interface TiendaService {
	
	public Tienda obtenerTienda(int idtienda);
	public List<Tienda>listaTienda();
	public Tienda ingresarTienda(Tienda objTienda);
	public Tienda actualizarTienda(Tienda objTienda);
	public void eliminarTienda(Tienda objTienda);
	
}
