package com.application.rest.test.repositories;

import com.application.rest.test.entities.Maker;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMakerRepository extends CrudRepository<Maker,Long> {

}
