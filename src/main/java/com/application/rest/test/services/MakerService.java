package com.application.rest.test.services;

import com.application.rest.test.entities.Maker;
import com.application.rest.test.repositories.IMakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MakerService implements IMakerService{
    @Autowired
    IMakerRepository makerRepository;
    @Override
    public List<Maker> findAll() {
        List<Maker> makers = (List<Maker>)makerRepository.findAll();
        return makers;
    }

    @Override
    public Maker findById(Long id) {
        Maker maker = makerRepository.findById(id).orElse(null);
        return maker;
    }

    @Override
    public void save(Maker maker) {
        makerRepository.save(maker);
    }

    @Override
    public void deleteById(Long id) {
        makerRepository.deleteById(id);
    }

   /* @Override
    public void edit(Long id,String name) {
        Maker maker = makerRepository.findById(id).orElse(null);
        maker.setName(name);
        makerRepository.save(maker);
    }*/
    public void edit(Long id,String name) {
        Maker maker = this.findById(id);
        maker.setName(name);
        this.save(maker);
    }

}
