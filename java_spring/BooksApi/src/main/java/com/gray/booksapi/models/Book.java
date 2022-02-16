package com.gray.booksapi.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

//This is the "Domain Model" which represents our business data. (Information we want to know) 
//	I am creating a table in mySQL with the @validation annotations below


// represents an @Entity model for our application
@Entity

//	creating a @Table in the db named "books"
	@Table(name="books")


	public class Book {
//		sets @Id as primary key (PK)
	    @Id
//	    sets as auto-incremeting value
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
//	    adds validation that the column cannot be left null
	    @NotNull
//		adds validation for specified range
	    @Size(min = 5, max = 200)
	    private String title;
	    @NotNull
	    @Size(min = 5, max = 200)
	    private String description;
	    @NotNull
	    @Size(min = 3, max = 40)
	    private String language;
	    @NotNull
//	    adds validation where a column must meet a min requirement 
	    @Min(100)
	    private Integer numberOfPages;
	    // This will not allow the createdAt column to be updated after creation
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    
//	    empty constructor
	    public Book() {
	    }
	    
//	    loaded constructor
	    public Book(String title, String desc, String lang, int pages) {
	        this.title = title;
	        this.description = desc;
	        this.language = lang;
	        this.numberOfPages = pages;
	    }
	    
	    
	    
//		runs the method right before the object is created
	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    
//	    runs method when object is modified
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
	    
	    
	    
//	    getters and setters
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public Integer getNumberOfPages() {
			return numberOfPages;
		}
		public void setNumberOfPages(Integer numberOfPages) {
			this.numberOfPages = numberOfPages;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public Date getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}
	    
	    

}
