package com.application.rest.test.controllers;

import com.application.rest.test.entities.Maker;
import com.application.rest.test.services.IMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/maker")

public class MakerController {
    @Autowired
    IMakerService makerService;
    @GetMapping("/find")
    public List<Maker> findAll(){
       return makerService.findAll();
    }
    @PostMapping("/create")
    public String createMaker(@RequestBody Maker maker){
        makerService.save(maker);
        return "Fabricante creado exitosamente";
    }


}
