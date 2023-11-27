package edu.cibertec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cibertec.model.Proveedor;
import edu.cibertec.repositories.ProveedorRepository;
import edu.cibertec.service.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService {
	
	@Autowired
	private ProveedorRepository proveRepo;
	

	@Override
	public Proveedor obtenerProveedor(int idproveedor) {
		// TODO Auto-generated method stub
		return proveRepo.findById(idproveedor).orElse(null);
	}

	@Override
	public List<Proveedor> listaProveedor() {
		// TODO Auto-generated method stub
		return proveRepo.findAll();
	}

	@Override
	public Proveedor ingresarProveedor(Proveedor objProveedor) {
		// TODO Auto-generated method stub
		return proveRepo.save(objProveedor);
	}

	@Override
	public Proveedor actualizarProveedor(Proveedor objProveedor) {
		// TODO Auto-generated method stub
		return proveRepo.save(objProveedor);
	}

	@Override
	public void eliminarProveedor(Proveedor objProveedor) {
		// TODO Auto-generated method stub
		proveRepo.delete(objProveedor);
		
	}

}
