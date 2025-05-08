package com.ut7act1.mascotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ut7act1.mascotas.model.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {
    
}
