package com.mx.collection.mypetclinic.service;

import com.mx.collection.mypetclinic.model.Owner;
import com.mx.collection.mypetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
