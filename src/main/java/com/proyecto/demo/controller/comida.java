package com.proyecto.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class comida {

  @GetMapping("/comida")
   public String helloWorld(Model model){
        model.addAttribute("title", "Comida");
        model.addAttribute("logos", "images/logocomidas.png");
        model.addAttribute("banner1", "images/banner1Co.jpg");
        model.addAttribute("banner2", "images/banner2Co.jpg");
        model.addAttribute("banner3", "images/banner3Co.JPG");
        model.addAttribute("introduccion", "La alimentación adecuada es un pilar fundamental en la salud y el bienestar de nuestras mascotas. Elegir la comida correcta para nuestros compañeros peludos es esencial para garantizar que reciban los nutrientes necesarios para vivir una vida feliz y saludable.");
        model.addAttribute("nomproducto1", "Dog Chow Perros Senior ");
        model.addAttribute("imagenproducto1", "images/producto1co.png");
        model.addAttribute("producto1", "El concentrado Purina Dog Chow Edad Madura es un concentrado especialmente creado para proporcionar una nutrición óptima y adecuada a perros en etapa senior de todas las razas.");
        model.addAttribute("nomproducto2", "Comida para gatos mirringo");
        model.addAttribute("imagenproducto2", "images/producto2co.png");
        model.addAttribute("producto2", "La Comida para Gatos Mirringo es una opción de alimentación de alta calidad especialmente formulada para satisfacer las necesidades nutricionales de los gatos de todas las edades y razas.");
        model.addAttribute("nomproducto3", "Pouch gatos whiskas atun");
        model.addAttribute("imagenproducto3", "images/producto3co.png");
        model.addAttribute("producto3", "Los Pouch Gatos Whiskas Atún son una deliciosa opción de comida húmeda diseñada para satisfacer el paladar exigente de tu gato. ");
        model.addAttribute("nomproducto4", "Comida para perro Hills Metabolic ");
        model.addAttribute("imagenproducto4", "images/producto4co.png");
        model.addAttribute("producto4", "Hills metabolic formulado especialmente para apoyar en el manejo del peso de su perro, con alto contenido de fibra para generar sensación de saciedad ");
        return "index";
    }
}
