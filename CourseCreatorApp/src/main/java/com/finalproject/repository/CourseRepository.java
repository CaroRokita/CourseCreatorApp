package com.finalproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.finalproject.domain.Course;


public interface CourseRepository extends JpaRepository<Course, Long>
{
  @Query("select c from Course c where c.user.id = ?#{principal.id} or 1=?#{hasRole('ROLE_ADMIN') ? 1 : 0}")//this allows users to only see their unique profile at least they have a ROLE_ADMIN 
  //not working currently this has a bug! 
  public List<Course> findAll();
}

