package com.example.demo.repositorio;

import com.example.demo.entidad.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudRepository extends JpaRepository<Solicitud,Integer> {
}
