 package com.softwareinstitute.training.scattergood.thomas;

public  class DVD extends LibraryContents {

    private String title;
    private String director;
    private int runtime;
    private int releaseYear;
    private boolean borrowable;




    public DVD(String title, int runtime, String director, int releaseYear, boolean borrowable){
        super (title);
        this.title=title;
        this.runtime=runtime;
        this.director=director;
        this.releaseYear=releaseYear;
        this.borrowable=borrowable;
    }

}
