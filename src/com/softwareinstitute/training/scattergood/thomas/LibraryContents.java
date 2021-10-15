package com.softwareinstitute.training.scattergood.thomas;

public class LibraryContents {

    //////////////////////////Attributes////////////////////////

    private String Title;
    private String creator;
    private boolean borrowable;
    private int releaseYear;



    /////////////////////////Constructors///////////////////////

    public void Library(String Title, String creator, int releaseYear, boolean borrowable) {
        this.Title = Title;
        this.creator = creator;
        this.releaseYear = releaseYear;
        this.borrowable = borrowable;
    }

    ////////////////////////Methods/////////////////////////////

    public String getTitle(){
        return Title;
    }

    public void setTitle(){
        this.Title = Title;
    }

    public String getCreator(){
        return creator;
    }

    public void setCreator(){
        this.creator = creator;
    }

    public void title (String title){
        System.out.println("The title of the book is " + title );
    }

    public void creator (String creator){
        System.out.println("The creator of the item is " + creator);
    }

    public void borrow(boolean borrowable){
        System.out.println("This book is " + borrowable);
    }

}
