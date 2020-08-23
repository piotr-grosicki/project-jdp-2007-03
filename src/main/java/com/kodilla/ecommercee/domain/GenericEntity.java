package com.kodilla.ecommercee.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class GenericEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  public GenericEntity() {
  }

  public Long getId() {

    return id;
  }
}

