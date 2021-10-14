package com.softwareinstitute.training.scattergood.thomas;

public  class Book extends Library{

    //////////////////////////Attributes////////////////////////
    private int pageCount;
    private String author;
    private boolean borrowable;

    public int releaseYear;
    public String Title;




    /////////////////////////Constructors///////////////////////

    public Book(String Title, int pageCount, String author, int releaseYear, boolean borrowable){
        super(Title);
        this.Title=Title;
        this.pageCount=pageCount;
        this.author=author;
        this.releaseYear=releaseYear;
    }



    ////////////////////////Methods/////////////////////////////
    public void title (String title){
        System.out.println("The title of the book is " + title );
    }

    public void author (String author){
        System.out.println("The author of the book is " + author);
    }

    public void setPageCount (int pageCount){
        System.out.println("The length of this book is " + pageCount);
    }

    public void borrow(boolean borrowable){
        System.out.println("This book is " + borrowable);
    }

    public String getTitle(){
        return Title;
    }
    public void setTitle(String Title){
    this.Title=Title;
    }
}
