package it.epicode.CodeCampus.controller;

import it.epicode.CodeCampus.model.Course;
import it.epicode.CodeCampus.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping
@CrossOrigin
public class CourseController {

  //  private final CourseService courseService;

    @Autowired
    CourseService courseService;
    /*public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }*/

   
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
    	//'Access-Control-Allow-Origin', '*'
    	//'Access-Control-Allow-Methods', 'GET,POST,OPTIONS,DELETE,PUT'
    	return courseService.getAllCourses();
       /* List<Course> courses = courseService.getAllCourses();
        
        ResponseEntity<List<Course>> res = new RepsonseEntity<List<Course>>(courses, HttpStatus.OK);
        
        return new ResponseEntity<List<Course>>(courses, HttpStatus.OK);*/
    }

  
    @GetMapping("courses/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable Long id) {
        Optional<Course> course = courseService.getCourseById(id);
        return course.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/admin/courses")
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        Course createdCourse = courseService.createCourse(course);
        return new ResponseEntity<>(createdCourse, HttpStatus.CREATED);
    }
    
    @PutMapping("/admin/courses")
    public ResponseEntity<Course> editCourse(@RequestBody Course course) {
        Course createdCourse = courseService.editCourse(course);
        return new ResponseEntity<>(createdCourse, HttpStatus.CREATED);
    }

    @DeleteMapping("/admin/courses/{id}")
    public ResponseEntity<Void> deleteCourseById(@PathVariable Long id) {
        courseService.deleteCourseById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
