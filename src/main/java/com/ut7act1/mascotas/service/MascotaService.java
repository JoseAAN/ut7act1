package com.ut7act1.mascotas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ut7act1.mascotas.model.Mascota;
import com.ut7act1.mascotas.repository.MascotaRepository;

@Service
public class MascotaService {

    private final MascotaRepository mascotaRepository;
    
    public MascotaService(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }
    public List<Mascota> listarMascotas(){return mascotaRepository.findAll();}
    public Mascota buscarMascota(Long id){return mascotaRepository.findById(id).orElse(null);}
    public Mascota registrarMascota(Mascota mascota){return mascotaRepository.save(mascota);}
    public void borrarMascota(Long id ){ mascotaRepository.deleteById(id);}
    public Mascota actualizarMascota(Mascota mascota, Long id){mascota.setId(id); return mascotaRepository.save(mascota);}
}
