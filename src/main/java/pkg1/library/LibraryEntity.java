package pkg1.library;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class LibraryEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String bookTitle;
	private int year;
	private String publisher;
	private String author;
	
	public LibraryEntity() {
		super();
	}

	public LibraryEntity(long id, String bookTitle, int year, String publisher, String author) {
		super();
		this.id = id;
		this.bookTitle = bookTitle;
		this.year = year;
		this.publisher = publisher;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
