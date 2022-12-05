package com.javaaccountstatement.poc.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "finance_products")
public class FinanceProduct {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private Date created_at;
  private Date updated_at;
  private int user_id;

  public FinanceProduct() {
  }

  public FinanceProduct(int id, Date created_at, Date updated_at, int user_id) {
    this.id = id;
    this.created_at = created_at;
    this.updated_at = updated_at;
    this.user_id = user_id;
  }
  
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
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

  public int getUser_id() {
    return this.user_id;
  }

  public void setUser_id(int user_id) {
    this.user_id = user_id;
  }

}
