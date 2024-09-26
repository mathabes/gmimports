package br.com.fiap.gmimports.cars;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepository extends JpaRepository<Cars, UUID> {
}
