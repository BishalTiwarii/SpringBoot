package com.Internship.LearnSpringBoot.Courses.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {

	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String author;
	
	public Course()
	{
		
	}
	
	public Course(int id, String name, String author) 
	{
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
		
		public long getId() 
		{
			return id;
		}
		public String getName() {
			return name;
		}
		public String getAuthor() {
			return author;
		}
		public String toString()
		{
			return "course [id=" + id +",name= "+name +",author="+author + "]";
		}
	}


