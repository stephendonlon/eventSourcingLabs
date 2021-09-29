package com.steve.labs.reactiveLab.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Value
@Builder
@AllArgsConstructor
public class Phone {

  @Id
  String id;
  String model;
  String make;

}
