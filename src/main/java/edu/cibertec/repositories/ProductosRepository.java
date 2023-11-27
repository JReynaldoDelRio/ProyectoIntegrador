package edu.cibertec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.cibertec.model.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Integer>{
	
	

}
