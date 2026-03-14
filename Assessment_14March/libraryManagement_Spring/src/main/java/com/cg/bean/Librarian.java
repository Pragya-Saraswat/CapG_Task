package com.cg.bean;

public class Librarian {
    private int librarianId;
    private String name;
    private Book book;

    public Librarian(){}
    public Librarian( String name, Book book) {

        this.name = name;
        this.book = book;
    }

    public int getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(int librarianId) {
        this.librarianId = librarianId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                ", name='" + name + '\'' +
                ", book=" + book +
                '}';
    }

    public void issueBook(){
        System.out.println("Book Details:");
        System.out.println("Librarian Name: " + getName());
        System.out.println("Issue Book Details:");
        System.out.println(getBook());
    }
}
