package com.platformhouse.learninghub.model.courses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CourseGroup {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long groupId;
	@Column(length = 50)
	private String groupName;
	@ManyToOne
	@JoinColumn(name="category_fk")
	private Category courseCategory;

}
