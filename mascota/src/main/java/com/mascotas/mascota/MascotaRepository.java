package com.mascotas.mascota;

import org.springframework.data.repository.CrudRepository;

import com.mascotas.mascota.Mascota;

public interface MascotaRepository extends CrudRepository<Mascota,Integer> {
    
}
