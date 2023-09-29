package com.example.demo.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer numRegistro;
    private String codigo;
    private String funcionario;
    private String direccion;
    private String email;
    private String registro;
    private LocalDate fecha;
    private String equipo;
    private String sistemaOperativo;
    private String procesador;
    private String disco;
    private String ram;
    private String capacidad;
    private String marca;
    private String modelo;
    private String serie;
    private String estado;
    private String observacion;
    private String marcaCase;
    private String modeloCase;
    private String serieCase;
    private String estadoCase;
    private String observacionCase;
    private String marcaMonitor;
    private String modeloMonitor;
    private String serieMonitor;
    private String estadoMonitor;
    private String observacionMonitor;
    private String marcaTeclado;
    private String modeloTeclado;
    private String serieTeclado;
    private String estadoTeclado;
    private String observacionTeclado;
    private String marcaMouse;
    private String modeloMouse;
    private String serieMouse;
    private String estadoMouse;
    private String observacionMouse;
    private String marcaUPS;
    private String modeloUPS;
    private String serieUPS;
    private String estadoUPS;
    private String observacionUPS;
    private String maracParlantes;
    private String modeloParlantes;
    private String serieParlantes;
    private String estadoParlantes;
    private String observacionParlantes;
    private String marcaMemoriaRam;
    private String modeloMemoriaRam;
    private String serieMemoriaRam;
    private String estadoMemoriaRam;
    private String obsercvacionMemoriaRam;
    private String marcaCamara;
    private String modeloCamara;
    private String serieCamara;
    private String estadoCamara;
    private String observacionCamara;
    private String maracaBateriaLaptop;
    private String modeloBateriaLaptop;
    private String serieBateriaLaptop;
    private String estadoBateriaLaptop;
    private String observacionBateriaLaptop;
    private String marcaCargadorPortatil;
    private String modeloCargadorPortatil;
    private String serieCargadorPoratil;
    private String estadoCargadorPortatil;
    private String observacionCargadorPortatil;
    private String marcaMicrofono;
    private String modeloMicrofono;
    private String serieMicrofono;
    private String estadoMicrofono;
    private String observacionMicrofono;
    private String marcaTarjetaRed;
    private String modeloTarjetaRed;
    private String serieTarjetaRed;
    private String estadoTarjetaRed;
    private String observacionTarjetaRed;
    private String funcionalCableMonitor;
    private String estadoCableMonitor;
    private String funcionalTouchpad;
    private String estadoTouchpad;
    private String funcionalLectorCDDVD;
    private String estadoLectorCDDVD;
    private String funcionalLectorTarjetas;
    private String estadoLectorTarjetas;
    private String funcionalPuertoEthernet;
    private String estadoPuertoEthernet;
    private String funcionalPuertoHDMI;
    private String estadoPuertoHDMI;
    private String funcionalPuertoVGA;
    private String estadoPuertoVGA;
    private String funcionalIndicadoresLuminosos;
    private String estadoIndicadoresLuminosos;
    private String funcionalSalidaAudio;
    private String estadoSalidaAudio;
    private String funcionalWifi;
    private String estadoWifi;
    private String trabajoRealizarRecomendaciones;
    private String revisadorPor;
    private String cargoRevisado;
    private String custodioActual;
    private String cargoCustodio;
}
