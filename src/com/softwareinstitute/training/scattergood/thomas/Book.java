package com.softwareinstitute.training.scattergood.thomas;

public  class Book extends LibraryContents {

    //////////////////////////Attributes////////////////////////
    private int PageCount;
    private String Author;



    /////////////////////////Constructors///////////////////////

    public Book(int pageCount, String author, String Title) {
        PageCount = pageCount;
        Author = author;
        Title = Title;


    ////////////////////////Methods/////////////////////////////

    public String getAuthor(){
        return Author;
        }

        public void setAuthor(String Author){
            this.Author=Author;



    public author (String Author){
        System.out.println("The author of the book is " + Author);
    }

    public int getPageCount(){
        return PageCount;
    }

    public void setPageCount(){
        this.PageCount = PageCount;
    }
}
