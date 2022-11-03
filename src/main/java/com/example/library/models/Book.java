package com.example.library.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;
    @NotEmpty(message = "Please enter a tittle for book")
    @Size(min = 2, max = 100,message = "tittle must be from 2 to 100 digits")
    private String tittle;

    @NotEmpty(message = "Please enter the author")
    @Size(min = 2, max = 100,message = "author must be from 2 to 100 digits")
    private String author;

    @Min(value = 1500,message = "year of book must be greater than 1500")
    private int year;

    public Book(){}

    public Book(String tittle, String author, int year) {
        this.tittle = tittle;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
