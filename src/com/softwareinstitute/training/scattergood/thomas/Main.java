package com.softwareinstitute.training.scattergood.thomas;

public class Main {

    public static void main(String[] args) {
	// what do books, and dvds have in common
        //titles, release year, length/runtime creator (director/author)

     Book book1 = new Book ("Title: Metro 2033", 2005,"Genre: Post apocalyptic fiction", "Author: Dimitri Gluhovsky", 430);
     Book book2 = new Book ("Fellowship of the Ring", 1954, "Fantasy", "J.R.R. Tolkien,", 423);

     DVD dvd1 = new DVD ("Title: SpiderMan", 2001, "Superhero", "Sam Raimi", 121);

        System.out.println(book1.getTitle());
        System.out.println(book1.getReleaseYear());
        System.out.println(book1.getGenre());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPageCount());

        System.out.println(" ");

        System.out.println(book2.getTitle());
        System.out.println(book2.getReleaseYear());
        System.out.println(book2.getGenre());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getPageCount());

        System.out.println(" ");

        System.out.println(dvd1.getTitle());
        System.out.println(dvd1.getReleaseYear());
        System.out.println(dvd1.getGenre());
        System.out.println(dvd1.getDirector());
        System.out.println(dvd1.getRuntime());
    }
}
