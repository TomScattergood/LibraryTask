package com.softwareinstitute.training.scattergood.thomas;

public class Main {

    public static void main(String[] args) {
	// what do books, and dvds have in common
        //titles, release year, length/runtime creator (director/author)

     Book book1 = new Book (430, "Dimitri Gluhovsky", "Metro 2033");
     Book book2 = new Book (2, "person", "book");


        System.out.println(book1.getCreator());
    }
}
