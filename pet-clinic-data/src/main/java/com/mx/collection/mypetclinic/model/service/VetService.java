package com.mx.collection.mypetclinic.model.service;

import com.mx.collection.mypetclinic.model.Owner;
import com.mx.collection.mypetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
