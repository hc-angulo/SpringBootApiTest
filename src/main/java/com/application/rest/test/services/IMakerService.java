package com.application.rest.test.services;

import com.application.rest.test.entities.Maker;

import java.util.List;

public interface IMakerService {
        List<Maker> findAll();

        Maker findById(Long id);

        void save(Maker maker);

        void deleteById(Long id);
}
