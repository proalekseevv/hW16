import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int year;
    public  Book (String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Author getAuthor () {
        return this.author;
    }

    public String getTitle () {
        return this.title;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return "Название книги: " + this.title + " Автор книги: " + this.author + " Дата издания: " + this.year ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }
}