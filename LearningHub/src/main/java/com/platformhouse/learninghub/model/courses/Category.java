package com.platformhouse.learninghub.model.courses;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryId;
	private String categoryName;
	private short active;

	
	
	
	

}
