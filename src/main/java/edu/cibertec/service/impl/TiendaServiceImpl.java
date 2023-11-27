package edu.cibertec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cibertec.model.Tienda;
import edu.cibertec.repositories.TiendaRepository;
import edu.cibertec.service.TiendaService;

@Service
public class TiendaServiceImpl  implements TiendaService {
	
	
	@Autowired
	private TiendaRepository tiendaRepo;
	
	@Override
	public Tienda obtenerTienda(int idtienda){
	
		return tiendaRepo.findById(idtienda).orElse(null);
	}

	@Override
	public List<Tienda> listaTienda() {
	
		return tiendaRepo.findAll();
	}

	@Override
	public Tienda ingresarTienda(Tienda objTienda) {
		
		return tiendaRepo.save(objTienda);
	}

	@Override
	public Tienda actualizarTienda(Tienda objTienda) {
		// TODO Auto-generated method stub
		return tiendaRepo.save(objTienda);
	}

	@Override
	public void eliminarTienda(Tienda objTienda) {
		tiendaRepo.delete(objTienda);
		
	}
	
	

}
