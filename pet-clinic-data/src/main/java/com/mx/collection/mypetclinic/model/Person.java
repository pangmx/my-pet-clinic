package com.mx.collection.mypetclinic.model;

import lombok.Builder;
import lombok.Data;

@Data
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;
}
