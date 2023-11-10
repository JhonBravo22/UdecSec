package com.proyecto.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ropa {

  @GetMapping("/ropa")
   public String helloWorld(Model model){
        model.addAttribute("title", "Ropa");
        model.addAttribute("logos", "images/logoropa.png");
        model.addAttribute("banner1", "images/banner1r.jpg");
        model.addAttribute("banner2", "images/banner2r.jpg");
        model.addAttribute("banner3", "images/banner3r.jpg");
        model.addAttribute("introduccion", "La ropa para mascotas no solo es una declaración de estilo, sino también una forma de proporcionar comodidad, protección y calidez a nuestros fieles compañeros peludos,  la moda canina y felina es una tendencia en crecimiento");
        model.addAttribute("nomproducto1", "Ropa De Invierno Para Perros-Frutas");
        model.addAttribute("imagenproducto1", "images/banner1r.jpg");
        model.addAttribute("producto1", " Es una colección encantadora y funcional de prendas diseñadas para mantener a tus amigos peludos abrigados y con estilo durante la temporada de frío.");
        model.addAttribute("nomproducto2", "Mascota Disfraz Gato");
        model.addAttribute("imagenproducto2", "images/banner2r.jpg");
        model.addAttribute("producto2", " Es una adorable prenda diseñada para agregar un toque festivo y encantador a la apariencia de tu gato durante la temporada navideña.");
        model.addAttribute("nomproducto3", "Ropa de marca Lucky Bird para cacatúa");
        model.addAttribute("imagenproducto3", "images/banner3r.jpg");
        model.addAttribute("producto3", " Es mucho más que un simple atuendo, es una declaración de estilo y elegancia para tu querida cacatúa. ");
        model.addAttribute("nomproducto4", "Sueter para Perro ");
        model.addAttribute("imagenproducto4", "images/producto4r.png");
        model.addAttribute("producto4", "es una prenda esencial de la colección de ropa para perros diseñada para mantener a tu compañero peludo abrigado y a la moda durante los días fríos. ");
        return "index";
    }
}