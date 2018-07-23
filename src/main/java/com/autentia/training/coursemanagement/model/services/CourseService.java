package com.autentia.training.coursemanagement.model.services;

import java.util.List;


import com.autentia.training.coursemanagement.model.entities.Course;
import com.autentia.training.coursemanagement.model.exceptions.EntityNotFoundException;

public interface CourseService {

	public Course create(Course course);
	public Course update(Long id, Course course) throws EntityNotFoundException;
	public void delete(Long id) throws EntityNotFoundException;
	public List<Course> findAll();
	public Course findOne(Long id) throws EntityNotFoundException;
}
