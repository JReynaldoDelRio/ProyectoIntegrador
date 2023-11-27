package edu.cibertec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cibertec.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
