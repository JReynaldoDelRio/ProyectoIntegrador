package edu.cibertec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cibertec.model.DetallePedido;
import edu.cibertec.repositories.DetallePedidoRepository;
import edu.cibertec.service.DetallesPedidoService;

@Service
public class DetallePedidoServiceImpl implements DetallesPedidoService {
	
	
	@Autowired
	private DetallePedidoRepository detalleRepo;
	
	@Override
	public DetallePedido obtenerDetalle(int idpedido) {
		
		return detalleRepo.findById(idpedido).orElse(null);
	}

	@Override
	public List<DetallePedido> listaDetalle() {
		// TODO Auto-generated method stub
		return detalleRepo.findAll();
	}

	@Override
	public DetallePedido ingresarDetalle(DetallePedido objDetalle) {
		// TODO Auto-generated method stub
		return detalleRepo.save(objDetalle);
	}

	@Override
	public DetallePedido actualizarDetalle(DetallePedido objDetalle) {
		// TODO Auto-generated method stub
		return detalleRepo.save(objDetalle);
	}

	@Override
	public void eliminarDetalle(DetallePedido objDetalle) {
		detalleRepo.delete(objDetalle);
		
	}

}
