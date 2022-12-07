package it.develhope.polymorphism;

public class Animal {

    public String animalName;

    public Animal(String animalName){
        this.animalName = animalName;
    }

    public void animalSound(){
        System.out.print(animalName + " go ");
        System.out.println("Roarr!");
    }

    public void animalSound(String intensity){
        System.out.print(animalName + " go ");
        if(intensity == "high"){
            System.out.println("Roarrrrrr!");
        }else if(intensity == "low"){
            System.out.println("Roar");
        }else System.out.println("Cannot reproduce it properly");
    }
}
