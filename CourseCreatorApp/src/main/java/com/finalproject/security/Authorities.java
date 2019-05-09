package com.finalproject.security;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.security.core.GrantedAuthority;
import com.finalproject.domain.User;

@Entity
public class Authorities implements GrantedAuthority
{
  private static final long serialVersionUID = 4065375140379002510L;
  private Long id;
  private User user;
  private String authority;
  
  @Id
  @GeneratedValue
  public Long getId()
  {
    return id;
  }
  public void setId(Long id)
  {
    this.id = id;
  }
  
  @ManyToOne
  public User getUser()
  {
    return user;
  }
  public void setUser(User user)
  {
    this.user = user;
  }
  public String getAuthority()
  {
    return authority;
  }
  public void setAuthority(String authority)
  {
    this.authority = authority;
  }
  
  
}
