package com.proyecto.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class juguetes {

  @GetMapping("/juguetes")
   public String helloWorld(Model model){
        model.addAttribute("title", "Juguetes");
        model.addAttribute("logos", "images/logojuguetes.png");
        model.addAttribute("banner1", "images/banner1j.jpg");
        model.addAttribute("banner2", "images/banner2j.jpg");
        model.addAttribute("banner3", "images/banner3j.jpg");
        model.addAttribute("introduccion", "Los juguetes para mascotas son mucho más que simples objetos de entretenimiento. Son herramientas esenciales para mantener la mente activa y el cuerpo saludable de nuestros amigos peludos. ");
        model.addAttribute("nomproducto1", "Juguete para perros");
        model.addAttribute("imagenproducto1", "images/producto1j.png");
        model.addAttribute("producto1", "Fabricamos un producto nuevo pensando especialmente en ti y en tu MASCOTA, ya que sabemos lo importante que ellos son para nosotros, un integrante mas en la familia que hay que consentir y hacerlo sentir especial.");
        model.addAttribute("nomproducto2", "Rascador para gatos");
        model.addAttribute("imagenproducto2", "images/producto2j.png");
        model.addAttribute("producto2", " Es el accesorio perfecto para consentir a tu felino favorito y mantenerlo entretenido mientras cuida de sus garras. ");
        model.addAttribute("nomproducto3", "3 Piezas De Juguetes Para Hámster");
        model.addAttribute("imagenproducto3", "images/producto3j.png");
        model.addAttribute("producto3", "Este conjunto de juguetes para hámster es una adición perfecta para el enriquecimiento y la diversión de tu pequeña mascota. Cada pieza está diseñada pensando en el bienestar y el entretenimiento de tu hámster");
        model.addAttribute("nomproducto4", "Juguete Kanu Peluche");
        model.addAttribute("imagenproducto4", "images/producto4j.png");
        model.addAttribute("producto4", "Este juguete para perros, es ideal para soportar las mordidas más fuertes y a su vez es amigable con el medio ambiente, pues el material en que está hecho es ecológico y orgánico, proveniente de la savia del árbol de caucho");
        return "index";
    }
}