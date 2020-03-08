package com.mx.collection.mypetclinic.bootstrap;

import com.mx.collection.mypetclinic.model.Owner;
import com.mx.collection.mypetclinic.model.Vet;
import com.mx.collection.mypetclinic.service.OwnerService;
import com.mx.collection.mypetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService){
        this.ownerService = ownerService;

        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        // load 2 owners
        Owner owner1 = new Owner();
        //owner1.setId(1L);
        owner1.setFirstName("Tom");
        owner1.setLastName("Hanks");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        //owner2.setId(2L);
        owner2.setFirstName("Jimmy");
        owner2.setLastName("Choo");
        ownerService.save(owner2);

        System.out.println("Owners loaded.");

        // load 2 vets
        Vet vet1 = new Vet();
        //vet1.setId(1L);
        vet1.setFirstName("Bobby");
        vet1.setLastName("Cheng");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        //vet2.setId(2L);
        vet2.setFirstName("Jamie");
        vet2.setLastName("Oliver");

        vetService.save(vet2);

        System.out.println("Vets loaded");
        //vetService.findAll().stream().forEach(vet -> System.out.println(vet.getId()));

    }
}
