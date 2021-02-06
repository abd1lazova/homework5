package com.company;

public class Dog {
    String breed, name;
    int age;

    public Dog(){
    }


    public Dog(String breed, String name, int age){
        this.breed = breed;
        this.name = name;
        this.age = age;
    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Dog(String breed){
        this.breed = breed;
    }

    public void PrintInfo(){
        System.out.println(name + " " + breed + " " + age);
    }
}
