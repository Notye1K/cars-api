package com.aceleracao.cars.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aceleracao.cars.DTO.CarsDTO;

@RestController
@RequestMapping("api/cars")
public class CarsController {
    
    @PostMapping
    public void post(@RequestBody CarsDTO req){
        System.out.println("ano modelo: " + req.anoModelo() + "\ndata fabricacao: " + req.dataFabricacao());
    }
}
