package it.develhope.polymorphism;

import it.develhope.polymorphism.Entities.Coccodrillo;
import it.develhope.polymorphism.Entities.Koala;
import it.develhope.polymorphism.Entities.Lion;

public class Main {
    public static void main(String[] args) {

        Animal lion = new Lion("Marcello il leone");
        Animal lion1 = new Lion("Pippo il leone codardo");

        Animal coccodrillo = new Coccodrillo("Gianni il coccodrillo");
        Animal koala = new Koala("Franco il koala");

        lion.animalSound("high");
        lion1.animalSound();

        coccodrillo.animalSound(" ");
        koala.animalSound("low");

    }
}
