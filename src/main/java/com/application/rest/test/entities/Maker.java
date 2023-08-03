package com.application.rest.test.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="fabricante")
public class Maker {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
   @Column(name="nombre")
  private  String name;
   @OneToMany(mappedBy = "maker")
   @JsonIgnore
   private List<Product> productsList;
}
