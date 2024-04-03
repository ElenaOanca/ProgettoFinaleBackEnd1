package it.epicode.CodeCampus.service;

import it.epicode.CodeCampus.model.Course;
import it.epicode.CodeCampus.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }
    public Course editCourse(Course course) {
        return courseRepository.save(course);
    }

    public void deleteCourseById(Long id) {
        courseRepository.deleteById(id);
    }
}
