package com.mx.collection.mypetclinic.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Builder
@Data
@NoArgsConstructor
public class Owner extends Person {
}
