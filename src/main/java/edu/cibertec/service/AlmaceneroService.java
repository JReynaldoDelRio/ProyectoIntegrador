package edu.cibertec.service;

import java.util.List;

import edu.cibertec.model.Almacenero;


public interface AlmaceneroService {

	
	public Almacenero obtenerAlmacenero(int id);
	public List<Almacenero>listarAlmacenero();
	public Almacenero ingresarAlmacenero(Almacenero objAlmacenero);
	public Almacenero actualizarAlmacenero(Almacenero objAlmacenero);
	public void eliminarAlmacenero(Almacenero objAlmacenero);
	
}
