package com.springrest.springrest.Da;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.Course;

public interface CourseDa extends JpaRepository<Course, Long> {
	

}
