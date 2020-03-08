package com.mx.collection.mypetclinic.map;

import com.mx.collection.mypetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService <T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){
        if(object.getId() == null){
            // get and set the next ID
            object.setId(getNextId());
        }
        map.put(object.getId(), object);

        return object;
    }

    void deleteById(ID id){
        map.remove(id, findById(id));
    }

    void delete(T object){
        map.remove(object);
    }

    private Long getNextId(){

        if(map.isEmpty()){
            return 1L;
        } else {
            return Collections.max(map.keySet()) + 1;
        }
    }
}
