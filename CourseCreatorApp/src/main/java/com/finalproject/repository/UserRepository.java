package com.finalproject.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalproject.domain.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
  public User findUserByEmail(String email);//@Query(value= select * from users where email = ?
}
