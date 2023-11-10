package com.proyecto.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class camas {

  @GetMapping("/camas")
   public String helloWorld(Model model){
        model.addAttribute("title", "Camas");
        model.addAttribute("logos", "images/logocamas.png");
        model.addAttribute("banner1", "images/banner1Ca.jpg");
        model.addAttribute("banner2", "images/banner2Ca.jpg");
        model.addAttribute("banner3", "images/banner3Ca.JPG");
        model.addAttribute("introduccion", "Las camas para mascotas son más que un simple lugar para que nuestros amigos peludos descansen. Son refugios acogedores donde encuentran comodidad, seguridad y, sobre todo, amor.");
        model.addAttribute("nomproducto1", "Cama Para Mascotas 78x56x22 ");
        model.addAttribute("imagenproducto1", "images/producto1ca.png");
        model.addAttribute("producto1", "Práctica Cama para Mascotas, con diseño moderno y decorativo que la hace una cama elegante acorde a cualquier espacio del hogar, ideal para perros de razas medianas con un peso no mayor a 35 kilos ");
        model.addAttribute("nomproducto2", "Cama Para Perro Touch Grande");
        model.addAttribute("imagenproducto2", "images/producto2ca.png");
        model.addAttribute("producto2", "La foto de este producto ha sido ambientada, por lo cual no incluye ningún adorno, ni accesorios, ni piezas adicionales ni ningún otro elemento que lo acompañan.");
        model.addAttribute("nomproducto3", "Cama Para Perro Ultra Suave Petizoos 58 cm");
        model.addAttribute("imagenproducto3", "images/producto3ca.png");
        model.addAttribute("producto3", "La foto de este producto ha sido ambientada, por lo cual no incluye ningún adorno, ni accesorios, ni piezas adicionales ni ningún otro elemento que lo acompañan.");
        model.addAttribute("nomproducto4", "Carpa Teepee Para Mascotas Petizoos Azul");
        model.addAttribute("imagenproducto4", "images/producto4ca.png");
        model.addAttribute("producto4", "Carpa ideal para mascotas de razas peque\u00F1as y medianas, f\u00E1cil de armar y de lavar, portable, Producto 100% colombiano.");
        return "index";
    }
}
