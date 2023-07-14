package io.zipcoder.polymorphism;

public class Dinosaur extends Pet {

    public Dinosaur(){

        super("Little Foot");}


    public Dinosaur(String name){

        super(name);
    }


    public String speak (){
        return "RAWRRR";
    }
}
