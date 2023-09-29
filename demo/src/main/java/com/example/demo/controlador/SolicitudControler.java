package com.example.demo.controlador;

import com.example.demo.entidad.Solicitud;
import com.example.demo.repositorio.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class SolicitudControler {
    @Autowired
    SolicitudRepository solicitudRepository;

    @GetMapping("/solicitudes")
    public String solicitud(Model model){
        List<Solicitud> solicitudes = solicitudRepository.findAll();
        model.addAttribute("solicitudes", solicitudes);
        return "solicitud/solicitud";
}
    @GetMapping("/solicitud/formulario")
    public String form(Model model){
        model.addAttribute("solicitudes",new Solicitud());
        return "solicitud/formularioSolicitud";
    }
    @PostMapping("/solicitud/formulario")
    public String crear(Solicitud solicitud){
        solicitudRepository.save(solicitud);
        return "redirect:/solicitudes";
    }
    @GetMapping("solicitud/editar/{numRegistro}")
    public String editar(@PathVariable Integer numRegistro,Model model){
        Optional<Solicitud> solicitudes = solicitudRepository.findById(numRegistro);
        return "redirect:/solicitud/formulario";
    }
    @GetMapping("/solicitud/eliminar/{numRegistro}")
    public String eliminar(@PathVariable Integer numRegistro){
        solicitudRepository.deleteById(numRegistro);
        return "redirect:/solicitudes";
    }
}
