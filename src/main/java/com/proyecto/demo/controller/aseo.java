package com.proyecto.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class aseo {

  @GetMapping("/aseo")
   public String helloWorld(Model model){
        model.addAttribute("title", "Aseo");
        model.addAttribute("logos", "images/logoaseo.png");
        model.addAttribute("banner1", "images/banner1A.jpg");
        model.addAttribute("banner2", "images/banner2A.jpg");
        model.addAttribute("banner3", "images/banner3A.jpg");
        model.addAttribute("introduccion", "El cuidado y aseo de nuestras mascotas es esencial para mantener su salud y bienestar. Los productos de aseo para animales desempeñan un papel fundamental en la rutina de cuidado de nuestras queridas compañeras peludas. Estos productos están diseñados no solo para mantener la apariencia de nuestras mascotas, sino tambi\u00E9n para garantizar su comodidad.");      
        model.addAttribute("nomproducto1", "Rodillo removedor de pelo");
        model.addAttribute("imagenproducto1", "images/imagen1pa.jpg");
        model.addAttribute("producto1", "removedor de pelo de perro y gato con base autolimpiante, herramienta eficiente de depilación de animales, para muebles, sofá, alfombra, asiento de automóvil, azul ");
        model.addAttribute("nomproducto2", "Kit de aseo para mascotas");
        model.addAttribute("imagenproducto2", "images/banner3A.jpg");
        model.addAttribute("producto2", "Kit de aseo para mascotas y recoge al vacío el 99% del pelo de las mascotas, taza grande de polvo de 2 litros, aspiradora de aseo para perros y gatos con 5 herramientas de aseo para mascotas");
        model.addAttribute("nomproducto3", "8 Rollos 120 Bolsas Biodegradables");
        model.addAttribute("imagenproducto3", "images/imagen3pa.png");
        model.addAttribute("producto3", "Las Bolsas Biodegradables para el Aseo de Excremento son una solución respetuosa con el medio ambiente y práctica para la limpieza de desechos de mascotas, como heces de perros o gatos.");
        model.addAttribute("nomproducto4", "Petazy 400 toallitas para perros ");
        model.addAttribute("imagenproducto4", "images/imagen4pa.png");
        model.addAttribute("producto4", "patas y orejas de trasero, toallitas org\u00E1nicas para perros | Toallitas perfumadas para perros | Toallitas para perros perfumadas de lavanda  ");
        return "index";
    }
}