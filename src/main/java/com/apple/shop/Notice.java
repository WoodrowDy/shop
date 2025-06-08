package com.apple.shop;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Notice {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  public String title;

  public Date date;
}
