package com.Internship.LearnSpringBoot.Courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Internship.LearnSpringBoot.Courses.Bean.*;


public interface CourseRepository extends JpaRepository<Course,Long>
{

}
