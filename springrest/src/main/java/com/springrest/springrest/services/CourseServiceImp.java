package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Course;

@Service
public class CourseServiceImp implements CourseService {

	@Autowired
	private com.springrest.springrest.Da.CourseDa CourseDa;
	//List<Course> list;
	
	public CourseServiceImp() {
	
		
	//	list=new ArrayList<>();
	//	list.add(new Course(123,"AI","Artificial Intelligence"));
	//	list.add(new Course(456,"ML","Machine Learning"));
		
		
		
	}
	@Override
	public List<Course> GetCourses() {
		
		
		return CourseDa.findAll();
	}
	@Override
	public Course GetCourse(long courseId) {

	//	Course c=null;
	//	for(Course course:list)
	//	{
	//		if(course.getId()==courseId)
	//		{
	//			c=course;
	//			break;
	//		}
	//	}
		
		return CourseDa.getOne(courseId);
	}
	@Override
	public Course addCourse(Course course) {
		
	//	list.add(course);
		CourseDa.save(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
		
	//	list.forEach(e -> {
	//		if(e.getId() == course.getId()) {
	//			e.setTitle(course.getTitle());
	//			e.setDescription(course.getDescription());
	//		}
	//	});
		
		CourseDa.save(course);
		return course;
	}
	@Override
	public void deleteCourse(long parseLong) {
	//	list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity = CourseDa.getOne(parseLong);
		CourseDa.delete(entity);
	}

	
	

}
