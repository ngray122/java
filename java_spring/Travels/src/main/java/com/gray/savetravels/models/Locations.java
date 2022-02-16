package com.gray.savetravels.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table (name="place")
public class Locations {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
//	name
	@NotNull
	@Size(min =2, max = 30, message = "Menu item name msut ebe bewtween 2-10 charactwers")
	private String name;
	
	
//	dish
	@NotNull
	@Size(min =2, max = 30, message = "Menu item name msut ebe bewtween 2-10 charactwers")
	private String dishType;
	
	   @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    
	    
	    public Locations() {
	    	
	    }



		public Locations(
				@NotNull @Size(min = 2, max = 30, message = "Menu item name msut ebe bewtween 2-10 charactwers") String name,
				@NotNull @Size(min = 2, max = 30, message = "Menu item name msut ebe bewtween 2-10 charactwers") String dishType) {
			super();
			this.name = name;
			this.dishType = dishType;
		}
		
	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }



		public Long getId() {
			return id;
		}



		public void setId(Long id) {
			this.id = id;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getDishType() {
			return dishType;
		}



		public void setDishType(String dishType) {
			this.dishType = dishType;
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
