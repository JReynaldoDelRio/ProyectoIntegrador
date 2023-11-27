package edu.cibertec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cibertec.model.Pedido;
import edu.cibertec.repositories.PedidoRepository;
import edu.cibertec.service.PedidosService;


@Service
public class PedidoServiceImpl implements PedidosService{
	
	@Autowired
	private PedidoRepository pediRepo;

	
	@Override
	public Pedido obtenerPedido(int idpedido) {
		// TODO Auto-generated method stub
		return pediRepo.findById(idpedido).orElse(null);
	}

	@Override
	public List<Pedido> listPedido() {
		// TODO Auto-generated method stub
		return pediRepo.findAll();
	}

	@Override
	public Pedido ingresarPedido(Pedido objPedido) {
		// TODO Auto-generated method stub
		return pediRepo.save(objPedido);
	}

	@Override
	public Pedido actualizarPedido(Pedido objPedido) {
		// TODO Auto-generated method stub
		return pediRepo.save(objPedido);
	}

	@Override
	public void eliminarPedido(Pedido objPedido) {
		// TODO Auto-generated method stub
		pediRepo.delete(objPedido);
	}

}
