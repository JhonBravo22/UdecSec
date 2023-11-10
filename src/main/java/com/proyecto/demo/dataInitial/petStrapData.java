package com.proyecto.demo.dataInitial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.proyecto.demo.domain.aseoEntity;
import com.proyecto.demo.domain.camasEntity;
import com.proyecto.demo.domain.comidaEntity;
import com.proyecto.demo.domain.juguetesEntity;
import com.proyecto.demo.domain.ropaEntity;
import com.proyecto.demo.repositories.aseoRepositories;
import com.proyecto.demo.repositories.camasRepositories;
import com.proyecto.demo.repositories.comidaRepositories;
import com.proyecto.demo.repositories.juguetesRepositories;
import com.proyecto.demo.repositories.ropaRepositories;

@Component
public class petStrapData implements CommandLineRunner {

    private final camasRepositories camasRepositorio;

    private final comidaRepositories comidaRepositorio;

    private final aseoRepositories aseoRepositorio;

    private final juguetesRepositories juguetesRepositorio;

    private final ropaRepositories ropaRepositorio;

    public petStrapData(camasRepositories camasRepositorio, comidaRepositories comidaRepositorio,
            ropaRepositories ropaRepositorio, aseoRepositories aseoRepositorio,
            juguetesRepositories juguetesRepositorio) {
        this.camasRepositorio = camasRepositorio;
        this.comidaRepositorio = comidaRepositorio;
        this.ropaRepositorio = ropaRepositorio;
        this.aseoRepositorio = aseoRepositorio;
        this.juguetesRepositorio = juguetesRepositorio;

    }

