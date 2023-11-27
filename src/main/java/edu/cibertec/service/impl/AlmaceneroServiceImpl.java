package edu.cibertec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cibertec.model.Almacenero;
import edu.cibertec.repositories.AlmaceneroRepository;
import edu.cibertec.service.AlmaceneroService;

@Service
public class AlmaceneroServiceImpl implements AlmaceneroService{
	
	@Autowired
	private AlmaceneroRepository repoAlmacenero;
	
	@Override
	public Almacenero obtenerAlmacenero(int id) {
		// TODO Auto-generated method stub
		return repoAlmacenero.findByIdalmacenero(id).orElse(null);
	}

	@Override
	public List<Almacenero> listarAlmacenero() {
		// TODO Auto-generated method stub
		return repoAlmacenero.findAll();
	}

	@Override
	public Almacenero ingresarAlmacenero(Almacenero objAlmacenero){
		
		return repoAlmacenero.save(objAlmacenero);
	}

	@Override
	public Almacenero actualizarAlmacenero(Almacenero objAlmacenero) {
		
		return repoAlmacenero.save(objAlmacenero);
	}

	@Override
	public void eliminarAlmacenero(Almacenero objAlmacenero) {
		repoAlmacenero.delete(objAlmacenero);	
	}

}
