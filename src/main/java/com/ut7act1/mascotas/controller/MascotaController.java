package com.ut7act1.mascotas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ut7act1.mascotas.model.Mascota;
import com.ut7act1.mascotas.service.MascotaService;


@RestController
@RequestMapping("/api/v1/mascotas")
public class MascotaController {

    private final MascotaService mascotaService;

    public MascotaController(MascotaService mascotaService){
        this.mascotaService = mascotaService;
    }

    @GetMapping("/api/v1/mascotas")
    public List<Mascota> listarMascotas() {return mascotaService.listarMascotas();}

    @GetMapping("/api/v1/mascotas/{id}")
    public Mascota buscarMascota(@PathVariable Long id){return mascotaService.buscarMascota(id);}

    @PostMapping
    public Mascota guardarMascota(@RequestBody Mascota mascota){
        return mascotaService.registrarMascota(mascota);
    }

    @DeleteMapping("/api/v1/mascotas/{id}")
    public void borrarMascota(@PathVariable Long id){
        mascotaService.borrarMascota(id);
    }

    @PutMapping("/api/v1/mascotas/{id}")
    public Mascota actualizarMascota(@RequestBody Mascota mascota, @PathVariable Long id){mascota.setId(id); return mascotaService.actualizarMascota(mascota, id);}

}