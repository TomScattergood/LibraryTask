package com.softwareinstitute.training.scattergood.thomas;

public class LibraryContents extends Library{

    //////////////////////////Attributes////////////////////////
    private String Title;
    private int length;
    private String author;

    /////////////////////////Constructors///////////////////////
    public LibraryContents (String name){
        super(name);
    }

    ////////////////////////Methods/////////////////////////////

    public String getTitle(){
        return Title;
    }

    public String getAuthor(){
        return author;
    }
}
