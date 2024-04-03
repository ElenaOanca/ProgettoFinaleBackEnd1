package it.epicode.CodeCampus.repository;

import it.epicode.CodeCampus.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByName(String name);







}
