package br.com.fiap.gmimports.cars;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CarsService {

    private final CarsRepository carsRepository;

    public CarsService(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    public List<Cars> findAll() {
        return carsRepository.findAll();
    }

}
