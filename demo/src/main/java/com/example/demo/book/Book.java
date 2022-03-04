package com.example.demo.book;

import com.example.demo.author.Author;

import javax.persistence.*;

@Entity(name = "Book")
@Table(
        name = "Book",
        uniqueConstraints = {
                @UniqueConstraint(name = "ISBN_unique", columnNames = "ISBN")
        }
)
public class Book
{
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "ISBN", nullable = false)
    private String ISBN;

    @Column(nullable = false)
    private String title;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="author_id", referencedColumnName = "id")
    @Column(nullable = false)
    private Author author;

    @Column(nullable = false)
    private String genre;
    private String description;

    @Column(nullable = false)
    private String publisher;

    @Column(nullable = false)
    private int year_published;

    @Column(nullable = false)
    private double price;
    private int sales;
    private double rating;

    public Book() {
        this.sales = 0;
    }

    public Book(String ISBN, String title, String author, String genre, String description, String publisher, int year_published, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.description = description;
        this.publisher = publisher;
        this.year_published = year_published;
        this.price = price;
        this.sales = 0;
    }

    public Book(String ISBN, String title, String author, String genre, String publisher, int year_published, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.year_published = year_published;
        this.price = price;
        this.sales = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear_published() {
        return year_published;
    }

    public void setYear_published(int year_published) {
        this.year_published = year_published;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSales() {
        return sales;
    }

    public void incrementSales(int sales) {
        this.sales++;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year_published=" + year_published +
                ", price=" + price +
                ", sales=" + sales +
                ", rating=" + rating +
                '}';
    }
}
