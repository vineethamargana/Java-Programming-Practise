package com.tap.entity;

import jakarta.persistence.*;

@Entity
@Table(name="books")
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bid")
	private int id;
	@Column(name = "title")
	private String title;
	
	@ManyToOne
	@JoinColumn(name ="author_id")
	private Author author;
	
	public Books(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Books(String title) {
		super();
		this.title = title;
	}
	public Books() {
		super();
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", title=" + title + "]";
	}
	
	
	
	
	

}
