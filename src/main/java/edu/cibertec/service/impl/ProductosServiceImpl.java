package edu.cibertec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cibertec.model.Productos;
import edu.cibertec.repositories.ProductosRepository;
import edu.cibertec.service.ProductosService;

@Service
public class ProductosServiceImpl implements ProductosService {

	@Autowired
	private ProductosRepository produRepo;

	
	
	@Override
	public Productos obtenerProductos(int idpedido) {
		// TODO Auto-generated method stub
		return produRepo.findById(idpedido).orElse(null);
	}

	@Override
	public List<Productos> listaProductos() {
		// TODO Auto-generated method stub
		return produRepo.findAll();
	}

	@Override
	public Productos ingresarProductos(Productos objProductos) {
		// TODO Auto-generated method stub
		return produRepo.save(objProductos);
	}

	@Override
	public Productos actualizarProductos(Productos objProductos) {
		// TODO Auto-generated method stub
		return produRepo.save(objProductos);
	}

	@Override
	public void eliminarProductos(Productos objProductos) {
		// TODO Auto-generated method stub
		produRepo.delete(objProductos);
		
	}
	

}
