package com.javaaccountstatement.poc.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String username;
  private Date created_at;
  private Date updated_at;

  public User() {
  }

  public User(int id, String username, Date created_at, Date updated_at) {
    this.setId(id);
    this.setCreated_at(created_at);
    this.setUpdated_at(updated_at);
    this.setUsername(username);
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  public Date getCreated_at() {
    return this.created_at;
  }

  public void setCreated_at(Date created_at) {
    this.created_at = created_at;
  }

  public Date getUpdated_at() {
    return this.updated_at;
  }

  public void setUpdated_at(Date updated_at) {
    this.updated_at = updated_at;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
