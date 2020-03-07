package com.mx.collection.mypetclinic.model.service;

import com.mx.collection.mypetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
