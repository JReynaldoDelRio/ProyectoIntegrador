package edu.cibertec.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.cibertec.model.Almacenero;

@Repository
public interface AlmaceneroRepository extends JpaRepository<Almacenero, Integer> {
	
	public Optional<Almacenero>findByIdalmacenero(int idalmacenero);
}
