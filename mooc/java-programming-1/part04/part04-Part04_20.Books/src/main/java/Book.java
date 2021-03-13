/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Title: To Kill a Mockingbird
Pages: 281
Publication year: 1960
 * @author Korisnik
 */
public class Book {
    private String title;
    private int pages;
    private int pubYear;

    public Book(String title, int pages, int pubYear) {
        this.title = title;
        this.pages = pages;
        this.pubYear = pubYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getPubYear() {
        return pubYear;
    }

    @Override
    public String toString() {
        String strForm = String.format("%s, %d pages, %d", this.title, this.pages, this.pubYear);
        return strForm;
    }
    
    
}