    @Override
    public void run(String... args) throws Exception {
        camasEntity cama1 = new camasEntity("king_cama", "Grande", "King", 350, "negro");
        camasEntity cama2 = new camasEntity("queen_cama", "Grande", "Queen", 300, "blanco");
        camasEntity cama3 = new camasEntity("twin_cama", "Individual", "Twin", 150, "azul");
        camasEntity cama4 = new camasEntity("full_cama", "Grande", "Full", 250, "gris");
        camasEntity cama5 = new camasEntity("king_cama", "Grande", "King", 400, "marrón");
        camasEntity cama6 = new camasEntity("queen_cama", "Grande", "Queen", 320, "rojo");
        camasEntity cama7 = new camasEntity("twin_cama", "Individual", "Twin", 140, "verde");
        camasEntity cama8 = new camasEntity("full_cama", "Grande", "Full", 280, "blanco");
        camasEntity cama9 = new camasEntity("king_cama", "Grande", "King", 370, "azul");
        camasEntity cama10 = new camasEntity("queen_cama", "Grande", "Queen", 310, "gris");
        camasEntity cama11 = new camasEntity("twin_cama", "Individual", "Twin", 160, "negro");
        camasEntity cama12 = new camasEntity("full_cama", "Grande", "Full", 260, "marrón");
        camasEntity cama13 = new camasEntity("king_cama", "Grande", "King", 380, "rojo");
        camasEntity cama14 = new camasEntity("queen_cama", "Grande", "Queen", 330, "verde");
        camasEntity cama15 = new camasEntity("twin_cama", "Individual", "Twin", 170, "blanco");

        camasRepositorio.save(cama1);
        camasRepositorio.save(cama2);
        camasRepositorio.save(cama3);
        camasRepositorio.save(cama4);
        camasRepositorio.save(cama5);
        camasRepositorio.save(cama6);
        camasRepositorio.save(cama7);
        camasRepositorio.save(cama8);
        camasRepositorio.save(cama9);
        camasRepositorio.save(cama10);
        camasRepositorio.save(cama11);
        camasRepositorio.save(cama12);
        camasRepositorio.save(cama13);
        camasRepositorio.save(cama14);
        camasRepositorio.save(cama15);

        comidaEntity comida1 = new comidaEntity("Purina", "2 kg", "Dog chaw", "Pequeña", 6);
        comidaEntity comida2 = new comidaEntity("Royal Canin", "1.5 kg", "Cat Delight", "Pequeña", 8);
        comidaEntity comida3 = new comidaEntity("Hill's Science Diet", "4 kg", "Puppy Formula", "Mediana", 12);
        comidaEntity comida4 = new comidaEntity("Iams", "3.5 kg", "Senior Mix", "Grande", 10);
        comidaEntity comida5 = new comidaEntity("Purina ONE", "2.5 kg", "Kitten Delight", "Pequeña", 7);
        comidaEntity comida6 = new comidaEntity("Hill's Prescription Diet", "2 kg", "Urinary Care", "Mediana", 15);
        comidaEntity comida7 = new comidaEntity("Merrick", "3 kg", "Healthy Weight", "Grande", 9);
        comidaEntity comida8 = new comidaEntity("Blue Buffalo", "4 kg", "Sensitive Stomach", "Pequeña", 11);
        comidaEntity comida9 = new comidaEntity("Eukanuba", "2.5 kg", "Senior Mix", "Mediana", 14);
        comidaEntity comida10 = new comidaEntity("Purina Pro Plan", "3 kg", "Focus Adulto", "Grande", 13);
        comidaEntity comida11 = new comidaEntity("Iams", "2 kg", "Healthy Kitten", "Pequeña", 7);
        comidaEntity comida12 = new comidaEntity("Hill's Science Diet", "5 kg", "Adulto Activo", "Mediana", 11);
        comidaEntity comida13 = new comidaEntity("Royal Canin", "4 kg", "Urinary SO", "Grande", 16);
        comidaEntity comida14 = new comidaEntity("Merrick", "2.5 kg", "Grain-Free", "Pequeña", 9);
        comidaEntity comida15 = new comidaEntity("Blue Buffalo", "3 kg", "Life Protection", "Mediana", 12);

        comidaRepositorio.save(comida1);
        comidaRepositorio.save(comida2);
        comidaRepositorio.save(comida3);
        comidaRepositorio.save(comida4);
        comidaRepositorio.save(comida5);
        comidaRepositorio.save(comida6);
        comidaRepositorio.save(comida7);
        comidaRepositorio.save(comida8);
        comidaRepositorio.save(comida9);
        comidaRepositorio.save(comida10);
        comidaRepositorio.save(comida11);
        comidaRepositorio.save(comida12);
        comidaRepositorio.save(comida13);
        comidaRepositorio.save(comida14);
        comidaRepositorio.save(comida15);

        aseoEntity aseo1 = new aseoEntity("shampoo", "canAmor", "Perro", 10);
        aseoEntity aseo2 = new aseoEntity("acondicionador", "Feline Fresh", "Gato", 8);
        aseoEntity aseo3 = new aseoEntity("cepillo", "Puppy Care", "Perro", 5);
        aseoEntity aseo4 = new aseoEntity("toallitas húmedas", "Kitty Clean", "Gato", 7);
        aseoEntity aseo5 = new aseoEntity("spray desodorante", "Fresh Paws", "Perro", 6);
        aseoEntity aseo6 = new aseoEntity("limpiador de oídos", "Cat Ears", "Gato", 4);
        aseoEntity aseo7 = new aseoEntity("peine", "Golden Groomer", "Perro", 3);
        aseoEntity aseo8 = new aseoEntity("cortaúñas", "Purrfect Nails", "Gato", 5);
        aseoEntity aseo9 = new aseoEntity("champú seco", "Quick Clean", "Perro", 8);
        aseoEntity aseo10 = new aseoEntity("cortaúñas", "Pawfect Trimmer", "Gato", 6);
        aseoEntity aseo11 = new aseoEntity("cepillo de dientes", "Dental Care", "Perro", 4);
        aseoEntity aseo12 = new aseoEntity("peine", "Fur Magic", "Gato", 3);
        aseoEntity aseo13 = new aseoEntity("shampoo", "Shiny Coat", "Perro", 9);
        aseoEntity aseo14 = new aseoEntity("cepillo de dientes", "Fresh Breath", "Gato", 5);
        aseoEntity aseo15 = new aseoEntity("spray desodorante", "Odor Control", "Perro", 7);

        aseoRepositorio.save(aseo1);
        aseoRepositorio.save(aseo2);
        aseoRepositorio.save(aseo3);
        aseoRepositorio.save(aseo4);
        aseoRepositorio.save(aseo5);
        aseoRepositorio.save(aseo6);
        aseoRepositorio.save(aseo7);
        aseoRepositorio.save(aseo8);
        aseoRepositorio.save(aseo9);
        aseoRepositorio.save(aseo10);
        aseoRepositorio.save(aseo11);
        aseoRepositorio.save(aseo12);
        aseoRepositorio.save(aseo13);
        aseoRepositorio.save(aseo14);
        aseoRepositorio.save(aseo15);

        juguetesEntity juguete1 = new juguetesEntity("Hueso natural", "canAmor", "blanco", 2);
        juguetesEntity juguete2 = new juguetesEntity("Pelota de goma", "PetPlay", "rojo", 3);
        juguetesEntity juguete3 = new juguetesEntity("Peluche de pato", "Furry Friends", "amarillo", 4);
        juguetesEntity juguete4 = new juguetesEntity("Cuerda de algodón", "Puppy Fun", "azul", 2);
        juguetesEntity juguete5 = new juguetesEntity("Pelota de tenis", "FetchFrenzy", "verde", 1);
        juguetesEntity juguete6 = new juguetesEntity("Rompecabezas interactivo", "SmartPlay", "naranja", 5);
        juguetesEntity juguete7 = new juguetesEntity("Pelota de cuerda", "Puppy Playtime", "morado", 3);
        juguetesEntity juguete8 = new juguetesEntity("Peluche de gato", "Kitty Cuddles", "gris", 4);
        juguetesEntity juguete9 = new juguetesEntity("Pelota de felpa", "Plush Paws", "rosa", 2);
        juguetesEntity juguete10 = new juguetesEntity("Laberinto de snacks", "Foodie Fun", "verde", 6);
        juguetesEntity juguete11 = new juguetesEntity("Hueso de caucho", "ChewMaster", "azul", 2);
        juguetesEntity juguete12 = new juguetesEntity("Pelota de peluche", "SoftyBall", "amarillo", 3);
        juguetesEntity juguete13 = new juguetesEntity("Rompecabezas de comida", "TreatTrainer", "rojo", 5);
        juguetesEntity juguete14 = new juguetesEntity("Pelota chirriante", "SqueakyJoy", "naranja", 2);
        juguetesEntity juguete15 = new juguetesEntity("Peluche de conejo", "Bunny Buddy", "blanco", 4);

        juguetesRepositorio.save(juguete1);
        juguetesRepositorio.save(juguete2);
        juguetesRepositorio.save(juguete3);
        juguetesRepositorio.save(juguete4);
        juguetesRepositorio.save(juguete5);
        juguetesRepositorio.save(juguete6);
        juguetesRepositorio.save(juguete7);
        juguetesRepositorio.save(juguete8);
        juguetesRepositorio.save(juguete9);
        juguetesRepositorio.save(juguete10);
        juguetesRepositorio.save(juguete11);
        juguetesRepositorio.save(juguete12);
        juguetesRepositorio.save(juguete13);
        juguetesRepositorio.save(juguete14);
        juguetesRepositorio.save(juguete15);


        ropaEntity ropa1 = new ropaEntity("Smoking", "conAmor", "pequeño", 10);
        ropaEntity ropa2 = new ropaEntity("Vestido de verano", "PetStyle", "mediano", 8);
        ropaEntity ropa3 = new ropaEntity("Jersey de lana", "CozyPets", "grande", 12);
        ropaEntity ropa4 = new ropaEntity("Chaqueta impermeable", "RainyDays", "pequeño", 15);
        ropaEntity ropa5 = new ropaEntity("Pijama de franela", "SleepyPaws", "mediano", 7);
        ropaEntity ropa6 = new ropaEntity("Abrigo acolchado", "WarmFur", "grande", 18);
        ropaEntity ropa7 = new ropaEntity("Camiseta de algodón", "CasualCanine", "pequeño", 6);
        ropaEntity ropa8 = new ropaEntity("Vestido de fiesta", "GlamourPets", "mediano", 10);
        ropaEntity ropa9 = new ropaEntity("Sudadera con capucha", "HoodieHounds", "grande", 14);
        ropaEntity ropa10 = new ropaEntity("Traje de baño", "BeachBuddies", "pequeño", 9);
        ropaEntity ropa11 = new ropaEntity("Chaleco de invierno", "WinterWear", "mediano", 13);
        ropaEntity ropa12 = new ropaEntity("Pantalones cortos", "SummerStyle", "grande", 8);
        ropaEntity ropa13 = new ropaEntity("Vestido de flores", "FloralFancy", "pequeño", 11);
        ropaEntity ropa14 = new ropaEntity("Chaqueta de cuero", "LeatherLook", "mediano", 16);
        ropaEntity ropa15 = new ropaEntity("Sudadera a rayas", "StripedStyle", "grande", 12);

        ropaRepositorio.save(ropa1);
        ropaRepositorio.save(ropa2);
        ropaRepositorio.save(ropa3);
        ropaRepositorio.save(ropa4);
        ropaRepositorio.save(ropa5);
        ropaRepositorio.save(ropa6);
        ropaRepositorio.save(ropa7);
        ropaRepositorio.save(ropa8);
        ropaRepositorio.save(ropa9);
        ropaRepositorio.save(ropa10);
        ropaRepositorio.save(ropa11);
        ropaRepositorio.save(ropa12);
        ropaRepositorio.save(ropa13);
        ropaRepositorio.save(ropa14);
        ropaRepositorio.save(ropa15);

        System.out.println("prueba de concepto");
        System.out.println("cantidad de camas:" + camasRepositorio.count());
        System.out.println("cantidad de comidas:" + comidaRepositorio.count());
        System.out.println("cantidad de aseo:" + aseoRepositorio.count());
        System.out.println("cantidad de juguetes:" + juguetesRepositorio.count());
        System.out.println("cantidad de ropa:" + ropaRepositorio.count());

    }

}
